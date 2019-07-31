package leetcodePractice;

public class MergeTwoSortedLinkedList {
	
	public ListNode mergeTwoLinkedList(ListNode h1, ListNode h2){
		ListNode head = null;
		ListNode point = null;
		while(h1!=null||h2!=null){
			if(h1==null){
				if(head == null){
					head = new ListNode(h2.val);
					point = head;
				}else{
					point.next = new ListNode(h2.val);
					point = point.next;
				}
				h2 = h2.next;
			}else if(h2 == null){
				if(head == null){
					head = new ListNode(h1.val);
					point = head;
				}else{
					point.next = new ListNode(h1.val);
					point = point.next;
				}
				h1 = h1.next;
			}else if(h1!=null&&h2!=null){
				if(h1.val<=h2.val){
					if(head == null){
						head = new ListNode(h1.val);
						point = head;
					}else{
						point.next = new ListNode(h1.val);
						point = point.next;
					}
					h1 = h1.next;
				}else if(h1.val>h2.val){
					if(head == null){
						head = new ListNode(h2.val);
						point = head;
					}else{
						point.next = new ListNode(h2.val);
						point = point.next;
					}
					h2 = h2.next;
				}
			}
		}
		return head;
	}
	
	public static void main(String [] args){
		ListNode l1n1 = new ListNode(1);
		ListNode l1n2 = new ListNode(3);
		ListNode l1n3 = new ListNode(5);
		ListNode l1n4 = new ListNode(7);
		l1n1.next = l1n2;
		l1n2.next = l1n3;
		l1n3.next = l1n4;
		
		ListNode l2n1 = new ListNode(2);
		ListNode l2n2 = new ListNode(4);
		ListNode l2n3 = new ListNode(6);
		ListNode l2n4 = new ListNode(8);
		l2n1.next = l2n2;
		l2n2.next = l2n3;
		l2n3.next = l2n4;
		
		MergeTwoSortedLinkedList m = new MergeTwoSortedLinkedList();
		ListNode head = m.mergeTwoLinkedList(l1n1, l2n1);
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
		
		
	}
}
