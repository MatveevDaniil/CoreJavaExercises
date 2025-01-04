package com.lq.exercises;

public class ExercisePrint {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[9];
		shapes[0] = new Rectangle("rect1", "white", 3, 4);
		shapes[1] = new Rectangle("rect1", "black", 10, 10);
		shapes[2] = new Square("square1", "green", 5);
		shapes[3] = new Square("square2", "blue", 4);
		shapes[4] = new Box("box1", "red", 1, 2, 3);
		shapes[5] = new Box("box2", "yellow", 1, 1, 1);
		shapes[6] = new Cube("cube1", "orange", 3);
		shapes[7] = new Cube("cube2", "purple", 10);
		shapes[8] = new Circle("circle", "black", 4);
		
		for (Shape shape: shapes)
			System.out.println(shape.toString());
	}
}
