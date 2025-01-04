package com.lq.exercises.transport;

public class CarApp {

	public static void main(String[] args) {
		Car ford = new Car("ford", 10, 5, false);
		ford.print();
		
//		Car wagon = new StationWagon("Vagonchick");
//		wagon.print();
//		wagon.setCargoLoad(10);
		
		StationWagon wagon2 = new StationWagon("cargo_vagon", 10, 5, false);
		wagon2.print();
		wagon2.setCargoLoad(100);
		wagon2.print();
		
		SUV wagon3 = new SUV("cargo_suv", 10, 5, false);
		wagon3.print();
		wagon3.setCargoLoad(100);
		wagon3.print();
		SUV wagon4 = new SUV("cargo_suv", 10, 5, false);
		System.out.println(wagon3.equals(wagon4));
	}

}
