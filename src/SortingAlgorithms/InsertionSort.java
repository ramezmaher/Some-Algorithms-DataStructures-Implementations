package SortingAlgorithms;

public class InsertionSort extends SortingFoundation {
public static void sort(Comparable[] array) {
 	for (int i=0 ; i<array.length ; i++) {
 		for (int j=i ; j>0 ; j--) {
 			if (isLess(array[j-1],array[j])) {
 				swap(array,j,j-1);
 			}
 			else break;
 		}
 	}
}

}
