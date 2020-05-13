package Sorts;

public class Insertion {
	
	public void insertion_sort(int arr[]) {
		for(int i =0;i<arr.length-1;i++) {
			
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
			
		}
	}
	  public void print(int arr[]) {
		  for(int i = 0;i<arr.length;i++) {
			  System.out.println(arr[i]);
		  }
	  }

}
