package com.ds.linkedlist.DoublyLinkedList;

import com.ds.linkedlist.model.Link;

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
		
		Link temp = first;
		while(temp != null) {
			System.out.println("Value : "+temp.getValue());
			temp = temp.getNext();
		}
	}

	public void displayBackward() {
		
		Link temp = last;
		while(temp != null) {
			System.out.println("Value : "+temp.getValue());
			temp = temp.getPrevious();
		}
		
	}
	
	public void deleteFirst() {
		
		first = first.getNext();
		first.setPrevious(null);
		
	}
	
	public void deleteLast() {
		
		last = last.getPrevious();
		last.setNext(null);
		
	}
	
	public void deleteKey(Integer value) {
		
		Link temp = first;
		while(temp != null) {
			
			if(temp.getValue() == value) {
				
				System.out.println("Key Deleted :" + temp.getValue());
				if(temp.getPrevious() != null) {
					temp.getPrevious().setNext(temp.getNext());
					break;
				}
				first = temp.getNext();
				if(first != null) {
					first.setPrevious(null);
				}
				break;
			}
			temp = temp.getNext();
		}
		
		
	}
	public void insertAfter(Integer insertAfter, Integer value) {
		
		Link temp = first;
		while(temp != null) {
			
			if(temp.getValue() == insertAfter) {
				Link newLink = new Link(value);
				newLink.setNext(temp.getNext());
				newLink.setPrevious(temp);
				temp.setNext(newLink);
				break;
			}
			temp = temp.getNext();
			
		}
		
		
	}
	
	public boolean isEmpty() {
		
		return first == null;
	}

}
