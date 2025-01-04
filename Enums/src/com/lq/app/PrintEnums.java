package com.lq.app;

import com.lq.enums.TirePressures;

public class PrintEnums {
	public static void main(String[] args) {
		TirePressures tpLR = TirePressures.valueOf("LR");
		tpLR.overridePressure(10);
		
		for (TirePressures tp: TirePressures.values()) 
			System.out.printf("%s is %d pounds \n", tp.getName(), tp.getPressure());
	}
}
