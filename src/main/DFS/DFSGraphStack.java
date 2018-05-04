package main.DFS;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFSGraphStack {

	private int V; // No. of vertices

	// Array of lists for Adjacency List Representation
	private LinkedList<Integer> adj[];

	// Constructor
	public DFSGraphStack(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	public void addEdge(int v, int w) {
		adj[v].add(w); // Add w to v's list.
	}

	// The function to do DFS traversal. It uses recursive DFSUtil()
	public void DFS(int v) {
		boolean visited[] = new boolean[V];
		visited[v] = true;
		Stack<Integer> stackData = new Stack<Integer>();
		stackData.push(v);
		while (stackData.size() != 0) {
            v = stackData.pop();
            System.out.print(v+" ");
			
			Iterator<Integer> i = adj[v].listIterator();
			LinkedList<Integer> tempList = new LinkedList<Integer>();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					stackData.add(n);
				}
			}
			System.out.println("Stack has: " + stackData);
		}
	}
}
