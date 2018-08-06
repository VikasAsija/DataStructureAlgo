package com.ds.linkedlist;

public class Link {

	private Integer intValue;
	private Double doubleValue;
	private Link next;
	
	public Link(Integer intValue, Double doubleValue) {
		this.intValue = intValue;
		this.doubleValue = doubleValue;
	}
	
	public Integer getIntValue() {
		return intValue;
	}

	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}

	public Double getDoubleValue() {
		return doubleValue;
	}

	public void setDoubleValue(Double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}
	
	public void displayLink() {
		
		System.out.println("Integer Value : "+intValue);
		System.out.println("Double Value : "+doubleValue);
	}
}
