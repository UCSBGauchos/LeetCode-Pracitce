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
		ArrayList<Integer> dup = new ArrayList<Integer>();
		ListNode point = head;
		cache.add(point.val);
		while(point.next!=null){
			if(point.next!=null&&cache.contains(point.next.val)){
				dup.add(point.next.val);
			}
			while(point.next!=null&&cache.contains(point.next.val)){
				point.next = point.next.next;
			}
			if(point.next!=null){
				point = point.next;
				cache.add(point.val);
			}
		}
		//System.out.println(dup);
		point = head;
		ListNode point2 = head;
		while(point!=null){
			if(dup.contains(point.val)&&point.next!=null){
				point.val = point.next.val;
				point.next = point.next.next;
			}else if(dup.contains(point.val)&&point.next==null){
				//System.out.println("need to remove the last element "+point.val);
				if(point == head){
					return null;
				}
				while(point2.next!=point){
					point2 = point2.next;
				}
				point2.next = null;
				point = point.next;
			}else{
				point = point.next;
			}
		}
		return head;
    }
	
	public static void main(String [] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		//ListNode n3 = new ListNode(3);
		//ListNode n4 = new ListNode(3);
		//ListNode n5 = new ListNode(4);
		//ListNode n6 = new ListNode(4);
		//ListNode n7 = new ListNode(5);
		
		
		n1.next = n2;
		//n2.next = n3;
		//n3.next = n4;
		//n4.next = n5;
		//n5.next = n6;
		//n6.next = n7;
		
	
		RemoveDupInLinkedList rd = new RemoveDupInLinkedList();
		ListNode head = rd.deleteDuplicates(n1);
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
		
	}
}
