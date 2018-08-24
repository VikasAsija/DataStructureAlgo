package com.ds.linkedlist.DoublyLinkedList;

public class Link {
	
	private Integer value;
	private Link next;
	private Link previous;
	
	public Link(Integer value) {
		this.value = value;
	}
	
	public Link getPrevious() {
		return previous;
	}

	public void setPrevious(Link previous) {
		this.previous = previous;
	}
	
	public Link getNext() {
		return next;
	}
	
	public void setNext(Link next) {
		this.next = next;
	}
	
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public void displayLink() {
		
		System.out.println("Integer Value : "+value);
	}
}
