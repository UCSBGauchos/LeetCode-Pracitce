package leetcodePractice;

import java.util.LinkedList;

public class FlattenBinaryTree {
	
	public LinkedList<Node> list = new LinkedList<Node>();
	public void flatten(Node root){
		if(root == null){
			return;
		}
		list.add(root);
		flatten(root.left);
		flatten(root.right);
	}
	
	public static void main(String [] args){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		n1.addLeft(n2);
		n1.addRight(n5);
		n2.addLeft(n3);
		n2.addRight(n4);
		n5.addRight(n6);
		FlattenBinaryTree fbt = new FlattenBinaryTree();
		fbt.flatten(n1);
		for(Node n: fbt.list){
			System.out.println(n.value);
		}
	}
}
