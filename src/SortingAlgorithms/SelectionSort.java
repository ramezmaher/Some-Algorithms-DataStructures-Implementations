package SortingAlgorithms;

public class SelectionSort extends SortingFoundation {
  public static void sort(Comparable[] arr) {
	  for (int i=0 ; i<arr.length ; i++) {
		  for (int j=i+1;j<arr.length;j++)
		  if (isLess(arr[i],arr[j]))
			  swap(arr,i,j);
	  }
  }
}
