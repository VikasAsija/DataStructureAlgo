package com.ds.arrayops;

public class IntegerArrayApp {

	public static void main(String[] args) {
		
		IntegerArray arr = new IntegerArray(100);
		arr.insertInSortedOrder(77); 
		arr.insertInSortedOrder(99);
		arr.insertInSortedOrder(44);
		arr.insertInSortedOrder(55);
		arr.insertInSortedOrder(22);
		arr.insertInSortedOrder(88);
		arr.insertInSortedOrder(11);
		arr.insertInSortedOrder(00);
		arr.insertInSortedOrder(66);
		arr.insertInSortedOrder(33);
		arr.display();
		
		
		arr.findByBinarySearch(100);
		arr.delete(44);
		arr.display();
		
		
		
	}
}
