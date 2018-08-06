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
	
	public void insertFirst(Integer intValue) {
		
		Link temp = first;
		first = new Link(intValue);
		first.setNext(temp);
	}
	
	public void insertLast(Integer intValue) {
		
		Link temp = first;
		while(temp != null) {
			if(temp.getNext() == null) {
				temp.setNext(new Link(intValue));
				return;
			}
			temp = temp.getNext();
		}
		first = new Link(intValue);
		
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
