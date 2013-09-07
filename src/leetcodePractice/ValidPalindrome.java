package leetcodePractice;

import java.util.Stack;

public class ValidPalindrome {
	public boolean validOalindrome(String str){
		if(str==null){
			return false;
		}else if(str.equals("")){
			return true;
		}else{
			char [] charArray = str.toCharArray();
			int notAlpha = 0;
			for(int i=0;i<charArray.length;i++){
				if(charArray[i]<65||charArray[i]>122){
					notAlpha++;
				}
			}
			int index = 0;
			char [] alphaCharArray = new char[charArray.length-notAlpha];
			for(char c: charArray){
				if(c>=65&&c<=122){
					if(c>=65&&c<=90){
						c+=32;
					}
					alphaCharArray[index] = c;
					index++;
				}
			}
			boolean isOven = false;
			int length = alphaCharArray.length;
			if(length%2==0){
				isOven = true;
			}
			int mid = (length-1)/2;
			if(isOven==true){
				Stack<Character> stack = new Stack<Character>();
				int i=0;
				for(i=0;i<=mid;i++){
					stack.push(alphaCharArray[i]);
				}
				for(int j=i;j<length;j++){
					if(stack.pop()!=alphaCharArray[j]){
						return false;
					}
				}
			}else if(isOven==false){
				Stack<Character> stack = new Stack<Character>();
				int i=0;
				for(i=0;i<mid;i++){
					System.out.print(alphaCharArray[i]);
					stack.push(alphaCharArray[i]);
				}
				System.out.println();
				for(int j=i+1;j<length;j++){
					System.out.print(alphaCharArray[j]);
					if(stack.pop()!=alphaCharArray[j]){
						return false;
					}
				}
				System.out.println();
			}
		}
		return true;
	}
	
	public static void main(String [] args){
		String str = "A man, a plan, a canal: Panama";
		ValidPalindrome vp = new ValidPalindrome();
		if(vp.validOalindrome(str)){
			System.out.println("The string is pali");
		}else{
			System.out.println("the string is not pali");
		}
	}
}
