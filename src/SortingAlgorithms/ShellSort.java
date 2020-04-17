package SortingAlgorithms;

public class ShellSort extends SortingFoundation{
	public static void sort(Comparable[] a) {
		int n = a.length;
		int h=1;
		while(h<(n/3)) 
			h=3*h+1;
		while (h>0) {
			for (int i=h; i<n;i++) {
				for (int j=i; j>=h ; j-=h) {
					if (isLess(a[j-h],a[j]))
						swap(a,j,j-h);
				}
			}
			h=h/3;	
		}
	}
}
