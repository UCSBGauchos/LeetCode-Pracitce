package leetcodePractice;

import java.util.ArrayList;

public class InterString {
	
	public ArrayList<Character> stringToArrayList(String str){
		char [] array = new char[str.length()];
		array = str.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		for(int index = 0;index<str.length();index++){
			list.add(array[index]);
		}
		return list;
	}
	
	public String arrayListToString(ArrayList<Character> list){
		char [] array = new char [list.size()];
		int index = 0;
		for(char c: list){
			array[index] = c;
			index++;
		}
		return new String(array);
	}
	
	public boolean isInter(String s1, String s2, String s3, int i, boolean first){
		ArrayList<Character> str1 = stringToArrayList(s1);
		ArrayList<Character> str2 = stringToArrayList(s2);
		ArrayList<Character> str3 = stringToArrayList(s3);
		if(i == s3.length()){
			return true;
		}
		boolean result = false;
		if(first == true&&str1.contains(s3.charAt(i))){
			int index = str1.indexOf(s3.charAt(i));
			str1.remove(index);
			String newS1 = arrayListToString(str1);
			first = false;
			result = isInter(newS1, s2, s3, i+1, first);
		}else if(first == false&&str2.contains(s3.charAt(i))){
			int index = str2.indexOf(s3.charAt(i));
			str2.remove(index);
			String newS2 = arrayListToString(str2);
			first = true;
			result = isInter(s1, newS2, s3, i+1, first);
		}else{
			return false;
		}
		return result;
	}
	
	public static void main(String [] args){
		String s1 = "aabcc";
		String s2 = "dbbca";
		String s3 = "aadbbcbcca";
		InterString is = new InterString();
		boolean result = (is.isInter(s1, s2, s3, 0, true)||is.isInter(s1, s2, s3, 0, false));
		System.out.println(result);
	}
}
