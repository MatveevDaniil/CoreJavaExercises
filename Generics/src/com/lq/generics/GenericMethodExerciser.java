package com.lq.generics;

public class GenericMethodExerciser {
	public static void main(String[] args) {
		Character[] charArr = new Character[] {'1', '2', '3'};
		Integer[] intArr = new Integer[] {1, 2, 3};
		Double[] floatArr = new Double[] {1., 2., 3.};
		
		GenericMethod.printArray(intArr);
		GenericMethod.printArray(charArr);
		GenericMethod.printArray(floatArr);
		
		System.out.println(Maximum.maximum(intArr[0], intArr[1], intArr[2]));
		System.out.println(Maximum.maximum(charArr[0], charArr[1], charArr[2]));
		System.out.println(Maximum.maximum(floatArr[0], floatArr[1], floatArr[2]));

	}
}
