package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class ConstructBSTFromInAndPo {
	public TreeNode help(ArrayList<Integer> po, ArrayList<Integer> in, HashMap<TreeNode, ArrayList<TreeNode>> cache){
		if(po.size()==0||in.size()==0){
			return null;
		}
		TreeNode root = new TreeNode(po.get(po.size()-1));
		if(po.size()>0){
			po.remove(po.size()-1);
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
			root.right = help(po, right, cache);
			root.left = help(po, left, cache);
	        ArrayList<TreeNode> sons = new ArrayList<TreeNode>();
	        sons.add(root.left);
	        sons.add(root.right);
	        cache.put(root, sons);
		}
		
       
		return root;
		
	}
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		ArrayList<Integer> po = new ArrayList<Integer>();
		ArrayList<Integer> in = new ArrayList<Integer>();
		HashMap<TreeNode, ArrayList<TreeNode>> cache = new HashMap<TreeNode, ArrayList<TreeNode>>();
		for(int i: postorder){
			po.add(i);
		}
		for(int i: inorder){
			in.add(i);
		}
		return help(po, in, cache);
    }
		
     public static void main(String [] args){
    	 ConstructBSTFromInAndPo c = new ConstructBSTFromInAndPo();
    	 int [] inOrder = {2,1,3};
		 int [] poOrder = {2,3,1};
		 System.out.println(c.buildTree(inOrder, poOrder).right.val);
     }
}
