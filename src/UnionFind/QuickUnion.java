package UnionFind;

public class QuickUnion {
 int arr[];	
 public QuickUnion(int n) {
	arr = new int[n];
	for (int i=0; i<n ; i++) {
		arr[i]= i;
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
		 arr[root1] = root2;
	 }
 }
 public boolean AllConnected() {
	 int dummy = getRoot(arr[0]);
	 int n = arr.length;
	 for (int i=1; i<n ; i++) {
		 if (getRoot(arr[i]) != dummy )
			 return false;
	 }
	 return true;
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
