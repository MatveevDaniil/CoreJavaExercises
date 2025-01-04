/**
 * 
 */
package com.javaoo.calculators;

/**
 * @author developer
 *
 */
public class TrigonometricCalculator extends ScientificCalculator {

	public static final double sine(double x) {
		return Math.sin(x);
	}
	
	public static final double cosine(double x) {
		return Math.sqrt(1 - square(sine(x)));
	}
	
	public static final double arcsine(double x) {
		return Math.asin(x);
	}
	
	public static final double arccosine(double x) {
		return Math.acos(x);
	}
	
	public static final double tangent(double x) {
		return sine(x) / cosine(x);
	}
	
	public static final double arctangent(double x) {
		return Math.atan(x);
	}
	
}
