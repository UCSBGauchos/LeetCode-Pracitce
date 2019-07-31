package leetcodePractice;

import java.util.ArrayList;
import java.util.Stack;

public class PalindromePartition {
	
	public boolean isPali(String s){
		char [] charArray = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		int length = charArray.length;
		int i = 0;
		int j=0;
		for(i=0; i<length/2; i++){
			stack.add(charArray[i]);
		}
		if(length%2 == 0){
			for(j=i; j<charArray.length; j++){
				if(stack.pop()!=charArray[j]){
					return false;
				}
			}
		}else{
			for(j=i+1; j<charArray.length; j++){
				if(stack.pop()!=charArray[j]){
					return false;
				}
			}
		}
		return true;
	}
	
	public void help(String s, ArrayList<ArrayList<String>> result, ArrayList<String> list){
		if(isPali(s)){
			list.add(s);
			ArrayList<String> SnapShot = new ArrayList<String>();
			for(String str: list){
				SnapShot.add(str);
			}
			result.add(SnapShot);
			list.remove(s);
		}
		for(int i=1; i<s.length(); i++){
			String last = s.substring(0,i);
			if(isPali(last)){
				list.add(last);
				String remain =s.substring(i);
				help(remain, result, list);
				list.remove(last);
			}
		}
	}
	
	public ArrayList<ArrayList<String>> partition(String s) {
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		ArrayList<String> list = new ArrayList<String>();
		help(s, result, list);
		return result;
    }
	
	public static void main(String [] args){
		PalindromePartition p = new PalindromePartition();
		String s = "cbbbcc";
		System.out.println(p.partition(s));
	}
}
