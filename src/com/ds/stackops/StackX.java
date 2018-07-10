package com.ds.stackops;

public class StackX {
	
	private Integer[] arr;
	private int index = -1; 
	private int arrSize;
	
	public StackX(int size) {
		this.arrSize = size;
		arr = new Integer[size];
	}
	
	public void push(Integer value) {
		arr[++index] = value;
		
	}
	
	public Integer pop() {
		return arr[index--];
	}

	public Integer peek() {
		return arr[index];
	}
	
	public boolean isFull() {
		if(index == arrSize - 1)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(index == -1)
			return true;
		return false;
		
	}
}
