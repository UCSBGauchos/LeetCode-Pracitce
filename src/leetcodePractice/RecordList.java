package leetcodePractice;

import java.util.ArrayList;

public class RecordList {
	
	public ArrayList<ListNode> getFrontList(ListNode head, int size){
		ArrayList<ListNode> cache = new ArrayList<ListNode>();
		ListNode point = head;
		for(int i=0; i<size; i++){
			cache.add(point);
			point = point.next;
		}
		return cache;
	}
	
	public void getBackList(ArrayList<ListNode> cache, ListNode head, int size){
		if(head == null){
			return;
		}
		getBackList(cache, head.next, size);
		if(cache.size()<=size-1){
			cache.add(head);
		}
	}
	
	public void reorderList(ListNode head) {
		if(head == null){
			return;
		}
		ArrayList<ListNode> frontCache = null;
		ArrayList<ListNode> behindCache = new ArrayList<ListNode>();
		ListNode point = head;
		ListNode middle = head;
		int length = 0;
		while(point!=null){
			length++;
			point = point.next;
		}
		if(length == 1){
			return;
		}
		int half = length/2;
		if(length%2!=0){
			for(int index = 0; index<half; index++){
				middle = middle.next;
			}
		}
		frontCache = getFrontList(head, half);
		getBackList(behindCache, head, half);
		for(int i=0; i<half; i++){
			frontCache.get(i).next = behindCache.get(i);
			if(i+1<half){
				behindCache.get(i).next = frontCache.get(i+1);
			}else{
				behindCache.get(i).next = null;
			}
		}
		if(length%2!=0){
			behindCache.get(half-1).next = middle;
			middle.next = null;
		}
		head = frontCache.get(0);
    }
	
	public static void main(String [] args){
		RecordList r = new RecordList();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
		ListNode n8 = new ListNode(8);
		ListNode n9 = new ListNode(9);
		
		
		
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		
		r.reorderList(n1);
		
	}
}
