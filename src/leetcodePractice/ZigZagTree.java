package leetcodePractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTree {
	
	ArrayList<Stack<Integer>> oddLines = new ArrayList<Stack<Integer>>();
	ArrayList<Queue<Integer>> evenLines = new ArrayList<Queue<Integer>>();
	//ArrayList<ArrayList<Integer>> wholeTree = new ArrayList<ArrayList<Integer>>();
	
	public void zigZag(Node node, int level){
		if(node == null){
			return;
		}
//		System.out.println(level%2);
//		System.out.println(level/2);
//		System.out.println(evenLines.size());
//		System.out.println();
		if(level%2==0&&(level/2)==evenLines.size()){
			Queue<Integer> evenLine = new LinkedList<Integer>();
			evenLine.add(node.value);
			evenLines.add(evenLine);
		}else if(level%2==0&&(level/2)!=evenLines.size()){
			Queue<Integer> evenLine = evenLines.get(level/2);
			evenLine.add(node.value);
		}else if(level%2!=0&&(level/2)==oddLines.size()){
			Stack<Integer> oddLine = new Stack<Integer>();
			oddLine.push(node.value);
			oddLines.add(oddLine);
		}else if(level%2!=0&&(level/2)!=oddLines.size()){
			Stack<Integer> oddLine = oddLines.get(level/2);
			oddLine.push(node.value);
		}
		zigZag(node.left, level+1);
		zigZag(node.right, level+1);
		
	}
	
	public ArrayList<ArrayList<Integer>> combine(ArrayList<Queue<Integer>> evenLines, ArrayList<Stack<Integer>> oddLines){
		ArrayList<ArrayList<Integer>> wholeTree = new ArrayList<ArrayList<Integer>>();
		int allLength = evenLines.size()+oddLines.size();
		for(int i=0;i<allLength;i++){
			ArrayList<Integer> line = new ArrayList<Integer>();
			wholeTree.add(line);
		}
		for(int evenIndex = 0; evenIndex<allLength; evenIndex = evenIndex+2){
			ArrayList<Integer> newline = wholeTree.get(evenIndex);
			Queue<Integer> oldQueue = evenLines.get(evenIndex/2);
			for(int n: oldQueue){
				newline.add(n);
			}
		}
		for(int oddIndex = 1; oddIndex<allLength; oddIndex = oddIndex+2){
			ArrayList<Integer> newline = wholeTree.get(oddIndex);
			Stack<Integer> oldStack = oddLines.get(oddIndex/2);
			while(oldStack.size()!=0){
				newline.add(oldStack.pop());
			}
		}
		return wholeTree;
	}
	
	
	
	
	public static void main(String [] args){
		Node n3 = new Node(3);
		Node n9 = new Node(9);
		Node n20 = new Node(20);
		Node n15 = new Node(15);
		Node n7 = new Node(7);
		
		n3.addLeft(n9);
		n3.addRight(n20);
		n20.addLeft(n15);
		n20.addRight(n7);
		
		ZigZagTree zz = new ZigZagTree();
		zz.zigZag(n3, 0);
		
		ArrayList<ArrayList<Integer>> result = zz.combine(zz.evenLines, zz.oddLines);
		System.out.println(result);
		
		
	}

}
