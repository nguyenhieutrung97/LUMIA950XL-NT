package com.java.baitoandonuoc;

public class Euclid {
	public int USCLN(int a,int b) {
		a=Math.abs(a);
		b=Math.abs(b);
		if(a==0||b==0) {
			return a+b;
		}
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			else {
				b=b-a;
			}
		}
		return a;
	}
}
