package leetcodePractice;

import java.util.ArrayList;

public class SameTree {
		
	
	public void convertPre(TreeNode node, ArrayList<String> pre){
		if(node == null){
			pre.add("#");
			return;
		}
		pre.add(String.valueOf(node.val));
		convertPre(node.left, pre);
		convertPre(node.right, pre);
	}
	
	public void convertIn(TreeNode node, ArrayList<String> in){
		if(node == null){
			in.add("#");
			return;
		}
		convertIn(node.left, in);
		in.add(String.valueOf(node.val));
		convertIn(node.right, in);
		
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null&&q==null){
			return true;
		}
		ArrayList<String> pre1 = new ArrayList<String>();
		ArrayList<String> pre2 = new ArrayList<String>();
		ArrayList<String> in1 = new ArrayList<String>();
		ArrayList<String> in2 = new ArrayList<String>();
		convertPre(p, pre1);
		convertPre(q, pre2);
		convertIn(p, in1);
		convertIn(q, in2);
		if(pre2.size()!=pre1.size()){
			return false;
		}
		if(in1.size()!=in2.size()){
			return false;
		}
		for(int i=0; i<pre1.size(); i++){
			if(!pre1.get(i).equals(pre2.get(i))){
				return false;
			}
		}
		for(int i=0; i<in1.size(); i++){
			if(!in1.get(i).equals(in2.get(i))){
				return false;
			}
		}
		return true;
		
    }
	
	public static void main(String [] args){
		TreeNode tree1N1 = new TreeNode(0);
		TreeNode tree1N2 = new TreeNode(-5);
		
		TreeNode tree2N1 = new TreeNode(0);
		TreeNode tree2N2 = new TreeNode(-8);
		
		//tree1N1.left = tree1N2;
		
		//tree2N1.left = tree2N2;
		
		
		
		SameTree st = new SameTree();
		System.out.println(st.isSameTree(tree1N1, tree2N1));

		
		
	}
}
