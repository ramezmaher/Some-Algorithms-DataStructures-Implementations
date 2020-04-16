package UnionFind;

public class QuickFind {
	int arr[] ;
	
	 public QuickFind(int n) {
		 arr = new int[n]; 
		 for (int i=0; i<n ; i++) {
			 arr[i] = i ;
		 }
	 }
	 public boolean Connected(int p, int q) {
		 if (arr[p] == arr[q])
			 return true;
		 else return false;
	 }
	 public void Union(int p, int q) {
		 int objP = arr[p];
		 int objQ = arr[q];
		 int n = arr.length;
		 if (objP == objQ )
			 return;
		 for (int i=0; i<n ; i++) {
			 if (arr[i] == objP)
				 arr[i] = objQ;
		 }
	 }
	 public boolean AllConnected() {
		 int n = arr.length;
		 for (int i=0; i<= n-2 ; i++) {
			 if (arr[i] != arr[i+1]) {
				 return false;
			 }
		 }
		 return true;
	 }
}
