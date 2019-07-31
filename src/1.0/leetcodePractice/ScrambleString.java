package leetcodePractice;

import java.util.ArrayList;


public class ScrambleString {
	
	
	public void getLeaves(StringNode root, ArrayList<String> leaves){
		if(root.value.length()==1){
			leaves.add(root.value);
			return;
		}
		getLeaves(root.left, leaves);
		getLeaves(root.right, leaves);
	}
	
	public void swap(StringNode root){
		if(root == null){
			return;
		}
		if(root.left!=null&&root.right!=null){
			StringNode tmp = root.left;
			root.left = root.right;
			root.right = tmp;
		}else if(root.left==null&&root.right!=null){
			root.left = root.right;
			root.right = null;
		}else if(root.left!=null&&root.right==null){
			root.right = root.left;
			root.left = null;
		}
		swap(root.left);
		swap(root.right);
	}
	
	ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();
	
	public void getAll(StringNode root, StringNode trueRoot){
		if(root == null){
			return;
		}
		ArrayList<String> noSwap = new ArrayList<String>();
		getLeaves(trueRoot, noSwap);
		if(!lists.contains(noSwap)){
			lists.add(noSwap);
		}
		getAll(root.left, trueRoot);
		getAll(root.right, trueRoot);
		swap(root);
		ArrayList<String> withSwap = new ArrayList<String>();
		getLeaves(trueRoot, withSwap);
		if(!lists.contains(withSwap)){
			lists.add(withSwap);
		}
		getAll(root.left, trueRoot);
		getAll(root.right, trueRoot);
	}
	
	
	
	public ArrayList<StringNode> createForest(String str){
		if(str.length()==1){
			StringNode node = new StringNode(str);
			ArrayList<StringNode> result = new ArrayList<StringNode>();
			result.add(node);
			return result;
		}
		ArrayList<StringNode> rootForest = new ArrayList<StringNode>();
		for(int i = 1; i<str.length(); i++){
			StringNode root = new StringNode(str);
			ArrayList<StringNode> leftChilds = createForest(str.substring(0, i));
			ArrayList<StringNode> rightChilds = createForest(str.substring(i));
			for(StringNode leftChild: leftChilds){
				root.addLeft(leftChild);
				for(StringNode rightChild: rightChilds){
					root.addRight(rightChild);
					rootForest.add(root);
				}
			}
		}
		return rootForest;
	}
	
	public static void main(String [] args){
		ScrambleString ss = new ScrambleString();
		String str1 = "great";
		String str2 = "rgtae";
		for(StringNode root: ss.createForest(str1)){
			StringNode trueRoot = root;
			ss.getAll(root, trueRoot);
		}
		for(ArrayList<String> list: ss.lists){
			System.out.println(list);
		}
	}
}
