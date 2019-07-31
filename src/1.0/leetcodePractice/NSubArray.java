package leetcodePractice;

import java.util.ArrayList;
import java.util.Stack;

public class NSubArray {
	
	ArrayList<Stack<Character>> allLists = new ArrayList<Stack<Character>>();
	public ArrayList<Stack<Character>> getPer(String str, String Ostr){
		if(str.length()==1){
			Stack<Character> list = new Stack<Character>();
			list.push(str.charAt(0));
			allLists.add(list);
			return allLists;
		}
		char c = str.charAt(0);
		String remain = str.substring(1);
		String preString = Ostr.substring(0, Ostr.length()-remain.length());
		ArrayList<Stack<Character>> preLists = getPer(remain, Ostr);
		Stack<Character> list = new Stack<Character>();
		list.push(c);
		preLists.add(list);
		ArrayList<Stack<Character>> curLists = new ArrayList<Stack<Character>>();
		for(Stack<Character> prelist: preLists){
			char tmp = prelist.peek();
			int endIndex = Ostr.length()-remain.length();
			for(int index = 0;index<preString.length();index++){
				if(preString.charAt(index)==tmp){
					endIndex = index;
					break;
				}
			}
			for(int index = 0;index<endIndex;index++){
				Stack<Character> curList = new Stack<Character>();
				curList.addAll(prelist);
				curList.add(preString.charAt(index));
				if(!allLists.contains(curList)){
					curLists.add(curList);
				}
			}
		}
		allLists.addAll(curLists);
		return allLists;
		
	}
	
	public static void main(String [] args){
		NSubArray nsa = new NSubArray();
		char [] array = {'1','2','3'};
		ArrayList<Stack<Character>> result = new ArrayList<Stack<Character>>();
		String str = new String(array);
		String Ostr = new String(array);
		result = nsa.getPer(str ,Ostr);
		System.out.println(result);
		
	}
}
