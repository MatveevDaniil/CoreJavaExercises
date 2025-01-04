package com.lq.enums;

import java.util.Set;
import java.util.HashSet;

public enum WorkingState {
	CA("California"),
	NV("Nevada"),
	FL("Florida");
	
	private String stateName;
	
	private static final Set<String> validStates = new HashSet<>();
	
	static {
		for (WorkingState state : WorkingState.values())
			validStates.add(state.getStateName());
	}
	
	public String getStateName() {
		return stateName;
	}
	
	private WorkingState(String stateName) {
		this.stateName = stateName;
	}
	
	public static boolean checkStateAvailability(String stateName) {
		return validStates.contains(stateName);
	}
}
