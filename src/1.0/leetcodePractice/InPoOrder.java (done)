package leetcodePractice;

public class InPoOrder {
	
	//based on current in and po determin the root
	public Node determinCurRoot(int [] inOrder, int [] postOrder){
		for(int poIndex = postOrder.length-1; poIndex>=0; poIndex--){
			for(int inIndex = 0; inIndex<=inOrder.length-1; inIndex++){
				if(postOrder[poIndex] == inOrder[inIndex]){
					return new Node(postOrder[poIndex]);
				}
			}
		}
		return null;
	}
	
	public Node createBinTree(int [] inOrder, int [] postOrder){
		
		if(inOrder.length==1){
			return new Node(inOrder[0]);
		}
		Node root = determinCurRoot(inOrder, postOrder);
		int rootIndex = 0;
		for(rootIndex = 0; rootIndex<inOrder.length; rootIndex++){
			if(inOrder[rootIndex] == root.value){
				break;
			}
		}
		
		int rightFront = rootIndex+1;
		int rightBehind = inOrder.length-1;
		int leftFront = 0;
		int leftBehind = rootIndex-1;
		
		int [] leftTree = new int[leftBehind - leftFront+1];
		int leftTreeIndex = 0;
		for(int i=leftFront;i<=leftBehind;i++){
			leftTree[leftTreeIndex] = inOrder[i];
			leftTreeIndex++;
		}
		root.addLeft(createBinTree(leftTree, postOrder));
		
		int [] rightTree = new int[rightBehind - rightFront+1];
		int rightTreeIndex = 0;
		for(int i = rightFront; i<=rightBehind; i++){
			rightTree[rightTreeIndex] = inOrder[i];
			rightTreeIndex++;
		}
		root.addRight(createBinTree(rightTree, postOrder));
		return root;
	}
	
	public static void main(String [] args){
		int [] inOrder = {2,1,4,3,5};
		int [] postOrder = {2,4,5,3,1};
		InPoOrder ipo = new InPoOrder();
		Node root = ipo.createBinTree(inOrder, postOrder);
		System.out.println(root.right.right.value);
	}
}
