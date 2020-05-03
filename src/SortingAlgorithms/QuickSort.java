package SortingAlgorithms;


public class QuickSort extends SortingFoundation {
	public static void sort(Comparable[] a) {
		sort(a,0,a.length-1);
	}
	private static void sort(Comparable[] a,int lo,int hi) {
		if (hi<=lo)
			return;
		int i=lo,j=hi+1;
		while (true) {
			while(isLess(a[lo],a[++i])) {
				if (i==hi)
					break;
			}
			while(isLess(a[--j],a[lo])) {
				if(j==lo)
					break;
			}
			if (i>=j)
				break;
			swap(a,i,j);
		}
		swap(a,lo,j);
		sort(a,lo,j-1);
		sort(a,j+1,hi);
	}
	private static void print(Comparable[] a) {
		for (Comparable i: a)
			System.out.print(i+" ");
	}
	public static void main(String[] args) {
		Integer[] a= {4,8,6,1,3,9,7,2,5,0};
		QuickSort.sort(a);
		print(a);
	}
}
