package leetcodePractice;

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
	
	public static void main(String [] args){
		PalindromePartition pali = new PalindromePartition();
		String str = "abba";
		if(pali.isPali(str)){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}
