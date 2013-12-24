package leetcodePractice;

public class RemoveNEndList {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode runner = head;
		ListNode walk = head;
		for(int i=0; i<n; i++){
			runner = runner.next;
		}
		while(runner!=null){
			runner = runner.next;
			walk = walk.next;
		}
		if(walk.next!=null){
			walk.val = walk.next.val;
			walk.next = walk.next.next;
		}else{	
			if(walk == head){
				head = null;
			}else{
				ListNode point = head;
				while(point.next.next!=null){
					point = point.next;
				}
				point.next = null;
			}
		}
		return head;
    }
	
	public static void main(String [] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		n1.next = n2;
		
		RemoveNEndList r = new RemoveNEndList();
		ListNode result = r.removeNthFromEnd(n1, 1);
		System.out.println(result.val);
	}
}
