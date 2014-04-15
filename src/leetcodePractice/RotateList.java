package leetcodePractice;

public class RotateList {
	
	public ListNode rotateRight(ListNode head, int n) {
		if(head == null){
			return null;
		}else if(head.next==null){
			return head;
		}else if(n==0){
			return head;
		}
		ListNode run = head;
		ListNode walk = head;
		while(n!=0){
			if(run == null){
				return head;
			}
			run = run.next;
			n--;
		}
		while(run!=null&&run.next!=null){
			walk = walk.next;
			run = run.next;
		}
		if(walk == head){
			return head;
		}
		ListNode newNode = walk.next;
		walk.next = null;
		run.next = head;
		return newNode;
		
    }
	
	public static void main(String [] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		//ListNode n3 = new ListNode(3);
		//ListNode n4 = new ListNode(4);
		//ListNode n5 = new ListNode(5);
		
		n1.next = n2;
		//n2.next = n3;
		//n3.next = n4;
		//n4.next = n5;
		
		RotateList r = new RotateList();
		ListNode head = r.rotateRight(n1, 3);
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
	}
	
}
