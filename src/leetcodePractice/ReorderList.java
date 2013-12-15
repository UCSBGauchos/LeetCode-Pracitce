package leetcodePractice;

public class ReorderList {
	
	public void reorderList(ListNode head) {
		ListNode slow = head;
		ListNode runner = head;
		while(runner.next != null && runner.next.next!=null){
			runner = runner.next.next;
			slow = slow.next;
		}
		if(runner.next.next==null){
			runner = runner.next;
		}
		System.out.println(slow.val);
		System.out.println(runner.val);
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
		
		ReorderList r  =new ReorderList();
		r.reorderList(n1);
		
	}
}
