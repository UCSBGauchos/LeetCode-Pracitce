package leetcodePractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class DistinctSub {
//	public ArrayList<String> getAllSubString(String str){
//		ArrayList<String> result = new ArrayList<String>();
//		for(int begin = 0;begin<str.length();begin++){
//			for(int end = begin+1;end<=str.length();end++){
//				if(!result.contains(str.substring(begin, end))){
//					result.add(str.substring(begin, end));
//				}
//			}
//		}
//		return result;
//	}
	
	public ArrayList<CharacterNode> initializeString(String str){
		ArrayList<CharacterNode> result = new ArrayList<CharacterNode>();
		char [] charArray = str.toCharArray();
		int index = 0;
		for(char c: charArray){
			CharacterNode node = new CharacterNode(c,index);
			result.add(node);
			index++;
		}
		return result;
	}
	
	
	public ArrayList<Stack<CharacterNode>> towers = new  ArrayList<Stack<CharacterNode>>();
	Stack<CharacterNode> tower = new Stack<CharacterNode>();
	public void getSub(ArrayList<CharacterNode> list, CharacterNode bottom){
		tower.push(bottom);
		for(CharacterNode node: list){
			if(node.index<bottom.index){
				getSub(list, node);
				Stack<CharacterNode> tmpStack = new Stack<CharacterNode>();
				Iterator<CharacterNode> it = tower.iterator();
				while(it.hasNext()){
					CharacterNode node1 = it.next();  
	                tmpStack.push(node1);
				}
				towers.add(tmpStack);
				tower.pop();
			}
		}
	}
	
//	public Stack<CharacterNode> getSub(ArrayList<CharacterNode> list, CharacterNode bottom){
//		Stack<CharacterNode> tower = new Stack<CharacterNode>();
//		for(CharacterNode node: list){
//			if(node.index<bottom.index){
//				System.out.println(node.value+" can be on "+bottom.value);
//				tower = getSub(list, node);
//				
//			}
//		}
//		if(bottom!=null){
//			tower.push(bottom);
//			Stack<CharacterNode> tmpStack = new Stack<CharacterNode>();
//			Iterator<CharacterNode> it = tower.iterator();
//			while(it.hasNext()){
//				CharacterNode node1 = it.next();  
//                tmpStack.push(node1);
//			}
//			towers.add(tmpStack);
//		}
//		return tower;
//	}
	
	public static void main(String [] args){
		DistinctSub ds = new DistinctSub();
		String Str1 = "abc";
		//String Str2 = "rabbit";
		ArrayList<CharacterNode> S = ds.initializeString(Str1);
		//ArrayList<CharacterNode> T = ds.initializeString(Str2);
		CharacterNode bottom = new CharacterNode('x',Integer.MAX_VALUE);
		ds.getSub(S, bottom);
		for(Stack<CharacterNode> tower: ds.towers){
			tower.remove(0);
			while(tower.size()!=0){
				System.out.print(tower.pop().value);
			}
			System.out.println();
		}
	}
}
