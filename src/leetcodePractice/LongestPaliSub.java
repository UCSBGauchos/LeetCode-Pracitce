package leetcodePractice;

import java.util.Stack;

public class LongestPaliSub {
	
	public boolean isPali(String s){
		if(s == null){
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		int length = s.length();
		if(length == 1){
			return true;
		}
		int halfIndex = length/2-1;
		int i = 0;
		for(i=0; i<=halfIndex; i++){
			stack.push(s.charAt(i));
		}
		if(length%2 != 0){
			i++;
		}
		while(i<length){
			if(s.charAt(i)!=stack.pop()){
				return false;
			}
			i++;
		}
		return true;
		
	}
	
	public String longestPalindrome(String s) {
		int length = s.length();
		for(int i=length; i>=1; i--){
			//for each substring length
			for(int j=0; j<=length-i; j++){
				String sub = s.substring(j, j+i);
				if(isPali(sub)){
					return sub;
				}
			}
		}
		return null;
	}
	
	public static void main(String [] args){
		LongestPaliSub l = new LongestPaliSub();
		String s = "abba";
		System.out.println(l.longestPalindrome(s));
	}
}
