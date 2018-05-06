package com.java.baitoantomaubando;

public class Vertex {
	private int color;
	private int number;
	private int degreeTop;
	
	public Vertex(int color, int number, int degreeTop) {
		super();
		this.color = color;
		this.number = number;
		this.degreeTop = degreeTop;
	}
	
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getDegreeTop() {
		return degreeTop;
	}
	public void setDegreeTop(int degreeTop) {
		this.degreeTop = degreeTop;
	}
	
	@Override
	public String toString() {
		return "Vertex [Dinh=" + number + ", Bac=" + degreeTop + ", Mau=" + color + "]";
	}
	
}
