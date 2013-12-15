package leetcodePractice;

import java.util.ArrayList;

public class PreOrderTraverse {
	
	public void preorderTraversalHelper(SimpleTreeNode root, ArrayList<Integer> result){
		if(root == null){
			return;
		}
		result.add(root.val);
		preorderTraversalHelper(root.left, result);
		preorderTraversalHelper(root.right, result);
	}
	
	public ArrayList<Integer> preorderTraversal(SimpleTreeNode root){
		ArrayList<Integer> result = new ArrayList<Integer>();
		preorderTraversalHelper(root, result);
		return result;
	}
	
	public static void main(String [] args){
		SimpleTreeNode n1 = new SimpleTreeNode(1);
		SimpleTreeNode n2 = new SimpleTreeNode(2);
		SimpleTreeNode n3 = new SimpleTreeNode(3);
		n1.right = n2;
		n2.left = n3;
		PreOrderTraverse p = new PreOrderTraverse();
		p.preorderTraversal(n1);
		ArrayList<Integer> result = p.preorderTraversal(n1);
		for(int i: result){
			System.out.println(i);
		}
		
	}
}
