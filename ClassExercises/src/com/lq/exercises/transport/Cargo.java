package com.lq.exercises.transport;

public class Cargo extends Car {

	private int cargoCapacity;
	private int currentCargoLoad;

	public Cargo() {
		super();
	}

	public Cargo(String name) {
		super(name);
	}

	public Cargo(String name, int speed, int gasoline, boolean engineState) {
		super(name, speed, gasoline, engineState);
	}

	public int getCurrentCargoLoad() {
		return currentCargoLoad;
	}

	public void setCargoLoad(int cargoLoad) {
		currentCargoLoad = cargoLoad;
		setSpeed(getSpeed());
	}

	@Override
	public void setSpeed(int newSpeed) {
		super.setSpeed( (int) (newSpeed - getCurrentCargoLoad() / 100));
	}

}