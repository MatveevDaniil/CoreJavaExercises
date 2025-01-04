package com.lq.exercises.transport;

public class SportCar extends Car {

	private int horsePower;
	
	@Override
	public void setSpeed(int newSpeed) {
		super.setSpeed((int) (newSpeed * 1.1));
	}

	public SportCar() {
		// TODO Auto-generated constructor stub
	}

	public SportCar(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public SportCar(String name, int speed, int gasoline, boolean engineState) {
		super(name, speed, gasoline, engineState);
		// TODO Auto-generated constructor stub
	}

}
