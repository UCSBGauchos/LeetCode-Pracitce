package leetcodePractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class trangleMinPath {
	
	Stack<GraphNode> path = new Stack<GraphNode>();
	ArrayList<Stack<GraphNode>> paths = new ArrayList<Stack<GraphNode>>();
	
	public void getPath(GraphNode node, GraphNode end){
		//System.out.println("pushing "+node.value);
		path.push(node);
		if(node == end){
			Stack<GraphNode> tmpPath = new Stack<GraphNode>();
			Iterator<GraphNode> it = path.iterator();
			while(it.hasNext()){
				GraphNode node1 = it.next();
				tmpPath.add(node1);
			}
			paths.add(tmpPath);
			//System.out.println("pop "+path.peek().value);
			path.pop();//pop for end
			return;
			//return true;
		}
		for(GraphNode n: node.adj){
			if(!path.contains(n)){
				getPath(n,end);
			}
		}
		//System.out.println("pop "+path.peek().value);
		path.pop();//pop for loop
		//return false;
		
		
	}
	
	public static void main(String [] args){
		GraphNode level1N1 = new GraphNode(2,1);
		
		GraphNode level2N1 = new GraphNode(3,2);
		GraphNode level2N2 = new GraphNode(4,2);
		
		GraphNode level3N1 = new GraphNode(6,3);
		GraphNode level3N2 = new GraphNode(5,3);
		GraphNode level3N3 = new GraphNode(7,3);

		GraphNode level4N1 = new GraphNode(4,4);
		GraphNode level4N2 = new GraphNode(1,4);
		GraphNode level4N3 = new GraphNode(8,4);
		GraphNode level4N4 = new GraphNode(3,4);
		
		
		level1N1.addList(level2N1);
		level1N1.addList(level2N2);
		
		level2N1.addList(level3N1);
		level2N1.addList(level3N2);
		level2N1.addList(level3N3);
		level2N2.addList(level3N1);
		level2N2.addList(level3N2);
		level2N2.addList(level3N3);
		
		level3N1.addList(level4N1);
		level3N1.addList(level4N2);
		level3N1.addList(level4N3);
		level3N1.addList(level4N4);
		level3N2.addList(level4N1);
		level3N2.addList(level4N2);
		level3N2.addList(level4N3);
		level3N2.addList(level4N4);
		level3N3.addList(level4N1);
		level3N3.addList(level4N2);
		level3N3.addList(level4N3);
		level3N3.addList(level4N4);
		
		
		
		trangleMinPath tmp = new trangleMinPath();
		tmp.getPath(level1N1, level4N1);
		tmp.getPath(level1N1, level4N2);
		tmp.getPath(level1N1, level4N3);
		tmp.getPath(level1N1, level4N4);
		int min = Integer.MAX_VALUE;
		for(Stack<GraphNode> p: tmp.paths){
			int sum = 0;
			for(GraphNode n: p){
				System.out.print(n.value+" ");
				sum+=n.value;
			}
			if(sum<min){
				min = sum;
			}
			System.out.println();
		}
		System.out.println("Best is "+min);
	}
}
