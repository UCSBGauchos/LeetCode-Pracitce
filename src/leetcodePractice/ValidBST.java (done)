package leetcodePractice;

import java.util.ArrayList;

public class ValidBST {
	
	public void inOrderTraverse(TreeNode node, ArrayList<Integer> list){
		if(node == null){
			return;
		}
		inOrderTraverse(node.left, list);
		list.add(node.val);
		inOrderTraverse(node.right, list);
	}
	
	public boolean isValidBST(TreeNode node){
		ArrayList<Integer> list = new ArrayList<Integer>();
		inOrderTraverse(node, list);
		for(int i = 1; i<list.size(); i++){
			if(list.get(i)<=list.get(i-1)){
				return false;
			}
		}
		return true;
		
	}
	public static void main(String [] args){
		TreeNode n1 = new TreeNode(10);
		TreeNode n2 = new TreeNode(5);
		TreeNode n3 = new TreeNode(15);
		TreeNode n4 = new TreeNode(6);
		TreeNode n5 = new TreeNode(20);
		
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right = n5;
		
		ValidBST vb = new ValidBST();
		System.out.println(vb.isValidBST(n1));
		
		
		
	}
}
