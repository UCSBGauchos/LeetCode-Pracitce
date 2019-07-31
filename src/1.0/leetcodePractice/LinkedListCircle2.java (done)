package leetcodePractice;

public class LinkedListCircle2 {
	
	public ListNode MeetPoint(ListNode head){
		ListNode runner = head;
		ListNode slow = head;
		while(runner!=null&&runner.next!=null){
			runner = runner.next.next;
			slow = slow.next;
			if(slow == runner){
				return slow;
			}
		}
		return null;
	}
	
	public ListNode detectCycle(ListNode head) {
		ListNode meetPoint = MeetPoint(head);
		ListNode startPoint = head;
		if(meetPoint == null){
			return null;
		}
		while(meetPoint!=startPoint){
			meetPoint = meetPoint.next;
			startPoint = startPoint.next;
		}
		return startPoint;
    }
	
	public static void main(String [] args){
		LinkedListCircle2 l = new LinkedListCircle2();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n2;
		ListNode point = l.detectCycle(n1);
		System.out.println(point.val);
	}
}
