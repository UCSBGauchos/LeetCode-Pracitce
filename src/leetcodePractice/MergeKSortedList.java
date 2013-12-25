package leetcodePractice;

import java.util.ArrayList;

public class MergeKSortedList {
	public ListNode mergeKLists(ArrayList<ListNode> lists) {
		if(lists.size()==0){
			return null;
		}
		ListNode head = null;
		ListNode insertNode = null;
		ListNode point = null;
		while(lists.size()!=0){
			//get the min node
			int min = Integer.MAX_VALUE;
			for(ListNode node: lists){
				if(node!=null&&node.val<=min){
					min = node.val;
					insertNode = node;
				}
			}
			if(insertNode!=null){
				//System.out.println("node the smallest one is "+insertNode.val);
				if(head == null){
					point = new ListNode(insertNode.val);
					head = point;
					//System.out.println("head is "+head.val);
				}else{
					point.next = new ListNode(insertNode.val);
					//System.out.println("next is "+insertNode.val);
					point = point.next;
				}
				int index = lists.indexOf(insertNode);
				lists.set(index, lists.get(index).next);
				if(lists.get(index)==null){
					lists.remove(index);
				}
			}else{
				lists.remove(lists.indexOf(insertNode));
			}
			insertNode = null;
		}
		return head;
    }
	
	public static void main(String [] args){
		ListNode l1n1 = null;
		//ListNode l1n2 = new ListNode(2);
		//ListNode l1n3 = new ListNode(5);
		//ListNode l1n4 = new ListNode(7);
		
		ListNode l2n1 = new ListNode(2);
		ListNode l2n2 = new ListNode(4);
		ListNode l2n3 = new ListNode(6);
		ListNode l2n4 = new ListNode(8);
		
		//l1n1.next = l1n2;
		//l1n2.next = l1n3;
		//l1n3.next = l1n4;
		
		l2n1.next = l2n2;
		l2n2.next = l2n3;
		l2n3.next = l2n4;
		
		ArrayList<ListNode> list = new ArrayList<ListNode>();
		list.add(l1n1);
		list.add(l2n1);
		MergeKSortedList m = new MergeKSortedList();
		ListNode node = m.mergeKLists(list);
		while(node!=null){
			System.out.println(node.val);
			node = node.next;
		}
	}
}
