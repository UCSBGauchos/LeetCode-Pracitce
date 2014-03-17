package leetcodePractice;

import java.util.ArrayList;

public class PathSum2 {
	
	public void help(TreeNode root, int sum, int count, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result){
		if(root == null){
			return;
		}
		list.add(root.val);
		count+=root.val;
		if(count == sum&&root.left==null&&root.right==null){
			ArrayList<Integer> snapShot = new ArrayList<Integer>();
			for(int i: list){
				snapShot.add(i);
			}
			result.add(snapShot);
			list.remove(list.size()-1);
			return;
		}else if(root.left==null&&root.right==null){
			list.remove(list.size()-1);
			return;
		}
		help(root.left, sum, count, list, result);
		help(root.right, sum, count, list, result);
		list.remove(list.size()-1);
	}
		
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		int count = 0;
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		help(root, sum, count, list, result);
		return result;
    }

	public static void main(String [] args){
		PathSum2 p = new PathSum2();
		TreeNode n1 = new TreeNode(5); 
		TreeNode n2 = new TreeNode(4); 
		TreeNode n3 = new TreeNode(8); 
		TreeNode n4 = new TreeNode(11);
		TreeNode n5 = new TreeNode(13);
		TreeNode n6 = new TreeNode(4);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(2); 
		TreeNode n9 = new TreeNode(1); 
		TreeNode n10 = new TreeNode(5); 
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n4.left = n7;
		n4.right = n8;
		n3.left = n5;
		n3.right = n6;
		n6.left = n10;
		n6.right = n9;
		
		ArrayList<ArrayList<Integer>> result = p.pathSum(n1, 22);
		System.out.println(result);
	}
}
