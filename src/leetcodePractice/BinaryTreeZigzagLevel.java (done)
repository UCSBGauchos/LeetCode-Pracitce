package leetcodePractice;

import java.util.ArrayList;

public class BinaryTreeZigzagLevel {
	
	public void help(TreeNode root, int level, ArrayList<ArrayList<Integer>> results){
		if(root == null){
			return;
		}
		if(level == results.size()){
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(root.val);
			results.add(list);
		}else{
			results.get(level).add(root.val);
		}
		int newLevel = level+1;
		help(root.left, newLevel, results);
		help(root.right, newLevel, results);
	}
	
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
		int level = 0;
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> zigResults = new ArrayList<ArrayList<Integer>>();
		help(root, level, results);
		for(int i=0; i<results.size(); i++){
			if(i%2!=0){
				ArrayList<Integer> list = new ArrayList<Integer>();
				for(int j=results.get(i).size()-1; j>=0; j--){
					list.add(results.get(i).get(j));
				}
				zigResults.add(list);
			}else{
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.addAll(results.get(i));
				zigResults.add(list);
			}
		}
		return zigResults;
    }
	
	public static void main(String [] args){
		BinaryTreeZigzagLevel b = new BinaryTreeZigzagLevel();
		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(9);
		TreeNode n3 = new TreeNode(20);
		TreeNode n4 = new TreeNode(15);
		TreeNode n5 = new TreeNode(7);
		n1.left = n2;
		n1.right =n3;
		n3.left = n4;
		n3.right = n5;
		System.out.println(b.zigzagLevelOrder(n1));
	}
}
