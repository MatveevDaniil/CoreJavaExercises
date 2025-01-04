/**
 * 
 */
package com.lq.exercises;

/**
 * @author developer
 *
 */
public class Box extends Shape implements ThreeDimensional {

	private double height, width, length;
	public double getHeight() { return height; }
	public void setHeight(double height) { 
		if (height < 0) {
			System.out.printf(
					"Cannot set Height to = %.1f which is < 0..\n",
					height
			);
		} else {
			this.height = height; 
		}
	}
	
	public double getWidth() { return width; }
	public void setWidth(double width) { 
		if (width < 0) {
			System.out.printf(
					"Cannot set Width to = %.1f which is < 0..\n",
					width
			);
		} else {
			this.width = width; 
		}
	}
	
	public double getLength() { return length; }
	public void setLength(double length) { 
		if (length < 0) {
			System.out.printf(
					"Cannot set Length to = %.1f which is < 0.\n",
					length
			);
		} else {
			this.length = length; 
		}
	}
	
	public Box(double height, double width, double length) {
		setHeight(height);
		setWidth(width);
		setLength(length);
	}
	
	public Box(String name, String color, double height, double width, double length) {
		setName(name);
		setColor(color);
		setHeight(height);
		setWidth(width);
		setLength(length);
	}
	
	// creates a cube
	public Box(double height) {
		this(height, height, height);
	}
	
	public double getVolume() {
		return height * width * length;
	}
	
	public double getSurfaceArea() {
		return 2 * (height * width + height * length +  width * length);
	}
	
	public void printBox() {
		if (height <= 0 && width <= 0 && length <= 0) {
			System.out.println("The box contain invalid dimensions");
		} else {
			System.out.printf("Length = %.1f\n", length);
			System.out.printf("Width  = %.1f\n", width);
			System.out.printf("Height = %.1f\n", height);
			System.out.printf("Volume = %.1f\n", getVolume());
			System.out.printf("Surface Area = %.1f\n", getSurfaceArea());
		}
	}
	
	@Override
	public String toString() {
		return "Box [height=" + getHeight() + ", width=" + getWidth() + ", length=" + getLength()
				+ ", volume=" + getVolume() + ", surfaceAreaa=" + getSurfaceArea() + "]";
	}
	
	public static void main(String[] args) {
		Box customBox = new Box(7, 6, 5); 
		customBox.printBox();
	}

}
