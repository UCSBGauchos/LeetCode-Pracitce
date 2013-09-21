package leetcodePractice;

import java.util.ArrayList;
import java.util.Stack;

public class SymmTree {
	
	ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
	public void createlists(Node node, int level){
		if(node == null){
			return;
		}
		if(level == lists.size()){
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(node.value);
			lists.add(list);
		}else{
			ArrayList<Integer> list = lists.get(level);
			list.add(node.value);
		}
		createlists(node.left,level+1);
		createlists(node.right,level+1);
	}
	
	public boolean determinPali(ArrayList<Integer> list){
		int midIndex = (list.size()-1)/2;
		int length = list.size();
		if(length%2==0){
			Stack<Integer> stack = new Stack<Integer>();
			int i=0;
			for(i=0;i<=midIndex;i++){
				stack.push(list.get(i));
			}
			for(int j=i;j<length;j++){
				if(stack.pop()!=list.get(j)){
					return false;
				}
			}
		}else if(length%2!=0){
			Stack<Integer> stack = new Stack<Integer>();
			int i=0;
			for(i=0;i<midIndex;i++){
				stack.push(list.get(i));
			}
			i++;
			for(int j=i;j<length;j++){
				if(stack.pop()!=list.get(j)){
					return false;
				}
			}
		}
		return true;
		
	}
	
	public boolean determinSymm(ArrayList<ArrayList<Integer>> lists){
		for(int index = 0; index<lists.size(); index++){
			if(index != 0 && lists.get(index).size()%2!=0){
				return false;
			}
			if(!determinPali(lists.get(index))){
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String [] args){
		Node level1N1 = new Node(1);
		Node level2N1 = new Node(2);
		Node level2N2 = new Node(2);
		Node level3N1 = new Node(3);
		Node level3N2 = new Node(4);
		Node level3N3 = new Node(4);
		Node level3N4 = new Node(3);
		
		level1N1.addLeft(level2N1);
		level1N1.addRight(level2N2);
		level2N1.addLeft(level3N1);
		level2N1.addRight(level3N2);
		level2N2.addLeft(level3N3);
		level2N2.addRight(level3N4);
		
		ArrayList<Integer> testList = new ArrayList<Integer>();
		
		SymmTree st = new SymmTree();
		st.createlists(level1N1, 0);
		System.out.println(st.determinSymm(st.lists));
		
	}
}
