package com.java.baitoantomau;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaiToanToMau1 {
	private List<Vertex> painted;
	private List<Vertex> vertex;
	private int[][] b;
	private int n;
	private int j=1;
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
		for(Vertex v: vertex){
			System.out.println(v.toString());
		}
	}
	public boolean checkCondition(Vertex v, int currentColor){
		for(Vertex u:vertex){
			if(b[u.getName()][v.getName()]==1 && u.getColor()==currentColor){
				return false;
			}
		}
		return true;
	}
	public void paint(){
		painted=new ArrayList<>();
		int color=1;
		while(painted.size()<n){
			for(int i=0;i<vertex.size();i++){
				if(vertex.get(i).getColor()==0 && checkCondition(vertex.get(i), color)){
					vertex.get(i).setColor(color);
					painted.add(vertex.get(i));
				}
			}
			color++;
		}
	}
	public static void main(String[] args) {
		BaiToanToMau1 bt=new BaiToanToMau1();
		bt.readFile();
		bt.paint();
		bt.out();
	}
}
