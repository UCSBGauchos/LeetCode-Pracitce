package leetcodePractice;

import java.util.ArrayList;

public class SumRootToLeafNumbers {
	
	public void help(TreeNode root, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result){
		if(root == null){
			 return;
		}
		list.add(root.val);
		if(root.left == null&&root.right == null){
			ArrayList<Integer> snapShot = new  ArrayList<Integer>();
			 for(int i: list){
				 snapShot.add(i);
			 }
			 result.add(snapShot);
		}
		help(root.left, list, result);
		help(root.right, list, result);
		 list.remove(list.size()-1);
	}
	
	public int sumNumbers(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		help(root, list, result);
		int [] sums = new int[result.size()];
		int whole = 0;
		int index = 0;
		for(ArrayList<Integer> l: result){
			int sum = 0;
			for(int i: l){
				sum = sum*10+i;
			}
			sums[index] = sum;
			index++;
		}
		for(int i: sums){
			whole+=i;
		}
		return whole;
    }
	
	public static void main(String [] args){
		
		SumRootToLeafNumbers s = new SumRootToLeafNumbers();
		
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right = n5;
		
		int result = s.sumNumbers(n1);
		System.out.println(result);
		
	}
	
}
