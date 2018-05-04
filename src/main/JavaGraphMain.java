package main;

import main.BFS.BFSGraph;
import main.DFS.DFSGraph;
import main.DFS.DFSGraphStack;

public class JavaGraphMain {
	public static void main(String[] args) {
		DFSGraphStack dfsg = new DFSGraphStack(4);
		dfsg.addEdge(0, 1);
		dfsg.addEdge(0, 2);
		dfsg.addEdge(1, 2);
		dfsg.addEdge(2, 3);
		dfsg.addEdge(2, 0);
		dfsg.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
		dfsg.DFS(2);
		System.out.println("");
		
		BFSGraph bfsg = new BFSGraph(4);

		bfsg.addEdge(0, 1);
		bfsg.addEdge(0, 2);
		bfsg.addEdge(1, 2);
		bfsg.addEdge(2, 0);
		bfsg.addEdge(2, 3);
		bfsg.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		bfsg.BFS(2);
		System.out.println("");
	}
}
