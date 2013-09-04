package leetcodePractice;

import java.util.ArrayList;

public class SumOfBinaryTree {
	public ArrayList<Integer> getSum(Node node){
		ArrayList<Integer> sumList = new ArrayList<Integer>();
		if(node == null){
			sumList.add(0);
			return sumList;
		}
		ArrayList<Integer> previousLeftSumList = getSum(node.left);
		ArrayList<Integer> previousRightSumList = getSum(node.right);
		ArrayList<Integer> previousSumList = new ArrayList<Integer>();
		previousSumList.addAll(previousRightSumList);
		previousSumList.addAll(previousLeftSumList);
		if(previousRightSumList.size()==previousLeftSumList.size()&&previousLeftSumList.contains(0)&&previousRightSumList.contains(0)){
			previousSumList.remove(0);
		}
		for(int subInteger: previousSumList){
			//System.out.println("sub is "+subInteger);
			int value = 0;
			if(subInteger == 0){
				value = node.value;
			}else{
				value = (int) (subInteger+node.value*(Math.pow(10,getDigitNum(subInteger))));
			}
			//System.out.println("after add is "+value);
			sumList.add(value);
		}
		return sumList;
//		int leftValue = getSum(node.left)+node.value*(10^(getDigitNum(getSum(node.left))-1));
//		int rightValue = getSum(node.right)+node.value*(10^(getDigitNum(getSum(node.right))-1));
		
	}
	
//	public int getHeight(Node node){
//		if(node == null){
//			return 0;
//		}
//		return Math.max(getHeight(node.left), getHeight(node.right))+1;
//	}
	
//	public int getLength(Node root, Node node){
//		if(root == node){
//			return 0;
//		}
//		if(root == null){
//			return 999;
//		}
//		return Math.min(getLength(root.left, node), getLength(root.right, node))+1;
//	}
	public int getDigitNum(int number){
		int result = 1;
		while(number/10!=0){
			number = number/10;
			result++;
		}
		return result;
	}
				

	
	
	public static void main(String [] args){
		SumOfBinaryTree sbt = new SumOfBinaryTree();
		int sum = 0;
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.addLeft(n2);
		n1.addRight(n5);
		n2.addLeft(n3);
		n2.addRight(n4);
		ArrayList<Integer> result = new ArrayList<Integer>();
		result = sbt.getSum(n1);
		for(int i: result){
			System.out.println(i+" is in tree");
			sum+=i;
		}
		System.out.println("the sum is "+sum);
	}
}
