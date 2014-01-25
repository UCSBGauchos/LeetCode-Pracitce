package leetcodePractice;

import java.util.Stack;

public class ValidPalindrome {
	public boolean isPalindrome(String str){
		if(str==null){
			return false;
		}else if(str.equals("")){
			return true;
		}else{
			char [] charArray = str.toCharArray();
			int Alpha = 0;
			for(int i=0;i<charArray.length;i++){
				if((charArray[i]>=65&&charArray[i]<=90)||(charArray[i]>=48&&charArray[i]<=57)||(charArray[i]>=97&&charArray[i]<=122)){
					Alpha++;
				}
			}
			int index = 0;
			char [] alphaCharArray = new char[Alpha];
			for(char c: charArray){
				if((c>=65&&c<=90)||(c>=48&&c<=57)||(c>=97&&c<=122)){
					if(c>=65&&c<=90){
						c+=32;
					}
					alphaCharArray[index] = c;
					index++;
				}
			}
			boolean isOven = false;
			int length = alphaCharArray.length;
			if(length%2==0&&length!=0){
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
					stack.push(alphaCharArray[i]);
				}
				System.out.println(stack);
				for(int j=i+1;j<length;j++){
					if(stack.pop()!=alphaCharArray[j]){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String [] args){
		String str = "`l;`` 1o1 ??;l`";
		ValidPalindrome vp = new ValidPalindrome();
		if(vp.isPalindrome(str)){
			System.out.println("The string is pali");
		}else{
			System.out.println("the string is not pali");
		}
	}
}
