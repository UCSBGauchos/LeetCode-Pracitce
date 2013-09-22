package leetcodePractice;

public class ValidBST {
	
	public boolean isBST(Node node){
		if(node == null){
			return true;
		}
		boolean lefttResult = false;
		boolean rightResult = false;
		if(node.left!=null&&node.right!=null){
			if(node.left.value<node.value&&node.right.value>node.value){
				lefttResult = isBST(node.left);
				rightResult = isBST(node.right);
			}else{
				return false;
			}
		}else if(node.left!=null&&node.right==null){
			if(node.left.value<node.value){
				lefttResult = isBST(node.left);
				rightResult = isBST(node.right);
			}else{
				return false;
			}
		}else if(node.right!=null&&node.left==null){
			if(node.right.value>node.value){
				lefttResult = isBST(node.left);
				rightResult = isBST(node.right);
			}else{
				return false;
			}
		}else if(node.right==null&&node.left==null){
			return true;
		}
		return lefttResult&rightResult;
	}
	public static void main(String [] args){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(6);
		Node n5 = new Node(5);
		
		n3.addLeft(n2);
		n2.addLeft(n1);
		n3.addRight(n4);
		n4.addRight(n5);
		
		ValidBST vb = new ValidBST();
		System.out.println(vb.isBST(n3));
		
		
		
	}
}
