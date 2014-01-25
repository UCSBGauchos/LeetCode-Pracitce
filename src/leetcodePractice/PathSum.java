package leetcodePractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class PathSum {
	
	public boolean help(TreeNode root, int sum, int count){
		boolean result = false;
		count = count+root.val;
		//System.out.println("count is now "+count);
		if(root.left == null&&root.right == null&&count == sum){
			return true;
		}
		if(root.left!=null){
			result = help(root.left, sum, count);
		}
		if(result == true){
			return true;
		}
		if(root.right!=null){
			result = help(root.right, sum, count);
		}
		return result;
	}
	
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null){
			return false;
		}
		int count = 0;
		return help(root, sum, count);
    }
	
	public static void main(String [] args){
		PathSum p = new PathSum();
		TreeNode n1 = new TreeNode(5); 
		TreeNode n2 = new TreeNode(4); 
		TreeNode n3 = new TreeNode(8); 
		TreeNode n4 = new TreeNode(11);
		TreeNode n5 = new TreeNode(13);
		TreeNode n6 = new TreeNode(4);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(2); 
		TreeNode n9 = new TreeNode(1); 
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n3.left = n5;
		n3.right = n6;
		n4.left = n7;
		n4.right = n8;
		n5.right = n9;
		System.out.println(p.hasPathSum(n1, 22));
	}
}
