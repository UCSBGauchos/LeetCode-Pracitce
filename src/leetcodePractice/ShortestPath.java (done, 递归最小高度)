package leetcodePractice;

public class ShortestPath {
	
	public int getSmallestHeight(Node node){
		if(node==null){
			return 0;
		}
		int height = Math.min(getSmallestHeight(node.left), getSmallestHeight(node.right))+1;
		return height;
	}
	
	public static void main(String [] args){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		n1.addLeft(n2);
		//n1.addRight(n3);
		n2.addLeft(n4);
		n2.addRight(n5);
		
		ShortestPath sp = new ShortestPath();
		System.out.println(sp.getSmallestHeight(n1));
	}
}
