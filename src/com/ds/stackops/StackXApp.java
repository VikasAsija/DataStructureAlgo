package com.ds.stackops;

public class StackXApp {

	public static void main(String[] args) {
		
		StackX stack = new StackX(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
