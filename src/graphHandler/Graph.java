package graphHandler;
import java.util.*;
import java.io.*;
  

public class Graph {
	
	private HashMap<Integer, Node> Nodes;
	private int L;
	

	public Graph() {
		this.Nodes = new HashMap<Integer, Node>();
		this.L = 0;
	}

	/**
	 * Creates a random graph with an especific amount of nodes, using a pobability 
	 * function, where we use 2 numbers one for probability and the other is a random 
	 * value and if probability is lower than the random value creates a link between 
	 * nodes
	 * 
	 * @param numNodes    Amount of nodes in graph
	 * @param probability Random number between (0 <= p <= 1)
	 * @return
	 */
	public void createRandomGraph(int numNodes, double probability) {

		this.Nodes = new HashMap<Integer, Node>();
		this.L = 0;

		for (int i = 0; i < numNodes; i++) {
			Nodes.put(i, new Node(i));
		}

		for (int i = 0; i < numNodes; i++) {
			for (int j = 0; j < numNodes; j++) {
				
				double randomVal = Math.random();
				
				if ((randomVal < probability) && (i != j)) {
					Nodes.get(i).setLink(j);
					L = L + 1;
				}
			}
		}
	}

	public int getL() {
		return L;
	}
	
	public HashMap<Integer, Node> getNodes() {
		return this.Nodes;
	}

}
