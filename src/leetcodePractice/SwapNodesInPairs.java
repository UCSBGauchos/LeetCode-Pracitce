package leetcodePractice;

public class SwapNodesInPairs {
	
	 public ListNode swapTwoNode(ListNode node){
		 ListNode tmp = node.next;
		 node.next = node.next.next;
		 tmp.next = node;
		 return tmp;
	 }
	
	 public ListNode swapPairs(ListNode node) {
		 if(node == null){
			 return null;
		 }
		 if(node.next == null){
			 return node;
		 }
		 ListNode head = null;
		 ListNode point = null;
		 while(node!=null&&node.next!=null){
			 if(head == null){
				 point = swapTwoNode(node);
				 head = point;
			 }else{
				 point.next.next = swapTwoNode(node);
				 point = point.next.next;
			 }
			 node = node.next;
		 }
		 return head;
	 }
	 
	 public static void main(String [] args){
		 
		 SwapNodesInPairs s = new SwapNodesInPairs();
		 
		 ListNode n1 = new ListNode(1);
		 //ListNode n2 = new ListNode(2);
		 //ListNode n3 = new ListNode(3);
		 //ListNode n4 = new ListNode(4);
		 
		 //n1.next = n2;
		 //n2.next = n3;
		 //n3.next = n4;
		 
		 ListNode head = s.swapPairs(n1);
		 while(head!=null){
			 System.out.print(head.val);
			 head = head.next;
		 }
	 }
}
