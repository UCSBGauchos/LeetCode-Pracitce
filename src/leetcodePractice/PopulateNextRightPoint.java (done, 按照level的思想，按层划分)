package leetcodePractice;

import java.util.ArrayList;

public class PopulateNextRightPoint {
	
	public void help(TreeLinkNode root, ArrayList<ArrayList<TreeLinkNode>> result, int level){
		if(root == null){
			return;
		}
		if(level == result.size()){
			ArrayList<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
			list.add(root);
			result.add(list);
		}else{
			ArrayList<TreeLinkNode> list = result.get(level);
			list.add(root);
		}
		help(root.left, result, level+1);
		help(root.right, result, level+1);
		
	}
	
	public void connect(TreeLinkNode root) {
		ArrayList<ArrayList<TreeLinkNode>> result = new ArrayList<ArrayList<TreeLinkNode>>();
		int level = 0;
		help(root, result, level);
		for(ArrayList<TreeLinkNode> list: result){
			for(int i=0 ;i<list.size()-1; i++){
				list.get(i).next = list.get(i+1);
			}
		}
    }
	
	public static void main(String [] args){
		
		PopulateNextRightPoint p = new PopulateNextRightPoint();
		
		TreeLinkNode n1 = new TreeLinkNode(1);
		TreeLinkNode n2 = new TreeLinkNode(2);
		TreeLinkNode n3 = new TreeLinkNode(3);
		TreeLinkNode n4 = new TreeLinkNode(4);
		TreeLinkNode n5 = new TreeLinkNode(5);
		TreeLinkNode n6 = new TreeLinkNode(6);
		TreeLinkNode n7 = new TreeLinkNode(7);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6; 
		n3.right = n7;
		n1.next = null;
		n2.next = null;
		n3.next = null;
		n4.next = null;
		n5.next = null;
		n6.next = null;
		n7.next = null;
		
		p.connect(n1);
		
	}
}
