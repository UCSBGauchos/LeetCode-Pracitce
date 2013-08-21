package leetcodePractice;

import java.util.ArrayList;
import java.util.Stack;

public class PalindromePartition {
	public boolean isOven(int length){
		if(length%2 == 0){
			return true;
		}else{
			return false;
		}
	}
	public boolean isPali(String str){
		if(str == ""){
			return true;
		}
		int mid = str.length()/2;
		int after = 0;
		char [] charArray = str.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(int index = 0; index < mid; index++){
			stack.push(charArray[index]);
		}
		if(isOven(str.length())){
			after = mid;
		}else{
			after = mid+1;
		}
		for(int index = after; index<str.length(); index++){
			if(stack.pop()!=charArray[index]){
				return false;
			}
		}
		return true;
	}
	
	public void getSubString(String str){
		for(int i=1;i<str.length();i++){
			String front = str.substring(0,i);
			String behind = str.substring(i);
			System.out.println(front);
			System.out.println(behind);
		}
	}
	
	public void minCutMainFucntion(String str, int number, int [] mins, int level, Stack<Integer> tmp){
		if(isPali(str)){
			mins[0] = 0;
			return;
		}
		for(int i=1;i<str.length();i++){
			if(level == 1){
				number = 0;
				tmp = new Stack<Integer>();
				tmp.push(Integer.MAX_VALUE);
			}
			String front = str.substring(0,i);
			String behind = str.substring(i);
			number ++;
			if(isPali(front)&&isPali(behind)){
				if(number<tmp.peek()){
					tmp.push(number);
					mins[i] = number;
				}
			}else if(!isPali(front)){
				int newLevel = level+1;
				minCutMainFucntion(front, number, mins, newLevel, tmp);
			}
			else if(!isPali(behind)){
				int newLevel = level+1;
				minCutMainFucntion(behind, number, mins, newLevel, tmp);
			}
			else{
				return;
			}
		}
	}
		
	public void minCut(String str){
		int level = 1;
		int [] mins = new int[str.length()];
		for(int index = 0; index<str.length(); index++){
			mins[index] = Integer.MAX_VALUE;
		}
		Stack<Integer> tmp = null;
		minCutMainFucntion(str, 0, mins, level, tmp);
		for(int i=1; i<str.length();i++){
			System.out.println(mins[i]);
		}
	}
	
	public static void main(String [] args){
		PalindromePartition pali = new PalindromePartition();
		String str = "aab";
		pali.minCut(str);
	}
}
