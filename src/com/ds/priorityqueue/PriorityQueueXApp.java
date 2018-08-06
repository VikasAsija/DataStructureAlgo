package com.ds.priorityqueue;

public class PriorityQueueXApp {
	
	public static void main(String[] args) {
		
		PriorityQueueX priorityQueueX = new PriorityQueueX(10);
		priorityQueueX.insert(20);
		priorityQueueX.insert(10);
		priorityQueueX.insert(5);
		priorityQueueX.insert(4);
		
		System.out.println(priorityQueueX.remove());
		System.out.println(priorityQueueX.remove());
		System.out.println(priorityQueueX.remove());
		System.out.println(priorityQueueX.remove());
		
	}

}
