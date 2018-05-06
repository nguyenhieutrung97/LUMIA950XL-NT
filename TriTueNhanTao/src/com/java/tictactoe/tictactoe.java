package com.java.tictactoe;

import java.io.Console;

public class tictactoe {
	static int n=3;
	static int matrix[][]={{0,0,0},{0,0,0},{0,0,0}}; //matrix[i][j]=0(chua danh) =1(May)=2(Nguoi choi)
	int turnPlay=1;
	
	public static viTri danh(int playerDich) {
		int playerMe=0;
		if(playerDich==2) {
			playerMe=1;
		}
		else {
			playerMe=2;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		int matrixTam[][]={{-50,-50,-50},{-50,-50,-50},{-50,-50,-50}};
		int BEST1 = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int BEST = -50;
				System.out.println("----------"+matrix[i][j]+"-------------");
				if(matrix[i][j]==1||matrix[i][j]==2) {
					System.out.println("Matrix["+i+"]["+j+"] da duoc danh");
				}
				else {
					matrix[i][j]=playerMe;
					for(int i1=0;i1<n;i1++) {
						for(int j1=0;j1<n;j1++) {
							if(matrix[i1][j1]==1||matrix[i1][j1]==2) {
							}
							else {
								int temp1=tinhDuongMoThang(i1, j1, playerMe);
								matrix[i1][j1]=playerDich;
								int temp2=tinhDuongMoThang(i, j, playerDich);
								matrix[i1][j1]=0;
								int temp=temp2-temp1;
								if(temp>BEST) {
									BEST=temp;
								}
							}
						}
					}
					matrix[i][j]=0;
					System.out.println("----------------------");
					if(BEST1<BEST) {
					matrixTam[i][j]=BEST;
					BEST1=BEST;
					}
					System.out.println("/--"+matrixTam[i][j]+"--/");
					System.out.println("----------------------");
				}
				
			}
		}
		int MAX=Integer.MIN_VALUE; 
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(matrixTam[i][j]!=-50||matrixTam[i][j]>MAX) {
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
	public static int tinhDuongMoThang(int i,int j,int doiThu) {
		int count=0;
		if(((i==n-1)||(i==0))&&((j==n-1)||(j==0))) {
			System.out.println("TRUONG HOP 1");
			int camp[] = {0,0,0};
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
				if(i!=j) {
				for(int temp=0;temp<(n-1);temp++) {
					int temp1;
					if(i<j) {
						temp1=temp;
					}
					else{
						temp1=-temp;
					}
				if(matrix[x1+temp1][yTam]==doiThu&&camp[0]==0) {
					count++;
					camp[0]=1;
				}
				
				if(matrix[xTam][y1-temp1]==doiThu&&camp[1]==0) {
					count++;
					camp[1]=1;
				}
				
				if(matrix[x1+temp1][y1-temp1]==doiThu&&camp[2]==0) {
					count++;
					camp[2]=1;
				} 
				}
				}
				else {
					for(int temp=0;temp<(n-1);temp++) {
						int temp1=0;
						if(i==j&i==0) {
							temp1=temp;
						}
						else{
							temp1=-temp;
						}
					if(matrix[x1+temp1][yTam]==doiThu&&camp[0]==0) {
						count++;
						camp[0]=1;
					}
					
					if(matrix[xTam][y1+temp1]==doiThu&&camp[1]==0) {
						count++;
						camp[1]=1;
					}
					if(matrix[x1+temp1][y1+temp1]==doiThu&&camp[2]==0) {
						count++;
						camp[2]=1;
					} 
					}
				}
			return 3-count;  
		}
		else if(i==n/2&&j==n/2) {
			System.out.println("TRUONG HOP 2");
			int x1=i, y1=j;
			
			if(matrix[x1--][y1--]==doiThu||matrix[x1++][y1++]==doiThu) {
				count++;
			}
			if(matrix[x1--][j]==doiThu||matrix[x1++][j]==doiThu) {
				count++;
			}
			if(matrix[x1--][y1++]==doiThu||matrix[x1++][y1--]==doiThu) {
				count++;
			}
			if(matrix[i][y1++]==doiThu||matrix[i][y1--]==doiThu) {
				count++;
			}
			
			return 4-count;
		}
		else {
			System.out.println("TRUONG HOP 3");
			int x1=i, y1=j;
			if(i==0||i==(n-1)) {
				if(matrix[i][y1--]==doiThu||matrix[i][y1++]==doiThu) {
					count++;
				}
				if(i==0) {
					if(matrix[x1+1][j]==doiThu||matrix[x1+2][j]==doiThu) {
						count++;
					}
				}
				else {
					if(matrix[x1-1][j]==doiThu||matrix[x1-2][j]==doiThu) {
						count++;
					}
				}
			}
			else if(j==0||j==(n-1)) {
				if(matrix[x1--][j]==doiThu||matrix[x1++][j]==doiThu) {
					count++;
				}
				if(j==0) {
					if(matrix[i][y1+1]==doiThu||matrix[i][y1+2]==doiThu) {
						count++;
					}
				}
				else {
					if(matrix[i][y1-1]==doiThu||matrix[i][y1-2]==doiThu) {
						count++;
					}
				}
			}
		}
		return 2-count;
	}
	
	public static String ktraKQ(int playerDich){
		int playerMe;
		if(playerDich==1) {
			playerMe=2;
		}
		else {
			playerMe=1;
		}
		if(matrix[1][1]==matrix[0][0]&&matrix[0][0]==matrix[2][2]&&matrix[2][2]!=0) {
			if(matrix[2][2]==playerDich) {
			return "Person win!!!";
			} else if(matrix[2][2]==playerMe) {
				return "AI win!!!";
			}
		}
		else if(matrix[1][1]==matrix[0][1]&&matrix[0][1]==matrix[2][1]&&matrix[2][1]!=0) {
			if(matrix[2][1]==playerDich) {
			return "Person win!!!";
			} else if(matrix[2][2]==playerMe) {
				return "AI win!!!";
			}
		}
		else if(matrix[1][1]==matrix[0][2]&&matrix[0][2]==matrix[2][0]&&matrix[2][0]!=0) {
			if(matrix[2][0]==playerDich) {
			return "Person win!!!";
			} else if(matrix[2][0]==playerMe) {
				return "AI win!!!";
			}
		}
		else if(matrix[1][1]==matrix[1][2]&&matrix[1][2]==matrix[1][0]&&matrix[1][0]!=0) {
			if(matrix[1][0]==playerDich) {
			return "Person win!!!";
			} else if(matrix[2][2]==playerMe) {
				return "AI win!!!";
			}
		}
		else if(matrix[0][0]==matrix[1][0]&&matrix[1][0]==matrix[2][0]&&matrix[2][0]!=0) {
			if(matrix[2][0]==playerDich) {
			return "Person win!!!";
			} else if(matrix[2][0]==playerMe) {
				return "AI win!!!";
			}
		}
		else if(matrix[0][0]==matrix[0][1]&&matrix[0][1]==matrix[0][2]&&matrix[0][2]!=0) {
			if(matrix[0][2]==playerDich) {
			return "Person win!!!";
			} else if(matrix[0][2]==playerMe) {
				return "AI win!!!";
			}
		}
		else if(matrix[0][2]==matrix[1][2]&&matrix[1][2]==matrix[2][2]&&matrix[2][2]!=0) {
			if(matrix[2][2]==playerDich) {
			return "Person win!!!";
			} else if(matrix[2][2]==playerMe) {
				return "AI win!!!";
			}
		}
		else if(matrix[2][0]==matrix[2][1]&&matrix[2][1]==matrix[2][2]&&matrix[2][2]!=0) {
			if(matrix[2][2]==playerDich) {
			return "Person win!!!";
			} else if(matrix[2][2]==playerMe) {
				return "AI win!!!";
			}
		}
		else {
			int count=0;
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++) {
					if(matrix[i][j]==0)
						count++;
				}
			if(count<=1) {
				return "Even!!!";
			}
		}
		return "Dont No";
		
	}
	


	public static void main(String[] args) {
		System.out.println("Tic Tac Toe");
	}

}
