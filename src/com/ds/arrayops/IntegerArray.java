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
	
	public void removeDuplicates() {
		
		for(int i = 0; i < maxIndex; ++i) {
			for(int j = i + 1; j < maxIndex; ++j) {
				if(arr[i] == arr[j]) {
					removeElem(j);
				}
			}
		}
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
		removeElem(valueToBDeletedIndex);
	}
	
	public void removeElem(int valueToBDeletedIndex) {
		
		for(;valueToBDeletedIndex < maxIndex; ++valueToBDeletedIndex) {
			arr[valueToBDeletedIndex] = arr[valueToBDeletedIndex + 1];
		}
		--maxIndex;
	}
	
	// in case of unordered array
	public Integer getMaxElem() {
		
		int maxElem = 0;
		if(maxIndex > 0) {
			for(int i = 0; i < maxIndex - 1; ++i) {
				if(arr[i] > arr[i + 1]) {
					maxElem = arr[i];
				}else {
					maxElem = arr[i + 1];
				}
			}
		} 
		return maxElem;
	}
	
	
	public void display() {
		
		for(int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
	
	public void insert(Integer insertedValue) {
		
		arr[maxIndex] = insertedValue;
		++maxIndex;
	}
	
	public void bubbleSort() {
		
		for(int j = maxIndex - 1; j > 0; --j) {
			for(int i = 0; i < j; ++i) {
				if(arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
	
	public void selectionSort() {
		
		for(int j = 0; j < maxIndex - 1; ++j) {
			int smallestElem = arr[j];
			int smallestIndex = j;
			for(int i = j; i < maxIndex; ++i) {
				if(smallestElem > arr[i]) {
					smallestElem = arr[i];
					smallestIndex = i;
				}
			}
			for(int k = smallestIndex; k > j; --k) {
				arr[k] = arr[k - 1];
			}
			arr[j] = smallestElem;
		}
	}
	
	public void insertionSort() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
