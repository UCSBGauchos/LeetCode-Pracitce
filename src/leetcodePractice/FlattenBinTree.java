package leetcodePractice;

import java.util.ArrayList;

public class FlattenBinTree {
	
	public void help(TreeNode point, ArrayList<TreeNode> list){
		if(point == null){
			return;
		}
		list.add(point);
		help(point.left, list);
		help(point.right, list);
	}
	
	public void flatten(TreeNode root) {
		if(root == null){
			return;
		}
		TreeNode point = root;
		TreeNode point2 = root;
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		help(point, list);
		for(int i = 1; i<list.size(); i++){
			point2.left = null;
			point2.right = list.get(i);
			point2 = point2.right;
		}
	}
	
	public static void main(String [] args){
		FlattenBinTree f = new FlattenBinTree();
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		n1.left = n2;
		n1.right = n5;
		n2.left = n3;
		n2.right = n4;
		n5.right = n6;
		f.flatten(n1);
		while(n1!=null){
			System.out.println(n1.val);
			n1 = n1.right;
		}
	}
}
