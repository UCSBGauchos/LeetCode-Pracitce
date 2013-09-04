package leetcodePractice;

public class Node {
	int value;
	Node left;
	Node right;
	Node parents;
	
	public Node(int _value){
		this.value = _value;
		this.left=null;
		this.right=null;
		this.parents = null;
	}
	
	public void addLeft(Node node){
		this.left = node;
		node.parents = this;
	}
	
	public void addRight(Node node){
		this.right = node;
		node.parents = this;
	}
}
