package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class ConstructBSTFromInAndPre {
	
	public TreeNode help(ArrayList<Integer> pre, ArrayList<Integer> in, HashMap<TreeNode, ArrayList<TreeNode>> cache){
		if(pre.size()==0||in.size()==0){
			return null;
		}
		TreeNode root = new TreeNode(pre.get(0));
		if(pre.size()>0){
			pre.remove(0);
		}
		if(in.size()==1&&in.get(0)==root.val){
			return root;
		}
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		int index = in.indexOf(root.val);
		for(int i=0; i<index; i++){
			left.add(in.get(i));
		}
		for(int j=index+1; j<in.size(); j++){
			right.add(in.get(j));
		}
		if(!cache.containsKey(root)){
			root.left = help(pre, left, cache);
	        root.right = help(pre, right, cache);
	        ArrayList<TreeNode> sons = new ArrayList<TreeNode>();
	        sons.add(root.left);
	        sons.add(root.right);
	        cache.put(root, sons);
		}
		
       
		return root;
		
	}
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		ArrayList<Integer> pre = new ArrayList<Integer>();
		ArrayList<Integer> in = new ArrayList<Integer>();
		HashMap<TreeNode, ArrayList<TreeNode>> cache = new HashMap<TreeNode, ArrayList<TreeNode>>();
		for(int i: preorder){
			pre.add(i);
		}
		for(int i: inorder){
			in.add(i);
		}
		return help(pre, in, cache);
    }
		
     public static void main(String [] args){
    	 ConstructBSTFromInAndPre c = new ConstructBSTFromInAndPre();
    	 int [] inOrder = {1,2};
		 int [] preOrder = {1,2};
		 System.out.println(c.buildTree(preOrder, inOrder).right.val);
     }
}
