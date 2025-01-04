package com.lq.exercises;

public class Cube extends Box {
	public Cube(double side) {
		super(side);
	}
	
	public Cube(String name, String color, double side) {
		super(name, color, side, side, side);
	}
	
	public void setSide(double side) {
		super.setHeight(side);
		super.setLength(side);
		super.setWidth(side);
	}
	
	public double getSide() {
		return getHeight();
	}

	@Override
	public void setHeight(double height) {
		setSide(height);
	}

	@Override
	public void setWidth(double width) {
		setSide(width);
	}

	@Override
	public void setLength(double length) {
		setSide(length);
	}
	
	
}
