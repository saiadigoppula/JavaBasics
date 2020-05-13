package Sorts;

public class MergeSort {

	public static  int[] mergesort(int[] array) {
		
		if(array.length <=1) {
			return array;
		}
		int midpoint = array.length/2;
		int[] left  = new int[midpoint];
		int[] right;
		
		if(array.length%2 == 0) {
			right = new int[midpoint];
		}
		else {
			right = new int[midpoint + 1];
		}
 		
		for(int i=0;i<midpoint;i++) {
			left[i] = array[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j] = array[midpoint+j];
		}
		
		int[] result = new int[array.length];
		left = mergesort(left);
		right = mergesort(right);
		
		result = merge(left,right);
		
		return result;
	}
	private static int[] merge(int[] left,int[] right) {
		int[] result = new int[left.length + right.length];
		
		int leftPointer, rightPointer,resultPointer;
		leftPointer = rightPointer = resultPointer = 0;
		
		while(leftPointer < left.length || rightPointer < right.length) {
			if(leftPointer < left.length && rightPointer < right.length) {
				if(left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];
				}else {
					result[resultPointer++] = right[rightPointer++];
				}
			}
			else if(leftPointer < left.length) {
				result[resultPointer++] = left[leftPointer++];
			}
			else if(rightPointer < right.length) {
				result[resultPointer++] = left[rightPointer++];
			}
		}
		
		return result;
		
	}
	
	
	
	public void print(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
