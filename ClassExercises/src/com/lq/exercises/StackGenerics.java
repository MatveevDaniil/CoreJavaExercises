package com.lq.exercises;

import java.util.Deque;
import java.util.ArrayDeque;

public class StackGenerics {

	private interface Stack<T> {
		public void push(T element);
		public T get();
		public T pop();
	}
	
	private static class StackDeque<T> implements Stack<T> {
		private Deque<T> stack;
		
		public StackDeque() {
			stack = new ArrayDeque<>();
		}
		
		public void push(T element) {
			stack.addLast(element);
		}
		
		public T get() {
			return stack.getLast();
		}
		
		public T pop() {
			return stack.removeLast();
		}
	}

	public static void main(String[] args) {
		Stack<Integer> intStack = new StackDeque<>();
		intStack.push(1);
		intStack.push(10);
		for (int i = 0; i < 2; i++)
			System.out.println(intStack.pop());
		
		Stack<String> strStack = new StackDeque<String>();
		strStack.push("ONE");
		strStack.push("TWO");
		for (int i = 0; i < 2; i++)
			System.out.println(strStack.pop());
	}
}
