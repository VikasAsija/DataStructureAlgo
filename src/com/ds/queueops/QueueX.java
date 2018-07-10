package com.ds.queueops;

public class QueueX {
	
	private Integer[] arr;
	private int rear = -1;
	private int front = -1;
	private int arrSize;
	
	public QueueX(int size) {
		
		arrSize = size;
		arr = new Integer[size];
	}	
	
	public void insert(Integer value) {
		
		if(rear == arrSize - 1) {
			rear = -1;
		}
		arr[++rear] = value;
	}
	
	public Integer remove() {
		
		if(front == arrSize - 1) {
			front = -1;
		}
		return arr[++front];
	}
	
	public boolean isFull() {
		
		if((rear - front == arrSize) || (front - rear == 1)) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(rear == front) {
			return true;
		}
		return false;
	}
	
	public Integer peek() {
		return arr[front];
	}

}
