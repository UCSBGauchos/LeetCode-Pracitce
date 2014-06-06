package leetcodePractice;

import java.util.ArrayList;

public class RotateList {
	
	public ListNode rotateRight(ListNode head, int n) {
		
		if(head == null){
			return null;
		}
		ArrayList<ListNode> list = new ArrayList<ListNode>();
		ListNode point = head;
		while(point!=null){
			list.add(point);
			point = point.next;
		}
		
		if(list.size()==1||list.size()==n){
			return head;
		}
		
		if(n>list.size()){
			n = n%list.size();
		}
		
		if(n == 0){
			return head;
		}

		int index = list.size()-1-n;
		list.get(index).next = null;
		list.get(list.size()-1).next = list.get(0);
		return list.get(index+1);
    }
	
	public static void main(String [] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		RotateList r = new RotateList();
		ListNode head = r.rotateRight(n1, 1);
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
	}
	
}
