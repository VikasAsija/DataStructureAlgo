package com.ds.arrayops;

public class IntegerArray {
	
	private Integer[] arr;
	private int maxIndex;
	
	public IntegerArray(int size) {
		arr = new Integer[size];
	}
	
	public void insertInSortedOrder(Integer valueToBInserted) {
		
		int i = 0;
		if(maxIndex > 0) {
			for(;i < maxIndex; ++i) {
				if(arr[i] > valueToBInserted) {
					break;
				}
			}
			int j = maxIndex - 1;
			for(; j >= i; --j) {
				arr[j + 1] = arr[j];
			}
		}
		arr[i] = valueToBInserted;
		++maxIndex;
	}

	public int findByBinarySearch(Integer valueToBSearched) {
		
		int startIndex = 0;
		int endIndex = maxIndex - 1;
		while(true) {
			int midIndex = (startIndex + endIndex)/2;
			int midElem = arr[midIndex];
			if(startIndex > endIndex) {
				System.out.println("Element Not Found");
				break;
			}else if(midElem == valueToBSearched) {
				System.out.println("Element Index : "+midIndex);
				return midIndex;
			}else if(valueToBSearched > midElem) {
				startIndex = midIndex + 1;
			}else {
				endIndex = midIndex - 1;
			}
		}
		return 0;
	}
	
	public void delete(Integer valueToBDeleted) {
		
		int valueToBDeletedIndex = findByBinarySearch(valueToBDeleted);
		for(;valueToBDeletedIndex < maxIndex; ++valueToBDeletedIndex) {
			arr[valueToBDeletedIndex] = arr[valueToBDeletedIndex + 1];
		}
		--maxIndex;
	}
	
	public void display() {
		
		for(int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
}
