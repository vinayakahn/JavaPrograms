package com.vinayaka.basic.programs;

public class BinarySearch {

	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		// System.out.println("The mid is: " +mid+" the first value is "+first);
		while (first <= last) {
			if (arr[mid] < key) {
				// System.out.println("the key value is : "+key+ " "+arr[mid]);

				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("The element found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 90, 20, 30, 40, 50, 60, 70, 80 };
		int key = 20;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);

	}

}
