package leetcodePractice;

public class LinkedListCircle {
	
	public boolean hasCycle(ListNode head){
		ListNode runner = head;
		ListNode slow = head;
		while(runner!=null&&runner.next!=null){
			runner = runner.next.next;
			slow = slow.next;
			if(slow == runner){
				return true;
			}
		}
		if(runner == null || runner.next == null){
			return false;
		}
		return false;
	}
	
	public static void main(String [] args){
		LinkedListCircle l = new LinkedListCircle();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n3;
		
		System.out.println(l.hasCycle(n1));
	}
}
