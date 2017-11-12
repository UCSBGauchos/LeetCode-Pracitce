package leetcodePractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class TreeMaxParh {
	
	public Stack<Node> stack = new Stack<Node>();
	public ArrayList<Stack<Node>> paths = new ArrayList<Stack<Node>>();
	
	public boolean traverse(Node node, Node end){ 
		if(node == null){
			return false;
		}
		if(node == end){
			//System.out.println("Get the end");
			stack.push(node);
			Stack<Node> tmpStack = new Stack<Node>();
			Iterator<Node> it = stack.iterator();
			while(it.hasNext()){
				Node node1 = it.next();  
                tmpStack.push(node1);
			}
			paths.add(tmpStack);
			stack.pop();
			return true;
		}
		if(!isInStack(node)){
			stack.push(node);
			//System.out.println("visiting "+node.value);
			traverse(node.left, end);
			traverse(node.right, end);
			traverse(node.parents, end);
			stack.pop();
		}
		return false;
	}
	
	public boolean isInStack(Node node){
		Iterator<Node> it = stack.iterator();
		while(it.hasNext()){
			Node node1 = it.next();  
			if(node == node1){
				return true;
			}
		}
		return false;
	}
	
	public int getPath(ArrayList<Node> list){
		int sum = 0;
		int max = 0;
		for(Node startNode: list){
			for(Node endNode: list){
				traverse(startNode, endNode);
				for(Stack<Node> path: paths){
					sum = 0;
					Iterator<Node> it = path.iterator();
					while(it.hasNext()){
						Node node1 = it.next();
						System.out.print(node1.value);
						sum+=node1.value;
					}
					System.out.println();
				}
				if(sum>max){
					max = sum;
				}
			}
		}
		return max;
	}
	
	
	public static void main(String [] args){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		ArrayList<Node> list = new ArrayList<Node>();
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);
		n1.addLeft(n2);
		n1.addRight(n3);
		n3.addLeft(n4);
		n3.addRight(n5);
		TreeMaxParh tmp = new TreeMaxParh();
		System.out.println("Max is "+tmp.getPath(list));
		//tmp.getPath(n2,list);
	}
}
