package com.java.baitoantomau;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ToMau3 {
	private List<Vertex> painted;
	private List<Vertex> vertex;
	private int[][] b;
	private int n;
	private int j=1;
	private List<Integer> colors=new ArrayList<>();
	public void readFile(){
		try {
			FileReader file=new FileReader("D:/file/tomau.txt");
			@SuppressWarnings("resource")
			BufferedReader reader=new BufferedReader(file);
			try {
				n=Integer.parseInt(reader.readLine());
				b=new int[n+2][n+2];
				vertex=new ArrayList<>();
				String s="";
				while((s=reader.readLine())!=null){
					createMatrix(s);
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void createMatrix(String s) {
		String[] st = s.split(" ");
		int deg=0;//bac cua dinh
		for (int i = 0; i < st.length; i++) {
			if(Integer.parseInt(st[i])!=0){
				deg++;
			}
			b[j][i + 1] = Integer.parseInt(st[i]);
		}
		Vertex v=new Vertex();
		v.setName(j);
		v.setDeg(deg);
		vertex.add(v);
		j++;
	}
	public void out(){
		for(Vertex v: painted){
			System.out.println(v.toString());
		}
	}
	private Vertex findMaxDeg(){
		Vertex maxVertex=vertex.get(0);
		if(maxVertex==null){
			return null;
		}
		int maxDeg=maxVertex.getDeg();
		for(Vertex v:vertex){
			if(v.getDeg()>maxDeg && v.getColor()==0){
				maxVertex=v;
				maxDeg=v.getDeg();
			}
		}
		if(maxVertex.getColor()!=0){
			return null;
		}
		maxVertex.setDeg(0);
		return maxVertex;
	}
	public boolean checkCondition(Vertex v, int currentColor){
		for(Vertex u:vertex){
			if(b[u.getName()][v.getName()]==1 && u.getColor()==currentColor){
				return false;
			}
		}
		return true;
	}
	private int findColor(Vertex v){
		int i=0;														
		while(i<colors.size()){
			int flag=0;
			for(int j=0;j<vertex.size();j++){
				if(b[v.getName()][vertex.get(j).getName()]==1){
					if(vertex.get(j).getColor()==colors.get(i)){
						i++;
						flag=1;
						break;
					}
				}
			}
			if(flag==0){
				return colors.get(i);
			}
		}
		colors.add(colors.get(i-1)+1);//add new color
		return colors.get(i);
	}
	public void downDeg(){
		int color=1;
		colors.add(color);
		painted=new ArrayList<>();
		while(painted.size()<n){
			Vertex v=findMaxDeg();
			if(v==null){
				break;
			}
			int colorUse=findColor(v);
			v.setColor(colorUse);
			for(int i=0;i<vertex.size();i++){
				if(b[vertex.get(i).getName()][v.getName()]==1 && vertex.get(i).getDeg()>0 ){
					vertex.get(i).setDeg(vertex.get(i).getDeg()-1);
				}
			}
			painted.add(v);
		}
		for(int i=0;i<vertex.size();i++){
			Vertex v = new Vertex();
			v=vertex.get(i);
			if(v.getDeg()==0 && v.getColor()==0){
				int colorUse=findColor(v);
				v.setColor(colorUse);
				painted.add(v);
			}
		}
		
	}
	public static void main(String[] args) {
		ToMau3 ex=new ToMau3();
		ex.readFile();
		ex.downDeg();
		ex.out();
	}
	
}
