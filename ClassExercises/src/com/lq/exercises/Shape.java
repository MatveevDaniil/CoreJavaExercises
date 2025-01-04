package com.lq.exercises;

public abstract class Shape {
	private String color, name;

	@Override
	public String toString() {
		return "Shape [color=" + color + ", name=" + name + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
