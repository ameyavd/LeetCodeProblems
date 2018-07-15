package leetcode.datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GraphImpl {
	
	int vert; //represents number of vertices in graph i.e. size of graph
	LinkedList<Integer> adjListArray[];
		
		public GraphImpl(int v){
			vert = v;
			//size of array is number of vertices
			adjListArray = new LinkedList[v];
			
			//create a new list for each vertex such that adjacent nodes can be stored
			for(int i=0; i<v; i++){
				adjListArray[i] = new LinkedList<>();
			}
		}
	
	
	 void addEdge(int src, int dest){
		adjListArray[src].add(dest);
		//graph.adjListArray[dest].addFirst(src);
	}
	
	 void printGraph(GraphImpl graph){
		for(int v=0; v<graph.vert; v++){
			System.out.println("Adjacency list of vertex"+ v);
			System.out.print("head "+v);
			for(Integer pc: graph.adjListArray[v]){
				System.out.print(" -> "+pc);
			}
			System.out.println("\n");
		}
	}
	
	 void DFSUtil(int v, boolean visited[]){
		visited[v] = true;
		System.out.println(v+" ");
		
		Iterator<Integer> i = adjListArray[v].listIterator();
		while(i.hasNext()){
			int n = i.next();
			if(!visited[n]){
				DFSUtil(n, visited);
			}
		}
	}
	 
	 void DFS(int v){
		 boolean visited[] = new boolean[vert];	 
		 DFSUtil(v, visited);
	 }
	 
	 public void BFS(int v){
		 boolean[] visited = new boolean[vert];
		 
		 LinkedList<Integer> queue = new LinkedList<>();
		 visited[v] = true;
		 queue.add(v);
		 
		 
		 while(queue.size() != 0){
			 v = queue.poll();
			 System.out.println(" "+v);
			 Iterator<Integer> i = adjListArray[v].listIterator();
			 while(i.hasNext()){
				 int n = i.next();
				 if(!visited[n]){
				 visited[n] = true;
				 queue.add(n);
				 }
			 }
		 }
	 }
	 
	 public boolean isCyclicUtil(int v, boolean[] visited, boolean[] recStack){
		 if(recStack[v])
			 return true;
		 
		 if(visited[v])
			 return false;
		 
		 visited[v] = true;
		 recStack[v] = true;
		 
		 List<Integer> children = adjListArray[v];
		 for(Integer child : children){
			 if(isCyclicUtil(child, visited, recStack))
				 return true;
		 }
		 
		 recStack[v] = false;
		 
		 return false;
	 }
	 
	 public boolean isCyclic(){
			boolean[] visited = new boolean[vert];
			boolean[] recStack = new boolean[vert];
			
			for(int i=0; i<vert; i++){
				if(isCyclicUtil(i, visited, recStack))
					return true;
			}
			
			return false;
		}

	public static void main(String[] args) {
		
		int v = 5;
		GraphImpl graph = new GraphImpl(v);
		graph.addEdge(0, 1);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 0);
		graph.addEdge(3, 1);
		graph.addEdge(4, 3);
		
		
		graph.printGraph(graph);
		
	//	System.out.println("DFS from vertex 0");
	//	graph.DFS(0);
		
		graph.BFS(0);
		
		if(graph.isCyclic()){
			System.out.println("Is Cyclic");
		} else {
			System.out.println("Not cyclic");
		}
		
		

		

	}

}
