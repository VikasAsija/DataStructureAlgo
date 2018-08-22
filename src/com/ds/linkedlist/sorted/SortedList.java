package com.ds.linkedlist.sorted;



public class SortedList {
	
	private Link first;

	public Link getFirst() {
		return first;
	}

	public void setFirst(Link first) {
		this.first = first;
	}
	
	public void insert(Integer value) {
		
		Link newLink = new Link(value);
		Link temp = first;
		Link previous = null;
		while(temp != null && temp.getData() < value) {
			previous = temp;
			temp = temp.getNext();
		}
		newLink.setNext(temp);
		if(isEmpty() || previous == null) {
			first = newLink;
		}else {
			previous.setNext(newLink);
		}
	}
	
	public boolean isEmpty() {
		
		return first == null;
	}
	
	public void displayList() {
		
		Link link = first;
		while(link != null) {
			link.displayLink();
			link = link.getNext();
		}
	}
	
	public void remove() {
		if(first != null) {
			first = first.getNext();
		}
	}
}
