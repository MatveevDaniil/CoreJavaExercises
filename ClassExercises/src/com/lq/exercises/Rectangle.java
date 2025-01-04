package com.lq.exercises;

public class Rectangle extends Shape implements TwoDimensional {
	private double length, width;
	
	public Rectangle(double length, double width) {
		setName("Unknown");
		setColor("White");
		setLength(length);
		setWidth(width);
	}
	
	public Rectangle(String name, String color, double width, double length) {
		setName(name);
		setColor(color);
		setLength(length);
		setWidth(width);
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	@Override
	public double getArea() {
		return width * length;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}
}
