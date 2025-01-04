package com.lq.exercises;

public class BoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box(7, 6, 5);
		Box box2 = new Box(10);
		int boxIdx = 1;
		for (Box box: new Box[] {box1, box2}) {
			double width = box.getWidth();
			double height = box.getHeight();
			double length = box.getLength();
			System.out.printf("Box %d has width = %.1f\n", boxIdx, width);
			System.out.printf("Box %d has length = %.1f\n", boxIdx, length);
			System.out.printf("Box %d has height = %.1f\n", boxIdx, height);
			boxIdx++;
			System.out.println("=========================");
		}
		
		System.out.printf("Box 1 volume: %.1f\n", box1.getVolume());
		System.out.printf("Box 1 surface area: %.1f\n", box1.getSurfaceArea());
		System.out.println("=========================");
		
		box1.setHeight(10);
		box1.printBox();
		System.out.println("=========================");
		
		box1.setHeight(-5);
		box1.printBox();
		System.out.println("=========================");
		
		Cube cube1 = new Cube(1), cube2 = new Cube(10);
		cube1.printBox();
		cube2.printBox();
		cube1.setHeight(5);
		cube1.printBox();
		cube2.setHeight(-10);
		cube2.printBox();
	}

}
