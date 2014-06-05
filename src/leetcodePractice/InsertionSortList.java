package leetcodePractice;

import java.awt.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InsertionSortList {
	
	public ListNode insertionSortList(ListNode head) {
		if(head == null){
			return null;
		}
		ListNode newHead = null;
		while(head!=null){
			ListNode point = null;
			ListNode prev = null;
			if(newHead == null){
				newHead = new ListNode(head.val);
			}else{
				point = newHead;
				while(point!=null&&point.val<=head.val){
					prev = point;
					point = point.next;
				}
				ListNode newNode = new ListNode(head.val);
				if(prev!=null){
					prev.next = newNode;
					newNode.next = point;
				}else{
					newNode.next = newHead;
					newHead = newNode;
				}
			}
			head = head.next;
		}
		return newHead;
    }
	
	public static void main(String [] args){
		InsertionSortList i = new InsertionSortList();
		ListNode n1 = new ListNode(4);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(3);
		//ListNode n5 = new ListNode(8);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		//n4.next = n5;
		ListNode newHead = i.insertionSortList(n1);
		while(newHead!=null){
			System.out.println(newHead.val);
			newHead = newHead.next;
		}
		
	}
}
