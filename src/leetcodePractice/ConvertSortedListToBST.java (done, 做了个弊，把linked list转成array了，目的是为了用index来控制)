package leetcodePractice;

public class ConvertSortedListToBST {
	
	public TreeNode help(int begin, int end, int [] num){
		if(begin>end){
			return null;
		}
		int middle = (begin+end)/2;
		TreeNode root = new TreeNode(num[middle]);
		root.left = help(begin, middle-1, num);
		root.right = help(middle+1, end, num);
		return root;
	}
	
	public TreeNode sortedListToBST(ListNode head) {
		int num = 0;
		ListNode n = head;
		while(n!=null){
			num++;
			n = n.next;
		}
		int [] array = new int[num];
		n = head;
		int index = 0;
		while(n!=null){
			array[index] = n.val;
			index++;
			n = n.next;
		}
		return help(0, num-1, array);
    }
	
	public static void main(String [] args){
		ConvertSortedListToBST c = new ConvertSortedListToBST();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		
		n1.next = n2;
		n2.next = n3;
		
		System.out.println(c.sortedListToBST(n1).val);
	}
}
