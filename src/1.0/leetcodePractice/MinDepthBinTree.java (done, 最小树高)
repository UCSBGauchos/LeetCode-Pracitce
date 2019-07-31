package leetcodePractice;

public class MinDepthBinTree {
	
	 public int help(TreeNode root){
		 if(root==null){
			 return Integer.MAX_VALUE;
		 }
		 if(root.left == null&&root.right == null){
			 return 1;
		 }
		 return Math.min(help(root.left), help(root.right))+1;
	 }
	
	 public int minDepth(TreeNode root) {
		 if(root == null){
			 return 0;
		 }else{
			 return help(root);
		 }
	 }
	
	
	
	public static void main(String [] args){
		MinDepthBinTree m = new MinDepthBinTree();
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		n1.left = n2;
		//n1.right = n3;
		//n3.left = n4;
		//n3.right = n5;
		System.out.println(m.minDepth(n1));
	}
}
