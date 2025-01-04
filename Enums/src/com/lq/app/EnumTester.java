package com.lq.app;

import com.lq.enums.TirePressures;
import com.lq.enums.WorkingState;

public class EnumTester {

	public static void main(String[] args) {
		for (TirePressures t: TirePressures.values()) 
			System.out.printf("%s %d\n", t, t.getPressure());
		System.out.println("=======================");
		for (WorkingState state: WorkingState.values())
			System.out.printf("%s %s\n", state, state.getStateName());
		System.out.println("=======================");
		System.out.printf("%b %b\n", 
				WorkingState.checkStateAvailability("California"),
				WorkingState.checkStateAvailability("Texas"));
	}

}
