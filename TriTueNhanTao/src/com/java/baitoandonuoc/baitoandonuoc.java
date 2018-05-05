package com.java.baitoandonuoc;

public class baitoandonuoc {
	public static int x;
	public static int y;
	public static int slNuocCan;
	public static String[][] data= new String[100][3];
	public static int d;
	public static int tam1;
	public static int tam2;
	
	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		baitoandonuoc.x = x;
		tam1=x;
	}

	public static int getY() {
		return y;
	}

	public static void setY(int y) {
		baitoandonuoc.y = y;
		tam2=y;
	}

	public static int getSlNuocCan() {
		return slNuocCan;
	}

	public static void setSlNuocCan(int slNuocCan) {
		baitoandonuoc.slNuocCan = slNuocCan;
	}
	
	
	public static void Luat1() {
		if(y==tam2) {
			System.out.println("Luat 1");
			y=0;
			System.out.println("L1: x="+x+", y="+y);
		}
	}
	
	public static void Luat2() {
		if(x==0) {
			System.out.println("Luat 2");
			x=tam1;
			System.out.println("L2: x="+x+", y="+y);
		}	
	}

	public static void Luat3() {
		if(y<tam2&&x>0) {
			System.out.println("Luat 3: tam2"+tam2);
			while(y<tam2&&x>0){
					x=x-1;
					y=y+1;
					System.out.println("L3: x="+x+", y="+y);
			
			}
		}
	}
	
	public boolean thoaDK() {
		Euclid e=new Euclid();
		int uc=e.USCLN(tam1, tam2);
		System.out.println("Uoc chung"+uc);
		System.out.println("Phan du"+slNuocCan%uc);
		if(slNuocCan<uc) {
			return false;
		}
		else {
			if(slNuocCan%uc==0) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public static void tinhKQ() {
		String t="";
		d=0;
		while(x!=slNuocCan&&y!=slNuocCan) {
			if(y==tam2) {
				data[d][0]=String.valueOf(x);
				data[d][1]=String.valueOf(y);
				Luat1();
				t="Luat 1";
			}
			else if(x==0) {
				data[d][0]=String.valueOf(x);
				data[d][1]=String.valueOf(y);
				Luat2();
				t="Luat 2";
			}
			else if(y<tam2&&x>0) {
				data[d][0]=String.valueOf(x);
				data[d][1]=String.valueOf(y);
				Luat3();
				t="Luat 3";
			}
			data[d][2]=t;
			d++;
			System.out.println("Luat ne:"+t);
		}
		data[d][0]=String.valueOf(x);
		data[d][1]=String.valueOf(y);
	}

	public static void main(String[] args) {
		System.out.println("Bai Toan Do Nuoc");
		setX(10);
		setY(7);
		setSlNuocCan(3);
		tinhKQ();
		System.out.println("Ban du lieu");
		for(int i=0;i<100;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
	}

}
