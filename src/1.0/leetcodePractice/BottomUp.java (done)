package leetcodePractice;

import java.util.ArrayList;

public class BottomUp {
	
	
	ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
	public void bottomUp(Node node, int level){
		if(node == null){
			return;
		}
		if(level == lists.size()){
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(node.value);
			lists.add(list);
		}else{
			ArrayList<Integer> list = lists.get(level);
			list.add(node.value);
		}
		bottomUp(node.left, level+1);
		bottomUp(node.right, level+1);
	}
	
	public static void main(String [] args){
		Node n3 = new Node(3);
		Node n9  = new Node(9);
		Node n20 = new Node(20);
		Node n15 = new Node(15);
		Node n7  = new Node(7);
		Node n10 = new Node(10);
		Node n11 = new Node(11);
		
		n3.addLeft(n9);
		n3.addRight(n20);
		n20.addLeft(n15);
		n20.addRight(n7);
		n9.addLeft(n10);
		n9.addRight(n11);
		
		BottomUp bu = new BottomUp();
		bu.bottomUp(n3, 0);
		
		System.out.println(bu.lists);
	}
}
