package SortingAlgorithms;

 public class SortingFoundation {
	 protected static boolean isLess(Comparable val1,Comparable val2) {
		  int check = val2.compareTo(val1);
		  if(check < 0)
			  return true;
		  else return false;
	  }
	  protected static void swap(Comparable[] arr,int i1,int i2) {
		  Comparable dummy = arr[i1];
		  arr[i1] = arr[i2];
		  arr[i2] = dummy;
	  }
}
