package com.java.baitoantomaubando;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ToMauBanDo {
	private Vertex vertex[];
	private Vertex vertexFirst[];
	private int matrix[][];
	private int n;
	private int mau=1;

	private void getFile() throws NumberFormatException, IOException {
		FileReader file = new FileReader("C:/Users/trung/Documents/tomaubando/input.txt");
		BufferedReader reader = new BufferedReader(file);
		n = Integer.parseInt(reader.readLine());
		vertexFirst = new Vertex[n];
		matrix=new int[n][n];
		int dem=0;
		String chuoi="";
		while ((chuoi=reader.readLine()) != null) {
			String s[] = chuoi.split(" ");
			int count = 0;
			for (int i = 0; i < s.length; i++) 
				if (Integer.parseInt(s[i]) == 1) {
					count++;
					matrix[dem][i]=Integer.parseInt(s[i]);
				}
			vertexFirst[dem]=new Vertex(0, dem+1, count);
			dem++;
		}
		for(int i=0;i<vertexFirst.length;i++) {
			System.out.println(vertexFirst[i].toString());
		}
		vertex=Arrays.copyOf(vertexFirst, vertexFirst.length);
	}

	private int partition( int left, int right)
	{

		int i = left, j = right;
		Vertex tmp;
		int pivot = vertex[(left + right) / 2].getDegreeTop();

		while (i <= j) {
			while (vertex[i].getDegreeTop() > pivot)
				i++;
			while (vertex[j].getDegreeTop() < pivot)
				j--;
			if (i <= j) {
				tmp = vertex[i];
				vertex[i] = vertex[j];
				vertex[j] = tmp;
				i++;
				j--;
			}
		}
		;

		return i;
	}

	private void quickSort( int left, int right) {
		int index = partition( left, right);
		if (left < index - 1)
			quickSort( left, index - 1);
		if (index < right)
			quickSort( index, right);
	}
	
	public  boolean checkColor(int x,int color) {
		for(int i=0;i<n;i++) {
			System.out.println("matrix["+x+"]["+i+"]="+vertex[x].getColor());
			if(matrix[x][i]==1&&vertexFirst[i].getColor()==color) {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkAllPain() {
		for(int i=0;i<vertex.length;i++) {
			if(vertex[i].getColor()==0)
				return false;
		}
		return true;
	}
	
	private void painMap() throws NumberFormatException, IOException {
		quickSort(0,n-1);
		System.out.println("--------------------VERTEX FIRST------------------------------/");
		for(int i=0;i<vertexFirst.length;i++) {
			System.out.println(vertexFirst[i].toString());
		}
		System.out.println("--------------------------------------------------/");
		displayMap();
		System.out.println("---------------------------");
		while(!checkAllPain()) {
		for(int i=0;i<vertex.length;i++) {
			if(vertex[i].getColor()==0) {
			if(checkColor(vertex[i].getNumber()-1, mau)&&vertex[i].getColor()==0) {
				vertex[i].setColor(mau);
				System.out.println("No set mau");
				System.out.println("Vertex["+i+"]="+vertex[i].getColor());
			}
			}
		}
		mau++;
		}

	}
	
	private void displayMap() {
		for(int i=0;i<vertex.length;i++) {
			System.out.println(vertex[i].toString());
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		ToMauBanDo tmbd=new ToMauBanDo();
		tmbd.getFile();
		tmbd.painMap();
		tmbd.displayMap();
	}
}
