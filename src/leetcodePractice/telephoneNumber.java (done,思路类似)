package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class telephoneNumber {
	public ArrayList<String> letterCombinations(String digits) {
		if(digits.equals("")){
			String newString = "";
			ArrayList<String> resultArrayList = new ArrayList<String>();
			resultArrayList.add(newString);
			return resultArrayList;
		}
		HashMap<Character, String> hash = new HashMap<Character, String>();
		hash.put('2', "abc");
		hash.put('3', "def");
		hash.put('4', "ghi");
		hash.put('5', "jkl");
		hash.put('6', "mno");
		hash.put('7', "pqrs");
		hash.put('8', "tuv");
		hash.put('9', "wxyz");
		if(digits.length() == 1){
			ArrayList<String> result = new ArrayList<String>();
			char lastChar = digits.charAt(0);
			String buttonList = hash.get(lastChar);
			for(int index = 0; index<buttonList.length(); index++){
				String s = ""+buttonList.charAt(index);
				result.add(s);
			}
			return result;
		}
		char firstChar = digits.charAt(0);
		String remain = digits.substring(1);
		ArrayList<String> prev = letterCombinations(remain);
		ArrayList<String> cur = new ArrayList<String>();
		for(String s: prev){
			String buttonList = hash.get(firstChar);
			for(int index = 0; index<buttonList.length(); index++){
				String newS = buttonList.charAt(index)+s;
				cur.add(newS);
			}
		}
		return cur;
    }
	
	public static void main(String [] args){
		String input = "";
		telephoneNumber t = new telephoneNumber();
		ArrayList<String> result = t.letterCombinations(input);
		for(String s: result){
			System.out.print(s+" ");
		}
	}
}
