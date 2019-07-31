package leetcodePractice;

import java.util.ArrayList;
import java.util.Stack;

public class SubString {
	
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
	
	
	public ArrayList<ArrayList<String>> getSubString(String str){
		ArrayList<ArrayList<String>> CResult = new ArrayList<ArrayList<String>>();
		if(isPali(str)){
			ArrayList<String> Pali = new ArrayList<String>();
			ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
			Pali.add(str);
			result.add(Pali);
			return result;
		}
		for(int i=1; i<str.length(); i++){
			String front = str.substring(0,i);
			String behind = str.substring(i);
			if(!isPali(front)&&isPali(behind)){
				System.out.println("Processing "+front);
				ArrayList<ArrayList<String>> PResult = new ArrayList<ArrayList<String>>();
				PResult = getSubString(front);
				for(ArrayList<String> subPali: PResult){
					subPali.add(behind);
					System.out.println("add "+behind+" is "+subPali);
					CResult.add(subPali);
				}
			}else if(!isPali(behind)&&isPali(front)){
				System.out.println("Processing "+behind);
				ArrayList<ArrayList<String>> PResult = new ArrayList<ArrayList<String>>();
				CResult = new ArrayList<ArrayList<String>>();
				PResult = getSubString(behind);
				for(ArrayList<String> subPali: PResult){
					subPali.add(front);
					System.out.println("add "+front+" is "+subPali);
					CResult.add(subPali);
				}
			}else if(isPali(behind)&&isPali(front)){
				System.out.println("add "+front+behind);
				ArrayList<String> subPali = new ArrayList<String>();
				subPali.add(front);
				subPali.add(behind);
				System.out.println("return "+subPali);
				CResult.add(subPali);
			}else if(!isPali(behind)&&!isPali(front)){
				ArrayList<ArrayList<String>> frontResult = new ArrayList<ArrayList<String>>();
				ArrayList<ArrayList<String>> behindResult = new ArrayList<ArrayList<String>>();
				frontResult = getSubString(front);
				behindResult = getSubString(behind);
				frontResult.addAll(behindResult);
				CResult = frontResult;
			}
		}
		return CResult;
	}
	public static void main(String [] args){
		SubString s = new SubString();
//		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		System.out.println(s.getSubString("abcd").size());
		
	}
}
