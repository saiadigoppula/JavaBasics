package Sorts;

class BoobleSort{
	  public void Booble_Sort(int arr[]) {
		  boolean swap;
		 for(int i = 0;i<arr.length-1;i++) {
			 swap = false;
			 for(int j =0;j<arr.length-1;j++) {
				 if(arr[j]>arr[j+1]) {
					 arr[j] = arr[j]+arr[j+1];
					 arr[j+1] = arr[j] - arr[j+1];
					 arr[j] = arr[j] - arr[j+1];
					 swap = true;
					 
				 }
			 }
			 if(swap== false) {
				 break;
			 }
		 }
		
	}
	  public void print(int arr[]) {
		  for(int i = 0;i<arr.length;i++) {
			  System.out.println(arr[i]);
		  }
	  }
}
