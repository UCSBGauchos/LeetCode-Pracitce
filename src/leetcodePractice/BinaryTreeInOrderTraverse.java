package leetcodePractice;

import java.util.ArrayList;

public class BinaryTreeInOrderTraverse {
	
	 public void help(TreeNode root,  ArrayList<Integer> result){
		 if(root == null){
			 return;
		 }
		 help(root.left, result);
		 result.add(root.val);
		 help(root.right, result);
	 }
	
	 public ArrayList<Integer> inorderTraversal(TreeNode root) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 help(root, result);
		 return result;
	 }
	
	public static void main(String [] args){
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		n1.right = n2;
		n2.left = n3;
	}
}
