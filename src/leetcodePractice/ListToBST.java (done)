package leetcodePractice;

public class ListToBST {
	
	public Node covert(int [] sortedList, int start, int end){
		if(start == end){
			return new Node(sortedList[start]);
		}
		if(start>end){
			return null;
		}
		int mid = (start+end)/2;
		int midValue = sortedList[mid];
		Node root = new Node(midValue);
		root.addLeft(covert(sortedList, start,mid-1));
		root.addRight(covert(sortedList, mid+1,end));
		return root;
		
		
	}
	
	public static void main(String [] args){
		int [] sortedList = {1,2,3,4,5};
		ListToBST ltb = new ListToBST();
		Node root = ltb.covert(sortedList, 0, sortedList.length-1);
		System.out.println(root.left.right.value);
		
	
	}
}
