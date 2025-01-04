/**
 * 
 */
package com.javaoo.calculators;

/**
 * @author developer
 *
 */
public class ScientificCalculator extends BasicCalculator {
	static final double PI = 3.141519;
	private double holdValue;
	
	public static final double exp(double x) {
		return Math.exp(x);
	}
	
	public static final double log(double x) {
		return Math.log(x);
	}
	
	public void putValueInMemory(double val) {
		holdValue = val;
	}
	
	public double getValueFromMemory() {
		return holdValue;
	}
	
	public ScientificCalculator() {
		putValueInMemory(0);
	}
	
	public ScientificCalculator(double val) {
		putValueInMemory(val);
	}
	
}
