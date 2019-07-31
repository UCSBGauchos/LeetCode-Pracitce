package leetcodePractice;

import java.util.ArrayList;

public class BinaryTreeLevel {
	
	public void help(TreeNode root, int level, ArrayList<ArrayList<Integer>> result){
		if(root == null){
			return;
		}
		if(level == result.size()){
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(root.val);
			result.add(list);
		}else{
			result.get(level).add(root.val);
		}
		help(root.left, level+1, result);
		help(root.right, level+1, result);
	}
	
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int level = 0;
		help(root, level, result);
		return result;
		
    }
	
	public static void main(String [] args){
		BinaryTreeLevel b = new BinaryTreeLevel();
		
		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(9);
		TreeNode n3 = new TreeNode(20);
		TreeNode n4 = new TreeNode(15);
		TreeNode n5 = new TreeNode(7);
		
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right  =n5;
		
		ArrayList<ArrayList<Integer>> result = b.levelOrder(n1);
		System.out.println(result);
	}
}
