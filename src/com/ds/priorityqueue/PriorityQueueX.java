package com.ds.priorityqueue;

public class PriorityQueueX {
	
	private Integer[] arr;
	private int size;
	private int front = -1;
	
	public PriorityQueueX(int size) {
		this.size = size;
		arr = new Integer[size];
	}
	
	public void insert(Integer value) {
		
		int j = 0;
		if(front == -1) {
			arr[++front] = value;
		}else {
			for(j = front; j >= 0; --j) {
				if(arr[j] > value) {
					arr[j + 1] = arr[j];
				}else {
					break;
				}
			}
			arr[j + 1] = value;
			++front;
		}
		
	}
	
	public Integer remove() {
		return arr[front--];
	}
	
	public boolean isFull() {
		if(front == size - 1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(front == 0) {
			return true;
		}
		return false;
	}
	
	

}
