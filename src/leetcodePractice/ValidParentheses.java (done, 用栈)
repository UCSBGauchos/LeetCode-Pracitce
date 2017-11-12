package leetcodePractice;

import java.util.Stack;

public class ValidParentheses {
	
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		char [] array = s.toCharArray();
		for(int index = 0; index<s.length(); index++){
			if(array[index] == '('||array[index] == '{'||array[index] == '['){
				stack.push(array[index]);
			}else if(array[index] == ')'){
				if(stack.size()>0&&stack.peek()!='('){
					return false;
				}else if(stack.size()>0){
					stack.pop();
				}else{
					return false;
				}
			}else if(stack.size()>0&&array[index] == '}'){
				if(stack.peek()!='{'){
					return false;
				}else if(stack.size()>0){
					stack.pop();
				}else{
					return false;
				}
			}else if(array[index] == ']'){
				if(stack.size()>0&&stack.peek()!='['){
					break;
				}else if(stack.size()>0){
					stack.pop();
				}else{
					return false;
				}
			}
		}
		if(stack.size()==0){
			return true;
		}else{
			return false;
		}
    }
	
	public static void main(String [] args){
		String input = "(((";	
		ValidParentheses v = new ValidParentheses();
		System.out.println(v.isValid(input));
	}
}
