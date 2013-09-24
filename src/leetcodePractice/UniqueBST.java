package leetcodePractice;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class UniqueBST {
	
	//given a root and node, and this node to this tree
	public void BST(Node root, Node node){
		if(node.value<root.value&&root.left==null){
			root.left = node;
			return;
		}else if(node.value<root.value&&root.left!=null){
			BST(root.left, node);
		}else if(node.value>root.value&&root.right==null){
			root.right = node;
			return;
		}else if(node.value>root.value&&root.right!=null){
			BST(root.right, node);
		}
	}
	
	public void BSTPreOrder(Node node, ArrayList<Integer> result){
		if(node == null){
			return;
		}
		result.add(node.value);
		BSTPreOrder(node.left, result);
		BSTPreOrder(node.right, result);
	}
	
	public void BSTInOrder(Node node, ArrayList<Integer> result){
		if(node == null){
			return;
		}
		BSTPreOrder(node.left, result);
		result.add(node.value);
		BSTPreOrder(node.right, result);
	}
	
	public ArrayList<List<Integer>> permtation(List<Integer> list){
		int last = list.get(0);
		List<Integer> remain = list.subList(1, list.size());
		if(remain.size()==1){
			ArrayList<List<Integer>> result = connection(remain, last);
			return result;
		}
		ArrayList<List<Integer>> allCurLists = new ArrayList<List<Integer>>();
		for(List<Integer> preList: permtation(remain)){
			ArrayList<List<Integer>> curLists = connection(preList, last);
			allCurLists.addAll(curLists);
		}
		return allCurLists;
		
	}
	
	public ArrayList<List<Integer>> connection(List<Integer> list, int number){
		ArrayList<List<Integer>> result  = new ArrayList<List<Integer>>();
		for(int i=0;i<=list.size(); i++){
			List<Integer> first = list.subList(0, i);
			List<Integer> second = list.subList(i, list.size());
			List<Integer> whole = new ArrayList<Integer>();
			whole.addAll(first);
			whole.add(number);
			whole.addAll(second);
			result.add(whole);
		}
		return result;
	}
	
	public ArrayList<ArrayList<Integer>> removeDup(ArrayList<ArrayList<Integer>> lists){
		Hashtable<List<Integer>, Boolean> hash = new Hashtable<List<Integer>, Boolean>();
		ArrayList<ArrayList<Integer>> listsWithoutDup = new ArrayList<ArrayList<Integer>>();
		for(ArrayList<Integer> list: lists){
			if(!hash.containsKey(list)){
				hash.put(list, true);
				listsWithoutDup.add(list);
			}
		}
		return listsWithoutDup;
	}
	
	public static void main(String [] args){
		UniqueBST ub = new UniqueBST();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		ArrayList<Node> forest = new ArrayList<Node>();
		
		for(int rootValue: list){
			Node root = null;
			int index = list.indexOf(rootValue);
			ArrayList<Integer> childList = new ArrayList<Integer>();
			childList.addAll(list);
			childList.remove(index);
			
			//just one possible list for adding child, we need all the pissibilities
			
			ArrayList<List<Integer>> allChildLists = ub.permtation(childList);
			
			for(List<Integer> oneChildList: allChildLists){
				root = new Node(rootValue);
				for(int childValue: oneChildList){
					Node child = new Node(childValue);
					ub.BST(root, child);
				}
				forest.add(root);
			}
		}
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		for(Node root: forest){
			ArrayList<Integer> result = new ArrayList<Integer>();
			ub.BSTPreOrder(root, result);
			results.add(result);
		}
		System.out.print(ub.removeDup(results).size());
	}
}
