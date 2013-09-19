package leetcodePractice;

public class BinTreeMaxDepth {
	
	public int getMaxHeight(Node root){
		if(root == null){
			return 0;
		}
		return Math.max(getMaxHeight(root.left), getMaxHeight(root.right))+1;
	}
	
	public static void main(String [] args){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		n1.addLeft(n2);
		n1.addRight(n3);
		n3.addLeft(n4);
		n3.addRight(n5);
		
		BinTreeMaxDepth btmh = new BinTreeMaxDepth();
		System.out.println(btmh.getMaxHeight(n1));
		
	}
}
