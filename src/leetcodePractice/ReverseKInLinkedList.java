package leetcodePractice;

import java.util.ArrayList;

public class ReverseKInLinkedList {
	
	public ListNode reverseHelper(ListNode node, int index, int k){
		if(index == k/2-1){
			if(k%2==0){
				return node.next;
			}else{
				return node.next.next;
			}
		}
		int newIndex = index+1;
		ListNode newNode = node.next;
		ListNode result = reverseHelper(newNode, newIndex, k);
		ListNode tmp = result;
		if(newNode.next == result){
			newNode.next = result.next;
			tmp.next = newNode;
		}else{
			ListNode tmp2 = newNode.next;
			newNode.next = result.next;
			tmp.next = tmp2;
			ListNode point = tmp;
			while(point.next!=tmp){
				point = point.next;
			}
			point.next = newNode;
		}
		node.next = tmp;
		return newNode.next;
		
	}
	
	public ListNode reverseKGroupTrigger(ListNode head, int k) {
		ListNode result = reverseHelper(head, 0, k);
		ListNode tmp = result;
		ListNode tmp2 = head.next;
		head.next = result.next;
		tmp.next = tmp2;
		ListNode point = tmp;
		while(point.next!=tmp){
			point = point.next;
		}
		point.next = head;
		return tmp;
    }
	
	public boolean isValid(ListNode head, int k){
		for(int i=0; i<k; i++){
			if(head==null){
				return false;
			}
			head = head.next;
		}
		return true;
	}
	
	public ListNode getNext(ListNode head, int k){
		for(int i=0; i<k; i++){
			head = head.next;
		}
		return head;
	}
	
	public ListNode jump(ListNode head, int k){
		for(int i=0; i<k-1; i++){
			head = head.next;
		}
		return head;
	}
	
	public ListNode reverseKGroup(ListNode head, int k){
		ListNode trueHead = head;
		if(k==1){
			return head;
		}
		if(head==null){
			return null;
		}
		ArrayList<ListNode> headList = new ArrayList<ListNode>();
		ArrayList<ListNode> reverseHeadList = new ArrayList<ListNode>();
		//add all the normal into the list first
		int index = 0;
		while(isValid(head, k)){
			//System.out.println(head.val);
			headList.add(head);
			head = getNext(head, k);
		}
		for(ListNode h: headList){
			ListNode reverseHead = reverseKGroupTrigger(h, k);
			reverseHeadList.add(reverseHead);
		}
		for(int i=0; i<reverseHeadList.size()-1; i++){
			ListNode nextNode = jump(reverseHeadList.get(i), k);
			nextNode.next = reverseHeadList.get(i+1);
		}
		if(reverseHeadList.size()>0){
			return reverseHeadList.get(0);
		}else{
			return trueHead;
		}
	}
	
	public static void main(String [] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		
		
		//n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		ReverseKInLinkedList r = new ReverseKInLinkedList();
		ListNode head = r.reverseKGroup(n1, 2);
		while(head!=null){
			System.out.print(head.val);
			head = head.next;
		}
	}
}
