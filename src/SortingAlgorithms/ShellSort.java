package SortingAlgorithms;

public class ShellSort extends SortingFoundation{
	public static void sort(Comparable[] a) {
		int n = a.length;
		int h=1;
		while(h<(n/3)) 
			h=3*h+1;
		while (h>0) {
			for (int i=h; i<n;i++) {
				for (int j=i; j>=h && isLess(a[j-h],a[j]); j-=h) 
						swap(a,j,j-h);
			}
			h=h/3;	
		}
	}
	public static void main(String[] args) {
		Integer[] a= {4,8,6,1,3,9,7,2,5,0};
		ShellSort.sort(a);
		for (Integer i:a)
			System.out.print(i+" ");
	}
}
