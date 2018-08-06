package com.ds.linkedlist;

public class LinkList {

	private Link first;

	public Link getFirst() {
		return first;
	}

	public void setFirst(Link first) {
		this.first = first;
	}
	
	public void insertFirst(Integer intValue, Double doubleValue) {
		
		Link temp = first;
		first = new Link(intValue, doubleValue);
		first.setNext(temp);
	}
	
	public Link find(Integer value) {
		
		Link temp = first;
		while(temp != null) {
			if(temp.getIntValue() == value) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}
	
	public Link delete(Integer value) {
		
		Link previous = null;
		Link current = first;
		while(current != null) {
			if(current.getIntValue() == value) {
				if(previous != null) {
					previous.setNext(current.getNext());
					return current;
				}else {
					first = null;
					return first;
				}
			}
			previous = current;
			current = current.getNext();
		}
		return null;
	}
	
	public Link deleteFirst() {
		
		if(first != null) {
			Link deletedLink = first;
			first = first.getNext();
			return deletedLink;
		}
		return first;
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
}
