package com.ds.arrayops;

public class IntegerArrayApp {

	public static void main(String[] args) {
		
		IntegerArray arr = new IntegerArray(100);
		arr.insert(33);
		arr.insert(77); 
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.display();
		arr.selectionSort();
		arr.display();
		
		
//		arr.findByBinarySearch(100);
//		arr.delete(44);
//		arr.display();
		
	}
	
	public void mergeArrays() {
		
		
	}
}
