package Graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class UDgraphSearch<T> {
	private UDgraph<T> graph;
	private Map<T,Boolean> visited;
	public UDgraphSearch(UDgraph<T> g) {
		this.graph = g;
		visited = new HashMap<T,Boolean>();
		for (T t:g.vertices())
			visited.put(t,false);
	}
	public boolean search(T n) {
		return bfs(n); 
	}
	private boolean bfs(T n) {
		Queue<T> q = new LinkedList<T>();
		int counter = 0;
		while (counter < visited.size()) {
			for(T t:visited.keySet()) {
				if(!visited.get(t)) {
					q.add(t);
				}
			}
			while (!q.isEmpty()) {
				T t = q.poll();
				if(!visited.get(t)) {
					if(t.equals(n))
						return true;
					for (T m: graph.adj(t))
						q.add(m);
					visited.put(t,true);
					counter++;
				}
			}
		}
		return false;
	}
}
