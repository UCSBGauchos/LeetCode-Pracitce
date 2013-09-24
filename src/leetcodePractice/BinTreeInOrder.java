package leetcodePractice;

import java.util.ArrayList;

public class BinTreeInOrder {
	
	public void inOrder(Node root, ArrayList<Integer> list){
		if(root == null){
			return;
		}
		inOrder(root.left, list);
		list.add(root.value);
		inOrder(root.right, list);
	}
	
	public static void main(String [] args){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.addRight(n2);
		n2.addLeft(n3);
		ArrayList<Integer> list = new ArrayList<Integer>();
		BinTreeInOrder bto = new BinTreeInOrder();
		bto.inOrder(n1, list);
		System.out.println(list);
	}
}
