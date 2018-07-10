package com.ds.queueops;

public class QueueXApp {

	public static void main(String[] args) {
		
		QueueX queue = new QueueX(10);
		int i = 1;
		while(!queue.isFull()) {
			queue.insert(++i);
		}
		for(int j = 0; j < 5; ++j) {
			System.out.println(queue.remove());
		}
		while(!queue.isFull()) {
			queue.insert(++i);
		}
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
	}

}
