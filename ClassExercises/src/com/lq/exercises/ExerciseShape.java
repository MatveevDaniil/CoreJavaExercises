package com.lq.exercises;

public class ExerciseShape {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[8];
		shapes[0] = new Rectangle("rect1", "white", 3, 4);
		shapes[1] = new Rectangle("rect1", "black", 10, 10);
		shapes[2] = new Square("square1", "", 5);
		shapes[3] = new Square("square2", "", 4);
		shapes[4] = new Box("box1", "", 1, 2, 3);
		shapes[5] = new Box("box2", "", 1, 1, 1);
		shapes[6] = new Cube("cube1", "", 3);
		shapes[7] = new Cube("cube2", "", 10);
		
		for (Shape shape: shapes) {
			if (shape instanceof ThreeDimensional) {
				ThreeDimensional shape3d = (ThreeDimensional) shape;
				System.out.printf("The volume of %s is %.2f\n", shape.getName(), shape3d.getVolume());
			}
			else
				System.out.printf("Cannot calc volume of %s\n", shape.getName());
		}
		System.out.println("==========================");
		
		TwoDimensional[] shapes2d = new TwoDimensional[3];
		shapes2d[0] = new Circle("circle", "white", 1);
		shapes2d[1] = new Rectangle("rectangle", "black", 2, 4);
		shapes2d[2] = new Square("square", "orange", 3);
		
		for (TwoDimensional shape2d : shapes2d) {
			Shape shape = (Shape) shape2d;
			System.out.printf("The area of %s is %.2f\n", shape.getName(), shape2d.getArea());
			System.out.printf("The perimeter of %s is %.2f\n", shape.getName(), shape2d.getPerimeter());
		}
		System.out.println("==========================");
	}
}
