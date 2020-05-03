package SortingAlgorithms;

public class SelectionSort extends SortingFoundation {
  public static void sort(Comparable[] arr) {
	  int len = arr.length;
	  for (int i=0 ; i<len ; i++) {
		  int min=i;
		  for (int j=i+1;j<len;j++)
			  if (isLess(arr[min],arr[j]))
			  min=j;
		  swap(arr,i,min);
	  }
  }
  public static void main(String[] args) {
		Integer[] a= {4,8,6,1,3,9,7,2,5,0};
		SelectionSort.sort(a);
		for (Integer i:a)
			System.out.print(i+" ");
	}
}
