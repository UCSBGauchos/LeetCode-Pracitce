package leetcodePractice;

public class TreeNode {
	int value;
	TreeNode parents;
	TreeNode left;
	TreeNode right;
	TreeNode next;
	int level;
	
	
	public TreeNode(int _value, int _level){
		value = _value;
		parents = null;
		left = null;
		right = null;
		next = null;
		level = _level;
	}
	
	public void addLeft(TreeNode _left){
		left = _left;
		left.parents = this;
	}
	
	public void addright(TreeNode _right){
		right = _right;
		right.parents = this;
	}
	
}
