package leetcodePractice;

import java.util.ArrayList;

public class UniqueBinarySearchTree {
	
	public int help(ArrayList<Integer> list, int root, int smallest){
		if(list.size()==0){
			return 1;
		}
		int left = 0;
		int right = 0;
		for(int node: list){
			ArrayList<Integer> newList = new ArrayList<Integer>();
			newList.addAll(list);
			newList.remove(list.indexOf(node));
			if(node<root){
				left = help(newList, node, smallest);
			}else if(node>root&&node>smallest){
				smallest = root;
				right = help(newList,node, smallest);
			}
		}
		return left+right;
	}
	
	public int numTrees(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=n; i++){
			list.add(i);
		}
		int sum = 0;
		for(int root: list){
			System.out.println("Noe root is "+root);
			ArrayList<Integer> newList = new ArrayList<Integer>();
			newList.addAll(list);
			newList.remove(list.indexOf(root));
			int smallest = 0;
			System.out.println(" is "+help(list, root, smallest));
		}
		return 0;
	}
	
	public static void main(String [] args){
		UniqueBinarySearchTree u = new UniqueBinarySearchTree();
		int n = 3;
		System.out.println(u.numTrees(n));
	}
}
