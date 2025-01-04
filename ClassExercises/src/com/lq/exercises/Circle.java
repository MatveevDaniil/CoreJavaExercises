package com.lq.exercises;

public class Circle extends Shape implements TwoDimensional {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return String.format("Circle with name \"%s\", %s color and radius %.1f", 
				getName(), getColor(), getRadius());
	}
	
	public Circle(String name, String color, double radius) {
		setName(name);
		setColor(color);
		setRadius(radius);
	}

	@Override
	public double getArea() {
		return Math.PI * getRadius() * getRadius();
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * getRadius();
	}

}
