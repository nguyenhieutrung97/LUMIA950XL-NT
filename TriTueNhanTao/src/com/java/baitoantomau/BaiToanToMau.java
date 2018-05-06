package com.java.baitoantomau;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaiToanToMau {
	private int n,j=1,mau=0;
	private int[][] b;//mang luu ma tran
	private List<Vertex> vertex;// mang luu dinh
	private List<Vertex> painted;//save vertex which painted
	public void readFile(){
		try {
			FileReader file=new FileReader("D:/file/tomau.txt");
			@SuppressWarnings("resource")
			BufferedReader reader=new BufferedReader(file);
			try {
				n=Integer.parseInt(reader.readLine());
				b=new int[n+1][n+1];
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
	public void swap(int i,int j){
		Vertex temp=vertex.get(i);
		vertex.set(i, vertex.get(j));
		vertex.set(j, temp);
	}
	public void quickSort(int begin,int end){
		int i=begin, t=end;
		Vertex middle=vertex.get((i+t)/2);
		while(i<=t){
			while(vertex.get(i).getDeg()>middle.getDeg()){
				i++;
			}
			while(vertex.get(t).getDeg()<middle.getDeg()){
				t--;
			}
			if(i<=t){
				swap(i, t);
				i++;
				j--;
			}
		}
		if(j>begin){
			quickSort(begin, j);
		}
		if(i<end){
			quickSort(i, end);
		}
	}
	public void sort(){
		quickSort(0, n-1);
	}
	public void out(){
		for(Vertex v: vertex){
			System.out.println(v.toString());
		}
	}
	public boolean check(Vertex v,int currentColor){
		for(Vertex u: vertex){
			if(b[v.getName()][u.getName()]==1 && u.getColor()==currentColor){
				return false;
			}
		}
		return true;
	}
	int color=1;
	public void paint(){
		painted=new ArrayList<>();
		while(painted.size()<n){
			for(int i=0;i<vertex.size();i++){
				if( vertex.get(i).getColor()==0 && check(vertex.get(i), color)){
					vertex.get(i).setColor(color);
					painted.add(vertex.get(i));
				}
			}
			color++;
		}
	}
	
	
	
	public void result () {
		for(Vertex v:painted){
			System.out.println(v.toString());
		}
	}
	public static void main(String[] args) {
		BaiToanToMau bt=new BaiToanToMau();
		bt.readFile();
		bt.sort();
		//bt.out();
		bt.paint();
		bt.result();
	}
}
