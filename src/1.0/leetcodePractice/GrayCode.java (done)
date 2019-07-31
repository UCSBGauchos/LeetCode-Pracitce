package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class GrayCode {
	
	public int stringToInt(String str){
		int number = 0;
		int length = str.length();
		for(int i=0; i<length; i++){
			number+=(str.charAt(i)-48)*Math.pow(2, length-1-i);
		}
		return number;
	}
	
	public void help(String str, HashMap<String, Boolean> cache, ArrayList<Integer> list){
		int number = stringToInt(str);
		if(!list.contains(number)){
			list.add(number);
		}
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='0'){
				StringBuffer buffer = new StringBuffer(str);
				buffer.setCharAt(i, '1');
				String newString = buffer.toString();
				if(!cache.containsKey(newString)){
					cache.put(newString, true);
					help(newString, cache, list);
				}
			}else if(str.charAt(i)=='1'){
				StringBuffer buffer = new StringBuffer(str);
				buffer.setCharAt(i, '0');
				String newString = buffer.toString();
				if(!cache.containsKey(newString)){
					cache.put(newString, true);
					help(newString, cache, list);
				}
			}
		}
	}
	
	public ArrayList<Integer> grayCode(int n) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i<n; i++){
			buffer.append(0);
		}
		HashMap<String, Boolean> cache = new HashMap<String, Boolean>();
		help(buffer.toString(), cache, result);
		return result;
    }
	
	
	public static void main(String [] args){
		GrayCode g = new GrayCode();
		int n = 2;
		ArrayList<Integer> list = g.grayCode(n);
		for(int i: list){
			System.out.println(i);
		}
		
	}
}
