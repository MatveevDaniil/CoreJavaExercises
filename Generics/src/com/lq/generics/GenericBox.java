package com.lq.generics;

public class GenericBox<T> {
	private T t;

	/**
	 * @return the t
	 */
	public T getT() {
		return t;
	}

	/**
	 * @param t the t to set
	 */
	public void setT(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		GenericBox<Integer> intBox = new GenericBox<>();
		GenericBox<String> strBox = new GenericBox<>();
		
		strBox.setT("Hello World!");
		intBox.setT(10);
		
		System.out.printf("%s %d", strBox.getT(), intBox.getT());
	}
}
