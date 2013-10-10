package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveDupInLinkedList {
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null){
			return null;
		}
		ArrayList<Integer> cache = new ArrayList<Integer>();
		ListNode point = head;
		cache.add(point.val);
		while(point.next!=null){
			while(point.next!=null&&cache.contains(point.next.val)){
				point.next = point.next.next;
			}
			if(point.next!=null){
				point = point.next;
				cache.add(point.val);
			}
		}
		return head;
    }
	
	public static void main(String [] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(2);
		n1.next = n2;
		n2.next = n3;
	
		RemoveDupInLinkedList rd = new RemoveDupInLinkedList();
		ListNode head = rd.deleteDuplicates(n1);
		System.out.println(head.next.val);
		
	}
}
