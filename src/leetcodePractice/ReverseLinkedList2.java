package leetcodePractice;

public class ReverseLinkedList2 {
	
	public ListNode help(ListNode head, int m, int n) {
		if(m == n){
			return head;
		}
		ListNode first = head;
		ListNode second = head;
		ListNode firstPrev = head;
		ListNode secondPrev = head;
		for(int i=1; i<m; i++){
			first = first.next;
		}
		for(int i=1; i<n; i++){
			second = second.next;
		}
		for(int i=1; i<m-1; i++){
			firstPrev = firstPrev.next;
		}
		for(int i=1; i<n-1; i++){
			secondPrev = secondPrev.next;
		}
		if(first.next!=second){
			if(m == 1){
				ListNode tmpNext = first.next;
				first.next = second.next;
				second.next = tmpNext;
				secondPrev.next = first;
				return second;
			}
			ListNode tmpNext = first.next;
			first.next = second.next;
			second.next = tmpNext;
			firstPrev.next = second;
			secondPrev.next = first;
		}else{
			if(m == 1){
				first.next = second.next;
				second.next = first;
				return second;
			}
			first.next = second.next;
			second.next = first;
			firstPrev.next = second;
		}
		
		return head;
    }
	
	public ListNode reverseBetween(ListNode head, int m, int n){
		ListNode newHead = null;
		while(m<=n){
			newHead = help(head, m, n);
			m++;
			n--;
			head = newHead;
		}
		return newHead;
	}
	
	public static void main(String [] args){
		ReverseLinkedList2 r = new ReverseLinkedList2();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		//n4.next = n5;
		
		ListNode head = r.reverseBetween(n1, 1, 4);
		while(head != null){
			System.out.print(head.val);
			head = head.next;
		}
	}
	
}
