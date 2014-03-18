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
		Stack<ListNode> stack = new Stack<ListNode>();
		Stack<ListNode> stack2 = new Stack<ListNode>();
		ListNode point = head;
		stack.add(new ListNode(point.val));
		point = point.next;
		while(point!=null){
			while(stack.size()!=0&&stack.peek().val>=point.val){
				stack2.push(new ListNode(stack.pop().val));
			}
			stack.push(new ListNode(point.val));
			while(stack2.size()!=0){
				stack.push(new ListNode(stack2.pop().val));
			}
			point = point.next;
		}
		for(int i=0; i<stack.size()-1; i++){
			stack.get(i).next = stack.get(i+1);
		}
		head = stack.get(0);
		return head;
    }
	
	public static void main(String [] args){
		InsertionSortList i = new InsertionSortList();
		ListNode n1 = new ListNode(6);
		ListNode n2 = new ListNode(5);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(1);
		ListNode n5 = new ListNode(8);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode newHead = i.insertionSortList(n1);
		while(newHead!=null){
			System.out.println(newHead.val);
			newHead = newHead.next;
		}
		
	}
}
