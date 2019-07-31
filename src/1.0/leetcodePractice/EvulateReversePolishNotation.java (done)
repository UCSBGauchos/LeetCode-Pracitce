package leetcodePractice;

import java.util.Stack;

public class EvulateReversePolishNotation {
	
	public int evalRPN(String[] tokens) {
		if(tokens.length==1){
			return Integer.parseInt(tokens[0]);
		}
		int result = 0;
		int num1 = 0;
		int num2 = 0;
		//Stack<Integer> tmp = new Stack<Integer>();
		Stack<String> stack = new Stack<String>();
		for(String str : tokens){
			result = 0;
			if(str.equals("+")){
				if(!stack.isEmpty()&&!stack.peek().equals("+")&&!stack.peek().equals("-")&&!stack.peek().equals("*")&&!stack.peek().equals("/")){
					num2 = Integer.parseInt(stack.pop());
				}
				if(!stack.isEmpty()&&!stack.peek().equals("+")&&!stack.peek().equals("-")&&!stack.peek().equals("*")&&!stack.peek().equals("/")){
					num1 = Integer.parseInt(stack.pop());
				}
				result = result+num1+num2;
				stack.push(String.valueOf(result));
			}else if(str.equals("-")){
				if(!stack.isEmpty()&&!stack.peek().equals("+")&&!stack.peek().equals("-")&&!stack.peek().equals("*")&&!stack.peek().equals("/")){
					num2 = Integer.parseInt(stack.pop());
				}
				if(!stack.isEmpty()&&!stack.peek().equals("+")&&!stack.peek().equals("-")&&!stack.peek().equals("*")&&!stack.peek().equals("/")){
					num1 = Integer.parseInt(stack.pop());
				}
				result = result+num1-num2;
				stack.push(String.valueOf(result));
			}else if(str.equals("/")){
				if(!stack.isEmpty()&&!stack.peek().equals("+")&&!stack.peek().equals("-")&&!stack.peek().equals("*")&&!stack.peek().equals("/")){
					num2 = Integer.parseInt(stack.pop());
				}
				if(!stack.isEmpty()&&!stack.peek().equals("+")&&!stack.peek().equals("-")&&!stack.peek().equals("*")&&!stack.peek().equals("/")){
					num1 = Integer.parseInt(stack.pop());
				}
				result = result+num1/num2;
				stack.push(String.valueOf(result));
			}else if(str.equals("*")){
				if(!stack.isEmpty()&&!stack.peek().equals("+")&&!stack.peek().equals("-")&&!stack.peek().equals("*")&&!stack.peek().equals("/")){
					num2 = Integer.parseInt(stack.pop());
				}
				if(!stack.isEmpty()&&!stack.peek().equals("+")&&!stack.peek().equals("-")&&!stack.peek().equals("*")&&!stack.peek().equals("/")){
					num1 = Integer.parseInt(stack.pop());
				}
				result = result+num1*num2;
				stack.push(String.valueOf(result));
			}else{
				stack.push(str);
			}
		}
		return result;
    }
	
	public static void main(String [] args){
		EvulateReversePolishNotation e = new EvulateReversePolishNotation();
		String [] tokens = {"3","11","5","+","-"};
		System.out.println(e.evalRPN(tokens));
	}
}
