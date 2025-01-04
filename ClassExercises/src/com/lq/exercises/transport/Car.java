/**
 * 
 */
package com.lq.exercises.transport;
import java.util.HashMap;

/**
 * @author developer
 *
 */
public class Car {
	private String name;
	private int speed;
	private int gasoline;
	private boolean engineState;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setGasoline(int newGasoline) {
		gasoline = newGasoline;
	}
	
	public int getGasoline() {
		return gasoline;
	}
	
	public void setEngineState(boolean newEngineState) {
		engineState = newEngineState;
	}
	
	public boolean getEngineState() {
		return engineState;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (!(arg0 instanceof Car))
			return false;
		Car car2 = (Car) arg0;
		return name == car2.name;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return serialize().toString();
	}

	public void init(
			String newName,
			int newSpeed, 
			int newGasoline,
			boolean newEngineState
	) {
		setName(newName);
		setSpeed(newSpeed);
		setGasoline(newGasoline);
		setEngineState(newEngineState);
	}
	
	public Car() {
		init("", 0, 0, false);
	}
	
	public Car(String name) {
		init(name, 0, 0, false);
	}
	
	public Car(
			String name,
			int speed, 
			int gasoline,
			boolean engineState
	) {
		init(name, speed, gasoline, engineState);
	}
	
	public HashMap<String, Object> serialize() {
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("name", getName());
		data.put("speed", getSpeed());
		data.put("engineState", getEngineState());
		data.put("gasoline", getGasoline());
		return data;
	}
	
	public void print() {
		HashMap<String, Object> carData = serialize();
		System.out.println(carData);
	}

}
