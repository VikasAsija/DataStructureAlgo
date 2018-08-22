package com.ds.linkedlist.DoublyLinkedList;

public class DoublyLinkedList {
	
	private Link first;
	private Link last;
	
	public void insertFirst(Integer value) {
		
		Link newLink = new Link(value);
		newLink.setNext(first);
		if(!isEmpty()) {
			first.setPrevious(newLink);
		}else {
			last = newLink;
		}
		first = newLink;
		
	}
	
	public void insertLast(Integer value) {
		
		Link newLink = new Link(value);
		newLink.setPrevious(last);
		if(!isEmpty()) {
			last.setNext(newLink);
		}else {
			first = newLink;
		}
		last = newLink;
	}
	
	
	
	public void displayForward() {
		
		
	}

	public void displayBackward() {
		
		
	}
	
	public void deleteFirst() {
		
	}
	
	public void deleteLast() {
		
	}
	
	public void deleteKey(Integer value) {
		
		
	}
	public void insertAfter(Integer insertAfter, Integer value) {
		
		
	}
	
	public boolean isEmpty() {
		
		return first == null;
	}

}
