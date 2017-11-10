package leetcodePractice;

public class MaxDepthBinaryTree {
	
	 public int maxDepth(TreeNode root) {
		 if(root == null){
			 return 0;
		 }
		 return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
	 }
	
	
	
	public static void main(String [] args){
		MaxDepthBinaryTree m = new MaxDepthBinaryTree();
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right = n5;
		System.out.println(m.maxDepth(n1));
	}
}
