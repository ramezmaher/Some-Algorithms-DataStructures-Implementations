package Graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Bipartie<T> {
	public Bipartie() {
	}
	public boolean isBipartie(UDgraph<T> g) {
		Map<T,Boolean> visited = new HashMap<T,Boolean>();
		for(T t:g.vertices())
			visited.put(t, false);
		Set<T> red = new HashSet<T>();
		Set<T> blue = new HashSet<T>();
		Queue<T> q = new LinkedList<T>();
		for(T t: g.vertices()) {
			if(visited.get(t) == false) { 
				q.add(t);
			while(!q.isEmpty()) {
				T var = q.poll();
				if(visited.get(var))
					continue;
				visited.put(var, true);
				if(!red.contains(var) && !blue.contains(var)) {
					red.add(var);
					for (T m:g.adj(var))
					{
						blue.add(m);
						q.add(m);
					}
				}
				else if(blue.contains(var) && red.contains(var))
					return false;
				else if(blue.contains(var)) {
					for (T m:g.adj(var))
					{
						red.add(m);
						q.add(m);
					}
				}
				else{
					for (T m:g.adj(var))
					{
						blue.add(m);
						q.add(m);
					}
				}
				System.out.println("Red");
				for (T n:red)
					System.out.print(n.toString()+" ");
				System.out.println(" ");
				System.out.println("Blue");
				for (T n:blue)
					System.out.print(n.toString()+" ");
				System.out.println(" ");
			}
		}
		}
		return true;
	}
}
