package leetcodePractice;

import java.util.ArrayList;

public class RecoverBST {
	
	
	public void BSTList(TreeNode node, ArrayList<Integer> list){
		if(node == null){
			return;
		}
		BSTList(node.left, list);
		list.add(node.val);
		BSTList(node.right, list);
	}
	
	public ArrayList<Integer> recoverList(ArrayList<Integer> list){
		if(list.size()==2){
			return list;
		}
		ArrayList<Integer> twoWrongNumber = new ArrayList<Integer>();
		boolean first = false;
		int [] array = new int[list.size()];
		int index = 0;
		for(int i: list){
			array[index] = i;
			index++;
		}
		int guessTwo = 0;
		for(int i = 0; i<array.length-1; i++){
			if(array[i]>array[i+1]&&first == false){
				twoWrongNumber.add(array[i]);
				guessTwo = array[i+1];
				first = true;
			}else if(array[i]>array[i+1]&&first == true){
				twoWrongNumber.add(array[i+1]);
			}
		}
		if(twoWrongNumber.size()==1){
			twoWrongNumber.add(guessTwo);
		}
		
		return twoWrongNumber;
	}
	
	public void help(TreeNode node, ArrayList<Integer> twoWrongNumber){
		if(node == null){
			return;
		}
		if(twoWrongNumber.contains(node.val)){
			if(twoWrongNumber.get(0)==node.val){
				node.val = twoWrongNumber.get(1);
			}else if(twoWrongNumber.get(1)==node.val){
				node.val = twoWrongNumber.get(0);
			}
		}
		help(node.left, twoWrongNumber);
		help(node.right, twoWrongNumber);
		
	}
	
	public void recoverTree(TreeNode root){
		ArrayList<Integer> list = new ArrayList<Integer>();
		BSTList(root, list);
		System.out.println(list);
		ArrayList<Integer> twoWrongNumber = new ArrayList<Integer>();
		twoWrongNumber = recoverList(list);
		System.out.println(twoWrongNumber);
		help(root, twoWrongNumber);
	}
	
	public static void main(String [] args){
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		//TreeNode n4 = new TreeNode(4);
		//TreeNode n5 = new TreeNode(5);
		
		//n5.left = n2;
		//n2.left = n1;
		//n5.right = n4;
		//n4.right = n3;
		
		n2.right = n1;
		n1.right = n3;
		
		
		RecoverBST rt = new RecoverBST();
		
		rt.recoverTree(n2);
		System.out.println(n2.right.right.val);
		
	}
}
