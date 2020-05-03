package SortingAlgorithms;

public class InsertionSort extends SortingFoundation {
public static void sort(Comparable[] array) {
	int len = array.length;
 	for (int i=0 ; i<len ; i++) {
 		for (int j=i ; j>0 ; j--) {
 			if (isLess(array[j-1],array[j])) 
 				swap(array,j,j-1);
 			else break;
 		}
 	}
}
public static void main(String[] args) {
	Integer[] a= {4,8,6,1,3,9,7,2,5,0};
	InsertionSort.sort(a);
	for (Integer i:a)
		System.out.print(i+" ");
}

}
