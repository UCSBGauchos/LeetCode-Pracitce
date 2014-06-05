package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class CopyListWithRandomPointer {
	
	public RandomListNode help(RandomListNode head, HashMap<RandomListNode, RandomListNode> hash){
		if(head == null){
			return null;
		}
		RandomListNode newHead = null;
		RandomListNode point = null;
		while(head!=null){
			if(newHead == null){
				newHead = new RandomListNode(head.label);
				point = newHead;
				if(head.random!=null){
					RandomListNode newRanNode = new RandomListNode(head.random.label);
					point.random = newRanNode;
					hash.put(head.random, newRanNode);
				}
			}else{
				if(!hash.containsKey(head)){
					RandomListNode newNode = new RandomListNode(head.label);
					point.next = newNode;
					point = newNode;
				}else{
					point.next = hash.get(head);
					point = hash.get(head);
				}
				if(head.random!=null){
					if(!hash.containsKey(head.random)){
						RandomListNode newRanNode = new RandomListNode(head.random.label);
						point.random = newRanNode;
						hash.put(head.random, newRanNode);
					}else{
						point.random = hash.get(head.random);
					}
				}
			}
			head = head.next;
		}
		return newHead;
	}
	
	
	
	
	public RandomListNode copyRandomList(RandomListNode head) {
		HashMap<RandomListNode, RandomListNode> hasCreRan = new HashMap<RandomListNode, RandomListNode>();
		return help(head, hasCreRan);
    }
	
	public static void main(String [] args){
		CopyListWithRandomPointer c = new CopyListWithRandomPointer();
		RandomListNode n1 = new RandomListNode(1);
		RandomListNode n2 = new RandomListNode(2);
		RandomListNode n3 = new RandomListNode(3);
		n1.next = n2;
		n2.next = n3;
		n3.next = null;
		n1.random = n3;
		n2.random = n1;
		n3.random = n2;
		
		RandomListNode result = c.copyRandomList(n1);
		
		System.out.println(result.next.next.random.label);
		
	}
}
