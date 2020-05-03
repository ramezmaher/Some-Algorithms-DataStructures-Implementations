package TestPack;
import SortingAlgorithms.*;
import java.util.Random;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Test {
	
	private static Formatter x;
	
	public static void openfile() {
		try {
			x = new Formatter("Test.txt");
		}
		catch(Exception e) {
			System.out.println("Error occured while opening the file");
		}
		
	}
	public static void write(int k,double a,double b,double c,double d,double e,double f) {
		x.format("%d,%f,%f,%f,%f,%f,%f\n",k,a,b,c,d,e,f);
	}
	public static void write(int k,double a,double b) {
		x.format("%d,%f,%f\n",k,a,b);
	}
	public static void close() {
		x.close();
	}
	public static void main(String args[]) {
		double l1,l2,mer,qui;
		openfile();
		x.format("%s,%s,%s\n","DataSize","MergeSort","QuickSort");
		System.out.println("DataSize  MergeSort  QuickSort");
		for(int k=100 ; k < 9000000 ; k*=2 ) {
		Random r = new Random();
		Integer[] M = new Integer[k];
		Integer[] Q = new Integer[k];
		for (int i=0 ; i<k;i++) {
			int n = r.nextInt();
			/*I[i]=n;
			S[i]=n;
			H[i]=n;*/
			M[i]=n;
			Q[i]=n;
		}
		//insertion sort
	/*	l1= System.currentTimeMillis();
		InsertionSort.sort(I);
		l2= System.currentTimeMillis();
		ins=(l2-l1)*0.001;
		
		//selection sort
		l1= System.currentTimeMillis();
		SelectionSort.sort(S);
		l2= System.currentTimeMillis();
		sel=(l2-l1)*0.001;
		
		//shell sort
		l1= System.currentTimeMillis();
		ShellSort.sort(H);
		l2= System.currentTimeMillis();
		shel=(l2-l1)*0.001;*/
		
		//merge sort
		l1= System.currentTimeMillis();
		MergeSort.sort(M);
		l2= System.currentTimeMillis();
		mer=(l2-l1)*0.001;
		
		//Bottom-up merge sort
	  /*l1= System.currentTimeMillis();
		MergeSort.bottomUpSort(M2);
		l2= System.currentTimeMillis();
		bumer=(l2-l1)*0.001;*/
		
		//Quick sort
		l1= System.currentTimeMillis();
		QuickSort.sort(Q);
		l2= System.currentTimeMillis();
		qui=(l2-l1)*0.001;
		
		System.out.println(k+"       "+mer+"       "+qui);
		write(k,mer,qui);
		
		}
		close();
}
}

