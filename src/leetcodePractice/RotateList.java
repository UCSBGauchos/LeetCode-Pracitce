package leetcodePractice;

public class RotateList {
	
	public ListNode rotateRight(ListNode head, int n) {
		if(head == null){
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		ListNode point = head;
		for(int i=0; i<n; i++){
			fast = fast.next;
		}
		while(fast!=null){
			slow = slow.next;
			fast = fast.next;
		}
		while(point.next!=slow){
			point = point.next;
		}
		point.next = null;
		point = slow;
		while(point.next!=null){
			point = point.next;
		}
		point.next = head;
		return slow;
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
		ListNode head = r.rotateRight(n1, 2);
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
	}
	
}
