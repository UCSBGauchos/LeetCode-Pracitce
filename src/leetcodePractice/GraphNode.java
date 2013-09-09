package leetcodePractice;

import java.util.ArrayList;

public class GraphNode {
	int value;
	int level;
	ArrayList<GraphNode> adj;
	
	public GraphNode(int _value, int _level){
		value = _value;
		level = _level;
		adj = new ArrayList<GraphNode>();
	}
	
	public void addList(GraphNode node){
		adj.add(node);
	}
}
