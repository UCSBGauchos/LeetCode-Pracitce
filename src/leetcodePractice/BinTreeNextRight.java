package leetcodePractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinTreeNextRight {
	public void BFS(TreeNode root){
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		System.out.println(root.value+" next is null");
		root.next = null;
		while(queue.size()!=0){
			TreeNode node = queue.poll();
			if(node.left!=null){
				queue.add(node.left);
			}
			if(node.right!=null){
				System.out.println(node.left.value+" next is "+node.right.value);
				node.left.next = node.right; 
				queue.add(node.right);
				if(queue.peek().left!=null){
					TreeNode next = queue.peek().left;
					if(next.level==node.right.level){
						System.out.println(node.right.value+" next is "+next.value);
						node.right.next = next;
					}else{
						System.out.println(node.right.value+" next is null");
						node.right.next = null;
					}
				}else{
					System.out.println(node.right.value+" next is null");
					node.right.next = null;
				}
			}
		}
		
	}
	
	public static void main(String [] args){
		TreeNode n1 = new TreeNode(1,1);
		TreeNode n2 = new TreeNode(2,2);
		TreeNode n3 = new TreeNode(3,2);
		TreeNode n4 = new TreeNode(4,3);
		TreeNode n5 = new TreeNode(5,3);
		TreeNode n6 = new TreeNode(6,3);
		TreeNode n7 = new TreeNode(7,3);
		n1.addLeft(n2);
		n1.addright(n3);
		n2.addLeft(n4);
		n2.addright(n5);
		n3.addLeft(n6);
		n3.addright(n7);
		BinTreeNextRight btnr = new BinTreeNextRight();
		btnr.BFS(n1);
		
	}
}
