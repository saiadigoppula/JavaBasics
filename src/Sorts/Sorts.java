package Sorts;




public class Sorts {

	public static void main(String[] args) {
		
		MergeSort merge_sort = new MergeSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		merge_sort.print(arr);
		arr = MergeSort.mergesort(arr);
		System.out.println("after sort");
		merge_sort.print(arr);
		
		
		
	}

}
