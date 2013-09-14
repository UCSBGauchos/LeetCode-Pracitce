package leetcodePractice;

public class BalancedBinaryTree {
	
	public boolean isBalanced(Node node){
		if(node == null){
			return true;
		}
		int leftHeight = getHeight(node.left);
		int rightHeight = getHeight(node.right);
		int diff = Math.abs(rightHeight-leftHeight);
		if(diff<=1){
			boolean leftResult = isBalanced(node.left);
			boolean rightResult = isBalanced(node.left);
			boolean result = leftResult&rightResult;
			return result;
		}else{
			return false;
		}
	}
	
	public int getHeight(Node root){
		if(root == null){
			return 0;
		}
		int height = Math.max(getHeight(root.left), getHeight(root.right))+1;
		return height;
	}
	public static void main(String [] args){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		
		n1.addLeft(n2);
		n1.addRight(n3);
		//n2.addLeft(n4);
		//n2.addRight(n5);
		n3.addLeft(n6);
		
		BalancedBinaryTree bbt = new BalancedBinaryTree();
		if(bbt.isBalanced(n1)){
			System.out.println("The tree is balanced");
		}else{
			System.out.println("The tree is not balanced");
		}
		
	}
}
