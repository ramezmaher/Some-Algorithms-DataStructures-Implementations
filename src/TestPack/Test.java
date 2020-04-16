package TestPack;
import UnionFind.*;
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
	public static void write(int k,double qf,double qu,double wqu) {
		x.format("%d,%f,%f,%f\n",k,qf,qu,wqu);
	}
	public static void close() {
		x.close();
	}
	public static void main(String args[]) {
		double qf=0,qu=0,wqu=0;
		openfile();
		x.format("%s,%s,%s,%s\n","DataSize","QuickFind","QuickUnion","WeightedQuickUnio");
		
		System.out.println("DataSize  QuickFind  QuickUnion  WeightedQuickUnion");
		
		for(int k=100 ; k < 130000000 ; k*=2 ) {
		
		QuickFind q = new QuickFind(k);
		QuickUnion u = new QuickUnion(k);
		WeightedQuickUnion w = new WeightedQuickUnion(k);
		Random r = new Random();
		long l1,l2;
		//Quick Find Algorithm
		boolean AC = false;
		int i1,i2;
		/*
	    l1 = System.currentTimeMillis();
		while (!AC) {
			i1 = r.nextInt(k);
			i2 = r.nextInt(k);			
			if (!q.Connected(i1, i2)) {
				q.Union(i1, i2);
			}
			AC = q.AllConnected();
		}
		l2 = System.currentTimeMillis();
		qf = (l2-l1)*0.001;
		
		//Quick Union Algorithm
		
		AC = false;
		l1 = System.currentTimeMillis();
		while (!AC) {
			i1 = r.nextInt(k);
			i2 = r.nextInt(k);			
			if (!u.Connected(i1, i2)) {
				u.Union(i1, i2);
			}
			AC = u.AllConnected();
		}
		l2 = System.currentTimeMillis();
		qu = (l2-l1)*0.001;
		*/
		//Weighted Quick Union Algorithm
		
		AC = false;
		l1 = System.currentTimeMillis();
		while (!AC) {
			i1 = r.nextInt(k);
			i2 = r.nextInt(k);			
			if (!w.Connected(i1, i2)) {
				w.Union(i1, i2);
			}
			AC = w.AllConnected();
		}
		l2 = System.currentTimeMillis();
		wqu = (l2-l1)*0.001;
		
		System.out.println(k+"      "+qf +"      "+qu+"       "+wqu);
		write(k, qf, qu, wqu);
	
		}
		close();
}
}

