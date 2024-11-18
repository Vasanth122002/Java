package RealCodes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Graph {
private	LinkedList<Integer> adj[];
private int v;//vertices
private int e;//edges
//private int[][] addMatrix;
	
public Graph(int nodes) {
	this.v = nodes;
	this.e = 0;
//	this.addMatrix = new int[nodes][nodes];
	this.adj = new LinkedList[nodes];
	for(int i=0;i < nodes ;i++) {
		this.adj[i]  = new LinkedList<>();
	}
}
public void addEdge(int u, int v) {
//addMatrix[u][v] = 1;
//addMatrix[v][u] = 1;
e++;
this.adj[u].add(v);
this.adj[v].add(u);
}
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(v+" vertices ,"+e+" edges"+"\n");
	for(int V = 0; V<v;V++) {
      sb.append(V+" : ");
      for(int w : adj[V]) {
    	  sb.append(w+" ");
      }
    sb.append("\n");
      }
	return sb.toString();
}
public void bfs(int s) {
	boolean[] visited = new boolean[v];
	Queue<Integer> q = new LinkedList<>();
	visited[s] = true;
	q.offer(s);
	while(!q.isEmpty()) {
		int u = q.poll();
		System.out.print(u+" ");
		for(int v : adj[u]) {
			if(!visited[v]) {
				visited[v] = true;
				q.offer(v);
			}
		}
	}
	System.out.println(" ");
}
public void dfs(int s) {
	boolean[] visited = new boolean[v];
	Stack<Integer> stack = new Stack<>();
	stack.push(s);
	while(!stack.isEmpty()) {
		int u = stack.pop();
		if(!visited[u]) {
			visited[u] = true;
			System.out.print(u+" ");
			for(int V : adj[u]) {
				if(!visited[V]) {
					stack.push(V);
				}
			}
		}
	}
	System.out.println(" ");
}
public void DfsRecursive() {
	boolean []visited = new boolean[v];
 for(int V = 0; V<v ; V++) {
	 if(!visited[V]) {
		 DfsRecursive(V,visited);
  }
 }
 System.out.println(" ");
}
	private void DfsRecursive(int V, boolean[] visited) {
visited[V] = true;
System.out.print(V+ " ");
for(int w : adj[V]) {
	if(!visited[w]) {
		DfsRecursive( w, visited);
	}
  }
	
}
	public void DfsRecuesionUnConnectedComponent() {
		boolean []visited = new boolean[v];
		int count=0;
		int []componentId = new int[v];
		for(int V =0; V<v;V++) {
		if(!visited[V]) {
			DfsRecuesionUnConnectedComponent(V,visited,componentId,count);
			count++;
		}
	}
		for(int i=0;i<v;i++) {
			System.out.println("Index of "+i+" componentId is "+componentId[i]);
		}	
		System.out.println("Connected_Components groups are "+count);
}
	private void DfsRecuesionUnConnectedComponent(int V, boolean[] visited, int[] componentId, int count) {
  visited[V] = true;
  componentId[V] = count;
  for(int w : adj[V]) {
  if(!visited[w]) {
	  DfsRecuesionUnConnectedComponent(w,visited,componentId,count);
  }
  }	
	}
	public static void main(String[] args) {
	Graph g = new Graph(10);	
g.addEdge(0, 1);
g.addEdge(4, 2);
g.addEdge(3, 0);
g.bfs(4);// bread first search
g.dfs(0);//depth first search
g.DfsRecursive();//depth first search - Recursion
g.DfsRecuesionUnConnectedComponent();//depth first search - Recursion-unconnected-NumberOfComponents
System.out.println(g);
	}

}
