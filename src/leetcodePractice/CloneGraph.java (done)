package leetcodePractice;

import java.util.ArrayList;

public class CloneGraph {
	

	public void help(UndirectedGraphNode root, UndirectedGraphNode node, ArrayList<UndirectedGraphNode> hasVisited){
		hasVisited.add(node);
		for(UndirectedGraphNode n: node.neighbors){
			UndirectedGraphNode newNode = new UndirectedGraphNode(n.label);
			root.neighbors.add(newNode);
			if(!hasVisited.contains(n)){
				help(newNode, n, hasVisited);
			}
		}
		
	}
	
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if(node == null){
			return null;
		}
		UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
		UndirectedGraphNode newRoot = newNode;
		ArrayList<UndirectedGraphNode> hasVisited = new ArrayList<UndirectedGraphNode>();
		help(newNode, node, hasVisited);
		return newRoot;
	}
	
	public static void main(String [] args){
		CloneGraph c = new CloneGraph();
		UndirectedGraphNode n0 = new UndirectedGraphNode(0);
		UndirectedGraphNode n1 = new UndirectedGraphNode(1);
		UndirectedGraphNode n2 = new UndirectedGraphNode(2);
		n0.neighbors.add(n1);
		n0.neighbors.add(n2);
		n1.neighbors.add(n0);
		n1.neighbors.add(n2);
		n2.neighbors.add(n2);
		n2.neighbors.add(n1);
		n2.neighbors.add(n0);
		UndirectedGraphNode root = c.cloneGraph(n2);
		for(UndirectedGraphNode n: root.neighbors){
			System.out.println(n.label);
		}
	}
}
