package Sorts;

public class SelectionSort {
	
	public void selection_sort(int arr[]) { 
		for(int i =0;i<arr.length;i++) {
	
			for(int j = i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					arr[i] = arr[i]+arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
	}
	public void print(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
