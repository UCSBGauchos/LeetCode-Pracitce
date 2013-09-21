package leetcodePractice;

import java.util.ArrayList;

public class SameTree {
		
	
	public void convertPre(Node node, ArrayList<Integer> pre){
		if(node == null){
			return;
		}
		pre.add(node.value);
		convertPre(node.left, pre);
		convertPre(node.right, pre);
	}
	
	public void convertIn(Node node, ArrayList<Integer> in){
		if(node == null){
			return;
		}
		convertIn(node.left, in);
		in.add(node.value);
		convertIn(node.right, in);
		
	}
	
	
	public boolean isSame(ArrayList<Integer> in1, ArrayList<Integer> in2, ArrayList<Integer> pre1, ArrayList<Integer> pre2){
		if(in1.size()!=in2.size() || pre1.size()!=pre2.size()){
			return false;
		}
		for(int index = 0; index < in1.size(); index++){
			if(in1.get(index) != in2.get(index)){
				return false;
			}
		}
		for(int index = 0; index < pre1.size(); index++){
			if(pre1.get(index) != pre2.get(index)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args){
		Node tree1N1 = new Node(1);
		Node tree1N2 = new Node(2);
		Node tree1N3 = new Node(3);
		
		Node tree2N1 = new Node(1);
		Node tree2N2 = new Node(2);
		Node tree2N3 = new Node(3);
		
		tree1N1.addLeft(tree1N2);
		tree1N1.addRight(tree1N3);
		
		tree2N1.addLeft(tree2N2);
		tree2N1.addRight(tree2N3);
		
		
		
		SameTree st = new SameTree();

		ArrayList<Integer> pre1 = new ArrayList<Integer>();
		ArrayList<Integer> pre2 = new ArrayList<Integer>();
		ArrayList<Integer> in1 = new ArrayList<Integer>();
		ArrayList<Integer> in2 = new ArrayList<Integer>();
		
		st.convertIn(tree1N1, in1);
		st.convertPre(tree1N1, pre1);
		st.convertIn(tree2N1, in2);
		st.convertPre(tree2N1, pre2);
		
		
		System.out.println(st.isSame(in1, in2, pre1, pre2));
		
	}
}
