package leetcodePractice;

import java.util.ArrayList;

public class BinaryTreeLevelTwo {
	public void help(TreeNode root, int level, ArrayList<ArrayList<Integer>> result, int treeHeight){
		if(root == null){
			return;
		}
		result.get(treeHeight-1-level).add(root.val);
		help(root.left, level+1, result, treeHeight);
		help(root.right, level+1, result, treeHeight);
	}
	
	public int getHeight(TreeNode root){
		if(root == null){
			return 0;
		}
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}
	
	public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int level = 0;
		int treeHeight = getHeight(root);
		for(int i=0; i<treeHeight; i++){
			ArrayList<Integer> list = new ArrayList<Integer>();
			result.add(list);
		}
		help(root, level, result, treeHeight);
		return result;
		
    }
	
	public static void main(String [] args){
		BinaryTreeLevelTwo b = new BinaryTreeLevelTwo();
		
		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(9);
		TreeNode n3 = new TreeNode(20);
		TreeNode n4 = new TreeNode(15);
		TreeNode n5 = new TreeNode(7);
		
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right  =n5;
		
		ArrayList<ArrayList<Integer>> result = b.levelOrderBottom(n1);
		System.out.println(result);
	}
	
	
}
