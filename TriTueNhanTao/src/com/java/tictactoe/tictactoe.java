package com.java.tictactoe;

import java.io.Console;

public class tictactoe {
	static int n=3;
	static int matrix[][]={{0,0,0},{0,0,0},{0,0,0}}; //matrix[i][j]=0(chua danh) =1(May)=2(Nguoi choi)
	int turnPlay=1;
	static int matrixTam[][]={{0,0,0},{0,0,0},{0,0,0}};
	
	public static viTri danh(int playerDich) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j]!=0) {
					System.out.println("Matrix["+i+"]["+j+"]");
					continue;
				}
				else {
					matrixTam[i][j]=tinhDuongMoThang(i, j);
					System.out.println("--"+matrixTam[i][j]+"--");
				}
			}
		}
		int MAX=Integer.MIN_VALUE; 
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(matrixTam[i][j]>MAX) {
					MAX=matrixTam[i][j];
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(matrixTam[i][j]==MAX) {
					matrix[i][j]=1;
					viTri a=new viTri(i, j);
					return a;
				}
			}
		}
		System.out.println("Null");
		return null;
	}
	public static int tinhDuongMoThang(int i,int j) {
		int count=0;
		if(((i==n-1)||(i==0))&&((j==n-1)||(j==0))) {
			int camp[] = {0,0,0};
			for(int tam=0;tam<(n-1);tam++) {
				int x1=i, y1=j;
				int xTam=x1;
				
				if(i==0) {
					x1++;
				}
				else {
					x1--;
				}
				
				int yTam=y1;
				if(j==0) {
					y1++;
				}
				else {
					y1--;
				}
				
				if(matrix[x1][yTam]==2&&camp[1]==0) {
					count++;
					camp[1]=1;
				}
				
				if(matrix[xTam][y1]==2&&camp[2]==0) {
					count++;
					camp[2]=1;
				}
				
				if(matrix[x1][y1]==2&&camp[3]==0) {
					count++;
					camp[3]=1;
				}
				
				return 3-count;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
			}
		}
		else if(i==n/2&&j==n/2) {
			int x1=i, y1=j;
			
			if(matrix[x1--][y1--]==2||matrix[x1++][y1++]==2) {
				count++;
			}
			if(matrix[x1--][j]==2||matrix[x1++][j]==2) {
				count++;
			}
			if(matrix[x1--][y1++]==2||matrix[x1++][y1--]==2) {
				count++;
			}
			if(matrix[i][y1++]==2||matrix[i][y1--]==2) {
				count++;
			}
			
			return 4-count;
		}
		else {
			int x1=i, y1=j;
			if(i==0||i==(n-1)) {
				if(matrix[i][y1--]==2||matrix[i][y1++]==2) {
					count++;
				}
				if(i==0) {
					if(matrix[x1+1][j]==2||matrix[x1+2][j]==2) {
						count++;
					}
				}
				else {
					if(matrix[x1-1][j]==2||matrix[x1-2][j]==2) {
						count++;
					}
				}
			}
			else if(j==0||j==(n-1)) {
				if(matrix[x1--][j]==2||matrix[x1++][j]==2) {
					count++;
				}
				if(j==0) {
					if(matrix[i][y1+1]==2||matrix[i][y1+2]==2) {
						count++;
					}
				}
				else {
					if(matrix[i][y1-1]==2||matrix[i][y1-2]==2) {
						count++;
					}
				}
			}
		}
		return 0;
	}
	


	public static void main(String[] args) {
		System.out.println("Tic Tac Toe");
	}

}
