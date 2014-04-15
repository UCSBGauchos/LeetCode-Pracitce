package leetcodePractice;

import java.util.Stack;

public class LongestValidParentheses {
	
	public int longestValidParentheses(String s) {
		char [] array = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		int number = 0;
		int longest = 0;
		int prev = 0;
		for(int i=0; i<array.length; i++){
			if(array[i]=='('){
				number = 0;
				stack.push(array[i]);
			}else if(array[i]==')'){
				if(stack.size()!=0&&stack.peek()=='('){
					number = number+2;
					stack.pop();
				}else{
					number = 0;
				}
			}
			if(number>=longest){
				longest = number;
			}
		}
		System.out.println(longest);
		System.out.println(prev);
		return longest;
	}
	
	public static void main(String [] args){
		LongestValidParentheses l = new LongestValidParentheses();
		String s = "()((())";
		System.out.println(l.longestValidParentheses(s));
		
	}
}
