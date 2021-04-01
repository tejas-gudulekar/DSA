import java.util.*;

public class Graph {
    //HashMap of Integer -> List
    private HashMap < Integer, List < Integer >> adjacentList;
    private int nodeCount;
    
    //Constructor for constructing the values
    Graph() {
        adjacentList = new HashMap < Integer, List < Integer >> ();
    }
    
    //Adding node and creating a empty ArrayList
    public void addNode(int value) {
        adjacentList.put(value, new ArrayList < Integer > ());
        nodeCount++;
    }
    
    //Adding the edge value
    public void addEdge(int value1, int value2) {
        adjacentList.get(value1).add(value2);
        adjacentList.get(value2).add(value1);
    }
    
  
  //For showing the connections
    public void showConnections() {
        Set < Integer > nodes = adjacentList.keySet();
        for (int node: nodes) {
            List < Integer > nodeConnections = adjacentList.get(node);
            StringBuilder str = new StringBuilder();
            for (int edge: nodeConnections) {
                str.append(edge + " ");
            }
            System.out.println(node + " --> " + str);
        }
    }

    public void getNodesCount() {
        System.out.println("Nodes count: " + nodeCount);
    }

    public static void main(String[] args) {
        Graph g = new Graph();

        g.addNode(1);
        g.addNode(2);
        g.addNode(3);
        g.addNode(4);
        g.addNode(5);
        g.addNode(6);

        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(2, 3);
        g.addEdge(4, 5);
        g.addEdge(3, 5);
        g.addEdge(3, 6);
        g.addEdge(5, 6);

        g.getNodesCount();
        g.showConnections();
    }
}
