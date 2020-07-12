package Graphs;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UDgraph<T> {
	private Map<T,Set<T>> graph;
	public UDgraph(Iterable<T> vertices) {
		graph = new HashMap<T,Set<T>>();
		for(T t:vertices)
			graph.put(t,new HashSet<T>());
	}
	public void connect(T n,T m) {
		graph.get(n).add(m);
		graph.get(m).add(n);
	}
	public Iterable<T> adj(T m){
		return graph.get(m);
	}
	public int numVertices() {
		return graph.size();
	}
	public int numEdges() {
		int edges = 0;
		for (T t: graph.keySet()) {
			edges += graph.get(t).size();
		}
		return edges/2;
	}
	public Iterable<T> vertices(){
		return graph.keySet();
	}
}
