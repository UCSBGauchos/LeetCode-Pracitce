package leetcodePractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class PathSum {
	
//	Stack<Node> path = new Stack<Node>();
//	ArrayList<Stack<Node>> paths = new ArrayList<Stack<Node>>();
//	
//	
//	public void getPath(Node n){
//		if(n!=null){
//			path.add(n);
//		}
//		if(n.left==null && n.right==null){
//			Stack<Node> tmpStack = new Stack<Node>();
//			Iterator<Node> it = path.iterator();
//			while(it.hasNext()){
//				Node node1 = it.next();  
//                tmpStack.push(node1);
//			}
//			paths.add(tmpStack);
//			path.pop();
//			return;
//		}
//		if(n.left!=null){
//			getPath(n.left);
//		}
//		if(n.right!=null){
//			getPath(n.right);
//		}
//		path.pop();
//	}
	int max = 0;
	public ArrayList<Integer> getPath(Node n){
		int sum = 0;
	
		if(n.left == null && n.right==null){
			ArrayList<Integer> children = new ArrayList<Integer>();
			children.add(n.value);
			return children;
		}
		if(n.left==null){
			ArrayList<Integer> rightChildren = getPath(n.right);
			ArrayList<Integer> newChildren = new ArrayList<Integer>();
			for(int i: rightChildren){
				int newValue = i+n.value;
				newChildren.add(newValue);
			}
			return newChildren;
		}
		if(n.right==null){
			ArrayList<Integer> leftChildren = getPath(n.left);
			ArrayList<Integer> newChildren = new ArrayList<Integer>();
			for(int i: leftChildren){
				int newValue = i+n.value;
				newChildren.add(newValue);
			}
			return newChildren;
		}
		if(n.left != null && n.right!=null){
			ArrayList<Integer> leftChildren = getPath(n.left);
			ArrayList<Integer> rightChildren = getPath(n.right);
			ArrayList<Integer> children = new ArrayList<Integer>();
			children.addAll(leftChildren);
			children.addAll(rightChildren);
			ArrayList<Integer> newChildren = new ArrayList<Integer>();
			for(int i: children){
				int newValue = i+n.value;
				newChildren.add(newValue);
			}
			return newChildren;
		}
		return null;
	}
	
	public static void main(String [] args){
		Node level1n1 = new Node(5);
		Node level2n1 = new Node(4);
		Node level2n2 = new Node(8);
		Node level3n1 = new Node(11);
		Node level3n2 = new Node(13);
		Node level3n3 = new Node(4);
		Node level4n1 = new Node(7);
		Node level4n2 = new Node(2);
		Node level4n3 = new Node(1);
		
		level1n1.addLeft(level2n1);
		level1n1.addRight(level2n2);
		
		level2n1.addLeft(level3n1);
		level2n2.addLeft(level3n2);
		level2n2.addRight(level3n3);
		
		level3n1.addLeft(level4n1);
		level3n1.addRight(level4n2);
		level3n3.addRight(level4n3);
		
		PathSum ps = new PathSum();
//		ps.getPath(level1n1);
//		for(Stack<Node> stack: ps.paths){
//			int sum = 0;
//			for(Node n: stack){
//				sum+=n.value;
//			}
//			System.out.println(sum);
//		}
		ArrayList<Integer> result = ps.getPath(level1n1);
		for(int i: result){
			System.out.print(i+" ");
		}
	}
}
