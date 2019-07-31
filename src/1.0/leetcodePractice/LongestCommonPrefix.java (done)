package leetcodePractice;

import java.util.HashMap;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0){
			return "";
		}
		String prefix = "";
		HashMap<Integer, Character> cache = new HashMap<Integer, Character>();
		int index = 0;
		int minLength = Integer.MAX_VALUE;
		for(String s: strs){
			if(s.length()<minLength){
				minLength = s.length();
			}
		}
		for(index=0; index<minLength; index++){
			for(String s: strs){
				if(cache.get(index)==null){
					cache.put(index, s.charAt(index));
				}else if(cache.get(index)!=s.charAt(index)){
					return prefix;
				}
			}
			prefix+=cache.get(index);
		}
		return prefix;
    }
	
	public static void main(String [] args){
		String [] strs = {};
		LongestCommonPrefix l = new LongestCommonPrefix();
		System.out.println(l.longestCommonPrefix(strs));
		
	}
}
