package com.ds.linkedlist.sorted;

public class Link {
	
	private Integer data;
	private Link next;
	
	public Link(Integer data) {
		this.data = data;
	}
	
	public Link getNext() {
		return next;
	}
	
	public void setNext(Link next) {
		this.next = next;
	}
	
	public Integer getData() {
		return data;
	}
	
	public void setData(Integer data) {
		this.data = data;
	}
	
	public void displayLink() {
		
		System.out.println("Integer Value : "+data);
	}
}
