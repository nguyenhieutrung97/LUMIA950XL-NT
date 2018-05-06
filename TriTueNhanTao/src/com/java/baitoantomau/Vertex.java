package com.java.baitoantomau;



public class Vertex {
	private int name;//ten dinh
	private int deg;//bac cua dinh
	private int color;
	public Vertex(int name, int deg,int color) {
		super();
		this.name = name;
		this.deg = deg;
		this.color=color;
	}
	public Vertex() {
		super();
		this.color=0;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getDeg() {
		return deg;
	}
	public void setDeg(int deg) {
		this.deg = deg;
	}
	
	public String toString(){
		return "Dinh "+this.name+" bac "+this.getDeg()+" mau "+ this.getColor();
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
}
