package UnionFind;

public class WeightedQuickUnion {
	int arr[];
	int size[];
	int MaxTreeSize = 0;
public WeightedQuickUnion(int n) {
	arr = new int[n];
	size = new int[n];
	for(int i=0; i<n; i++) {
		arr[i] = i;
		size[i] = 1;
	}
}
	public boolean Connected(int p, int q) {
		int root1 = getRoot(p);
		int root2 = getRoot(q);
		if (root1 == root2)
			return true;
		else return false;
		 
	 }
	 public void Union(int p, int q) {
		 int root1 = getRoot(p);
		 int root2 = getRoot(q);
		 if (root1 == root2 )
			 return;
		 else {
			 if (size[root2] >= size[root1]) {
			     arr[root1] = root2;
			     size[root2] += size[root1] ;
			     if (size[root2] > MaxTreeSize)
			    	 MaxTreeSize = size[root2];
			 }
			 else {
				 arr[root2] = root1;
				 size[root1] += size[root2];
				 if (size[root1] > MaxTreeSize)
			    	 MaxTreeSize = size[root1];
			 }
		 }
	 }
	 public boolean AllConnected() {
		if (MaxTreeSize == arr.length)
			return true;
		else return false;
	 }
	 private int getRoot(int n) {
		 int dummy = n ;
		 while (arr[dummy] != dummy) {
			 arr[dummy] = arr[arr[dummy]];
			 dummy = arr[dummy];
		 }
		 return dummy;
	 }
}

