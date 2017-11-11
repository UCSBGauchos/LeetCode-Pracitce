package leetcodePractice;

public class PartitionLinkedList {
	
	public Node merge(Node first, Node second, int x){
		Node result = first;
		Node point = result;
		
		while(point.next!=null){
			point = point.next;
		}
		point.next = new Node(3);
		point = point.next;
		point.next = second;
		return result;
		
	}
	
	public Node partition(Node head, int x){
		int firstHeadValue = 0;
		int secondHeadValue = 0;
		Node firstPoint = head;
		Node secondPoint = head;
		while(firstPoint!=null){
			if(firstPoint.value<x){
				firstHeadValue = firstPoint.value;
				break;
			}
			firstPoint = firstPoint.next;
		}
		while(secondPoint!=null){
			if(secondPoint.value>x){
				secondHeadValue = secondPoint.value;
				break;
			}
			secondPoint = secondPoint.next;
		}

		
		Node firstHead = new Node(firstHeadValue);
		Node secondHead = new Node(secondHeadValue);
		Node first = firstHead;
		Node second = secondHead;
		
		while(firstPoint.next!=null){
			if(firstPoint.next.value<x){
				first.next = new Node(firstPoint.next.value);
				first = first.next;
			}
			firstPoint = firstPoint.next;
		}
		while(secondPoint.next!=null){
			if(secondPoint.next.value>x){
				second.next = new Node(secondPoint.next.value);
				second = second.next;
			}
			secondPoint = secondPoint.next;
		}
		
		Node result = merge(firstHead, secondHead, x);
		return result;
		
	}
	public static void main(String [] args){
		Node n1 = new Node(1);
		Node n2 = new Node(4);
		Node n3 = new Node(3);
		Node n4 = new Node(2);
		Node n5 = new Node(5);
		Node n6 = new Node(2);
		
		n1.addNext(n2);
		n2.addNext(n3);
		n3.addNext(n4);
		n4.addNext(n5);
		n5.addNext(n6);
		
		PartitionLinkedList pll = new PartitionLinkedList();
		System.out.print(pll.partition(n1, 3).next.next.next.next.next.value);
		
		
		
	}
}
