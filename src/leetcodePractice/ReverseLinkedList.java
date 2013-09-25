package leetcodePractice;

public class ReverseLinkedList {
	
	public Node reverse(Node node, int begin, int end){
		int mid = ((begin-1)+(end-1))/2;
		for(int index = 0; index<begin-1; index++){
			node = node.next;
		}
		if((end-begin)%2==0){
			return swapOdd(node, begin-1, mid);
		}else{
			return swapEven(node, begin-1, mid);
		}
	}
	
	public Node swapEven(Node node, int index, int mid){
		if(index == mid){
//			System.out.println(node.value);
//			System.out.println(node.next.value);
			int tmp = node.value;
			node.value = node.next.value;
			node.next.value = tmp;
			return node.next;
		}
		Node nextNode = swapEven(node.next, index+1, mid);
//		System.out.println(node.value);
//		System.out.println(nextNode.next.value);
		int tmp = node.value;
		node.value = nextNode.next.value;
		nextNode.next.value = tmp;
		return nextNode.next;
	}
	
	public Node swapOdd(Node node, int index, int mid){
		if(index == mid){
			return node;
		}
		Node nextNode = swapOdd(node.next, index+1, mid);
//		System.out.println(node.value);
//		System.out.println(nextNode.next.value);
		int tmp = node.value;
		node.value = nextNode.next.value;
		nextNode.next.value = tmp;
		return nextNode.next;
	}
	
	public static void main(String [] args){
		ReverseLinkedList rll = new ReverseLinkedList();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.addNext(n2);
		n2.addNext(n3);
		n3.addNext(n4);
		n4.addNext(n5);
		rll.reverse(n1, 2, 5);
		Node traverse = n1;
		while(traverse!=null){
			System.out.println(traverse.value);
			traverse = traverse.next;
		}
		
	}
}
