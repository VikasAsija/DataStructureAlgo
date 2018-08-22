package com.ds.linkedlist.DoubleEndedList;

public class FirstLastList {
	
	private Link first;
	private Link last;
	
	public Link getFirst() {
		return first;
	}
	public void setFirst(Link first) {
		this.first = first;
	}
	public Link getLast() {
		return last;
	}
	public void setLast(Link last) {
		this.last = last;
	}
	
	public boolean isEmpty() {
		
		return first == null;
	}
	
	public void insertFirst(Integer intValue) {
		
		Link newLink = new Link(intValue);
		if(isEmpty()) {
			last = newLink;
		}
		newLink.setNext(first);
		first = newLink;
	}
	
	public void insertLast(Integer intValue) {
		
		Link newLink = new Link(intValue); 
		if(isEmpty()) {
			first = newLink;
		}else {
			last.setNext(newLink);
		}
		last = newLink;
	}
	
	public void displayList() {
		
		Link link = first;
		while(link != null) {
			link.displayLink();
			link = link.getNext();
		}
	}
	
	public Link deleteFirst() {
		
		if(first != null) {
			Link deletedLink = first;
			first = first.getNext();
			return deletedLink;
		}
		return first;
	}
}
