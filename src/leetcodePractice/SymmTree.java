package leetcodePractice;

import java.util.ArrayList;
import java.util.Stack;

public class SymmTree {
	
	public void help(TreeNode root, int level, ArrayList<ArrayList<String>> result){
		if(root == null){
			if(level == result.size()){
				ArrayList<String> list = new ArrayList<String>();
				list.add("#");
				result.add(list);
			}else{
				result.get(level).add("#");
			}
			return;
		}
		if(level == result.size()){
			ArrayList<String> list = new ArrayList<String>();
			list.add(String.valueOf(root.val));
			result.add(list);
		}else{
			result.get(level).add(String.valueOf(root.val));
		}
		help(root.left, level+1, result);
		help(root.right, level+1, result);
	}
	
	public ArrayList<ArrayList<String>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		int level = 0;
		help(root, level, result);
		return result;
    }
	
	public boolean isPali(ArrayList<String> list){
		int length = list.size();
		Stack<String> stack = new Stack<String>();
		int i=0;
		int j=0;
		for(i=0; i<=length/2-1; i++){
			stack.add(list.get(i));
		}
		if(length%2 == 0){
			for(j = i; j<length; j++){
				if(!stack.pop().equals(list.get(j))){
					return false;
				}
			}
		}else{
			for(j=i+1; j<length; j++){
				if(stack.pop().equals(list.get(j))){
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isSymmetric(TreeNode root) {
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		result = levelOrder(root);
		for(ArrayList<String> list: result){
			if(!isPali(list)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args){
		SymmTree s = new SymmTree();
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(2);
		TreeNode n4 = new TreeNode(3);
		TreeNode n5 = new TreeNode(4);
		TreeNode n6 = new TreeNode(4);
		TreeNode n7 = new TreeNode(3);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		System.out.println(s.isSymmetric(n1));
	}
	
}
