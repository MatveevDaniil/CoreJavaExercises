package com.lq.generics;

public class GenericMethod {
	public static <T> void printArray(T[] inputArray) {
		for (T element : inputArray)
			System.out.printf("%s ", element);
		System.out.println();
	}
}
