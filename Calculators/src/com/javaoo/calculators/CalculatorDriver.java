package com.javaoo.calculators;

public class CalculatorDriver {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		TrigonometricCalculator trigCalc = new TrigonometricCalculator();
		System.out.println(trigCalc.tangent(100));
		ScientificCalculator calc = new ScientificCalculator(1);
		System.out.println(calc.log(1));
		System.out.println(calc.getValueFromMemory());
		calc.putValueInMemory(calc.add(calc.PI, calc.exp(1)));
		System.out.println(calc.getValueFromMemory());
	}
}
