package SortingAlgorithms;

public class MergeSort extends SortingFoundation {
	
	private static void merge(Comparable[] a,Comparable[] aux,int index1,int mid,int index2) {
		assert isSorted(a,index1,mid);
		assert isSorted(a,mid+1,index2);
		for (int i=index1;i<=index2;i++)
			aux[i]=a[i];
		int i=index1,j=mid+1;
		for (int k=index1 ; k<=index2 ; k++) {
			if (i>mid) 
				a[k] = aux[j++];
			else if (j>index2) 
				a[k] = aux[i++];
			else if(isLess(aux[i], aux[j]))
				a[k] = aux[j++];
			else a[k] = aux[i++];
		}
		
		assert isSorted(a,index1,index2);
	}
	
	private static void sort(Comparable[] a,Comparable[] aux,int index1,int index2) {
		if (index2<=index1) 
			return;
		int mid = index1 + ((index2-index1)/2) ;
		sort (a,aux,index1,mid);
		sort (a,aux,mid+1,index2);
		merge(a,aux,index1,mid,index2);
	}
	
	public static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a,aux,0,a.length-1);
	} 

	public static void main(String[] args) {
		Integer[] a= {4,8,6,1,3,9,7,2,5,0};
		MergeSort.bottomUpSort(a);
		for (Integer i:a)
			System.out.print(i+" ");
	}
	public static void bottomUpSort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		int len = a.length,mid;
		for (int size=1 ; size<len ; size *= 2 ) {
			for (int i=0; i<len-size ; i += 2*size ) {
				merge(a,aux,i,i+size-1,Math.min(i+(2*size-1),len-1));
			}
		}
	}
}
