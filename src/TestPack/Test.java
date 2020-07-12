package TestPack;
import SortingAlgorithms.*;
import java.util.Random;
import java.util.*;
import java.lang.*;
import java.io.*;
import Graphs.*
;
public class Test {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0 ; i<7 ;i++)
			set.add(i);
		UDgraph<Integer> graph = new UDgraph<Integer>(set);
		graph.connect(0, 1);
		graph.connect(0, 2);
		graph.connect(0, 5);
		graph.connect(0, 6);
		graph.connect(1, 3);
		graph.connect(2, 3);
		graph.connect(6, 4);
		graph.connect(5, 4);
		
		
		Bipartie b = new Bipartie();
		
		System.out.println(b.isBipartie(graph));
	}
}

