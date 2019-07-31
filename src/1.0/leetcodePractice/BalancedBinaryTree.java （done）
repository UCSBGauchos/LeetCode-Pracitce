package leetcodePractice;

public class BalancedBinaryTree {
	
	public boolean isBalanced(TreeNode root){
		if(root == null){
			return true;
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		int diff = Math.abs(rightHeight-leftHeight);
		if(diff<=1){
			boolean leftResult = isBalanced(root.left);
			boolean rightResult = isBalanced(root.right);
			boolean result = leftResult&rightResult;
			return result;
		}else{
			return false;
		}
	}
	
	public int getHeight(TreeNode root){
		if(root == null){
			return 0;
		}
		int height = Math.max(getHeight(root.left), getHeight(root.right))+1;
		return height;
	}
	public static void main(String [] args){
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(8);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;
		n4.left = n7;
		n6.right = n8;
		
		BalancedBinaryTree bbt = new BalancedBinaryTree();
		if(bbt.isBalanced(n1)){
			System.out.println("The tree is balanced");
		}else{
			System.out.println("The tree is not balanced");
		}
		
	}
}
