package leetcodePractice;

public class AddTwoNumber {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode point = null;
		boolean curBigTen = false;
		boolean pastBigTen = false;
		while(l1!=null||l2!=null){
			if(l1==null&&l2!=null){
				int value = l2.val;
				if(pastBigTen == true){
					value = value+1;
					pastBigTen = false;
				}
				if(value>=10){
					value = value%10;
					curBigTen = true;
				}
				ListNode newNode = new ListNode(value);
				if(head==null){
					head = newNode;
				}else{
					point.next = new ListNode(value);
					point = point.next;
				}
				pastBigTen = curBigTen;
				curBigTen = false;
				l2 = l2.next;
			}else if(l2==null&&l1!=null){
				int value = l1.val;
				if(pastBigTen == true){
					value = value+1;
					pastBigTen = false;
				}
				if(value>=10){
					value = value%10;
					curBigTen = true;
				}
				if(head == null){
					point = head;
				}else{
					point.next = new ListNode(value);
					point = point.next;
				}
				pastBigTen = curBigTen;
				curBigTen = false;
				l1 = l1.next;
			}else if(l1!=null&&l2!=null){
				int value = l1.val+l2.val;
				if(pastBigTen == true){
					value = value+1;
					pastBigTen = false;
				}
				if(value>=10){
					value = value%10;
					curBigTen = true;
				}
				if(head == null){
					head = new ListNode(value);
					point = head;
				}else{
					point.next = new ListNode(value);
					point = point.next;
				}
				pastBigTen = curBigTen;
				curBigTen = false;
				l1 = l1.next;
				l2 = l2.next;
			}
		}
		if(pastBigTen == true){
			if(head == null){
				head = new ListNode(1);
				point = head;
			}else{
				point.next = new ListNode(1);
				point = point.next;
			}
			pastBigTen = false;
		}
		return head;
    }
	
	public static void main(String [] args){
		AddTwoNumber a = new AddTwoNumber();
		
		ListNode l1n1 = new ListNode(3);
		ListNode l1n2 = new ListNode(7);
		//ListNode l1n3 = new ListNode(3);
		
		l1n1.next = l1n2;
		//l1n2.next = l1n3;
		
		ListNode l2n1 = new ListNode(9);
		ListNode l2n2 = new ListNode(2);
		//ListNode l2n3 = new ListNode(4);
		
		l2n1.next = l2n2;
		//l2n2.next = l2n3;
		
		ListNode result = a.addTwoNumbers(l1n1, l2n1);
		System.out.println(result.val);
		System.out.println(result.next.val);
		System.out.println(result.next.next.val);
		
	}
	
}
