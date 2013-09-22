package leetcodePractice;

import java.util.ArrayList;

public class RecoverBST {
	
	
	public void BSTList(Node node, ArrayList<Integer> list){
		if(node == null){
			return;
		}
		BSTList(node.left, list);
		list.add(node.value);
		BSTList(node.right, list);
	}
	
	public ArrayList<Integer> recoverList(ArrayList<Integer> list){
		ArrayList<Integer> twoWrongNumber = new ArrayList<Integer>();
		boolean first = false;
		int [] array = new int[list.size()];
		int index = 0;
		for(int i: list){
			array[index] = i;
			index++;
		}
		for(int i = 0; i<array.length-1; i++){
			if(array[i]>array[i+1]&&first == false){
				twoWrongNumber.add(array[i]);
				first = true;
			}else if(array[i]>array[i+1]&&first == true){
				twoWrongNumber.add(array[i+1]);
			}
		}
		return twoWrongNumber;
	}
	
	public void recoverTree(Node node, ArrayList<Integer> twoWrongNumber){
		if(node == null){
			return;
		}
		if(twoWrongNumber.contains(node.value)){
			if(twoWrongNumber.get(0)==node.value){
				node.value = twoWrongNumber.get(1);
			}else if(twoWrongNumber.get(1)==node.value){
				node.value = twoWrongNumber.get(0);
			}
		}
		recoverTree(node.left, twoWrongNumber);
		recoverTree(node.right, twoWrongNumber);
		
	}
	
	public static void main(String [] args){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		n5.addLeft(n2);
		n2.addLeft(n1);
		n5.addRight(n4);
		n4.addRight(n3);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		RecoverBST rt = new RecoverBST();
		rt.BSTList(n5, list);
		ArrayList<Integer> twoWrongNumber = new ArrayList<Integer>();
		twoWrongNumber = rt.recoverList(list);
		rt.recoverTree(n5, twoWrongNumber);
		System.out.println(n5.right.value);
		
	}
}
