package leetcodePractice;

import java.util.ArrayList;

public class RecordList {
	
	public void reorderList(ListNode head){
		if(head == null){
			return;
		}
		ArrayList<ListNode> cache = new ArrayList<ListNode>();
		while(head!=null){
			cache.add(head);
			head = head.next;
		}
		int i = 0;
		while(i<cache.size()/2){
			cache.get(i).next = cache.get(cache.size()-1-i);
			i++;
		}
		int j = cache.size()-1;
		while(j>cache.size()/2){
			cache.get(j).next = cache.get(cache.size()-1-j+1);
			j--;
		}
		cache.get(j).next = null;
	}

	
	
	public static void main(String [] args){
		RecordList r = new RecordList();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		r.reorderList(n1);
		
		while(n1!=null){
			System.out.println(n1.val);
			n1 = n1.next;
		}
		
	}
}
