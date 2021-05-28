/*
Implementation of graph using BFS and DFS(using recursion and stack)
*/
import java.util.*;

public class Graph{
	
	//HasMap Integer -> ArrayList of Integers
	private HashMap<Integer, List <Integer>> adjacencyList;
	private int nodeCount;
	
	Graph(){
		adjacencyList = new HashMap<Integer, List<Integer>>();
		nodeCount = 0;
	}
	
	void addNode(int data){
		adjacencyList.put(data, new ArrayList<Integer>());
		nodeCount ++;
	}
	
	void addEdge(int nodeOne,int nodeTwo) {
		adjacencyList.get(nodeOne).add(nodeTwo);
		adjacencyList.get(nodeTwo).add(nodeOne);
	}
	
	//For showing the connections
    public void showConnections() {
    	// Getting all the nodes
        Set < Integer > nodes = adjacencyList.keySet();
        //For each node
        for (int node: nodes) {
        	//Getting the list
            List < Integer > nodeConnections = adjacencyList.get(node);
            StringBuilder str = new StringBuilder();
            //Adding the edge value in the string
            for (int edge: nodeConnections) {
                str.append(edge + " ");
            }
            //Displaying the connection
            System.out.println(node + " --> " + str);
        }
    }
    
    //BFS
    void bfs(int source, int destination) {
    	
    	boolean[] visited= new boolean[nodeCount];
    	int[] parent = new int[nodeCount];
    	Queue<Integer> q = new LinkedList<Integer>();
    
    	q.add(source);
    	parent[source] = -1;
    	visited[source] = true;
    	
    	while(!q.isEmpty()) {
    		int cur = q.poll();
    		if(cur == destination) break;
    		
    		List<Integer> neighbours = adjacencyList.get(cur);
    		for(int neighbour : neighbours) {
    			if(!visited[neighbour]) {
    				visited[neighbour] = true;
    				q.add(neighbour);
    				parent[neighbour] = cur;
    			}
    		}
    	}
    	
    	int distance = 0;
    	int cur = destination;
    	
    	while(parent[cur]!=-1) {
    		System.out.print(cur + " --> ");
    		cur = parent[cur];
    		distance++;
    	}
    	
    	System.out.print(cur);
    	System.out.println(" Distance: " + distance);
    }       
    

   boolean dfsRec(int source,int destination,boolean[] visited) {
	   if(source==destination) return true;
	   
	   for(int node: adjacencyList.get(source)) {
		   if(!visited[node]) {
			   visited[node] = true;
			   boolean isConnected = dfsRec(node,destination,visited);
			   if(isConnected) {
				   return true;
			   }
		   }
	   }
	   
	   return false;
   }
   
   boolean dfsStack(int source,int destination) {
	    Stack<Integer> stack = new Stack<>();
	    boolean[] visited = new boolean[nodeCount];
	    stack.push(source);
  		visited[source] = true;
  		
  		while(!stack.isEmpty()) {
  			int cur = stack.pop();
  			if(cur==destination) return true;
  	  		
  	  		for(int node: adjacencyList.get(source)) {
  	  			if(!visited[node]) {
  	  				visited[node] = true;
  	  				stack.push(node);
  	  			}
  	  		}
  		}
  		
  		return false;
   }
   	boolean dfs(int source, int destination) {
   		boolean[] visited = new boolean[nodeCount];
   		visited[source] = true;
   		return dfsRec(source,destination,visited);
   		
   	}
    
    public static void main(String[] args) {
    	Graph g = new Graph();
    
    	g.addNode(0);
    	g.addNode(1);
    	g.addNode(2);
    	g.addNode(3);
    	g.addNode(4);
    	
    	
    	
       g.addEdge(0, 1);
       g.addEdge(1, 2);
       g.addEdge(2, 3);
       g.addEdge(3, 4);
       g.addEdge(0, 4);
       g.addEdge(2, 4);
       
 
       	g.bfs(0,3);
        boolean isConnected = g.dfsStack(0, 1);
        System.out.println(isConnected);

    }
}
