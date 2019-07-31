package leetcodePractice;

public class PartitionList {
	
	 public ListNode partition(ListNode head, int x) {
		 ListNode leftHead = null;
		 ListNode leftTail = null;
		 ListNode rightHead = null;
		 ListNode rightTail = null;
		 while(head!=null){
			 if(head.val>=x){
				 if(rightHead == null){
					 ListNode newNode = new ListNode(head.val);
					 rightHead = newNode;
					 rightTail = newNode;
				 }else{
					 ListNode newNode = new ListNode(head.val);
					 rightTail.next = newNode;
					 rightTail = newNode;
				 }
			 }else if(head.val<x){
				 if(leftHead == null){
					 ListNode newNode = new ListNode(head.val);
					 leftHead = newNode;
					 leftTail = newNode;
				 }else{
					 ListNode newNode = new ListNode(head.val);
					 leftTail.next = newNode;
					 leftTail = newNode;
				 }
			 }
			 head = head.next;
		 }
		 if(leftHead!=null&&rightHead!=null){
			 leftTail.next = rightHead;
		 }
		 if(leftHead!=null){
			 return leftHead;
		 }else if(rightHead!=null){
			 return rightHead;
		 }else{
			 return null;
		 }
	 }
	
	
	public static void main(String [] args){
		PartitionList p = new PartitionList();
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(2);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(2);
		
		//n1.next = n2;
		//n2.next = n3;
		//n3.next = n4;
		//n4.next = n5;
		//n5.next = n6;
		
		ListNode head = p.partition(n1, 0);
		while(head!=null){
			System.out.print(head.val);
			head = head.next;
		}
	}
	
}
