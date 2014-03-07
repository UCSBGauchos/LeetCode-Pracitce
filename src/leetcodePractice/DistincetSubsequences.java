package leetcodePractice;

import java.util.ArrayList;

public class DistincetSubsequences {
	
	public ArrayList<String> help(String S, String T, ArrayList<Integer> cache){
		if(S.length()==1){
			ArrayList<String> list = new ArrayList<String>();
			list.add("");
			list.add(S);
			return list;
		}
		char c = S.charAt(0);
		String remain = S.substring(1);
		ArrayList<String> prev = help(remain, T, cache);
		ArrayList<String> cur = new ArrayList<String>();
		cur.addAll(prev);
		for(String str: prev){
			String newString = c+str;
			if(newString.equals(T)){
				cache.add(1);
			}
			cur.add(newString);
		}
		return cur;
	}
	
	public int numDistinct(String S, String T) {
		ArrayList<Integer> cache = new ArrayList<Integer>();
		if(S.equals("")){
			return 0;
		}
		int num = 0;
		ArrayList<String> result = help(S,T,cache);
		
		
		return cache.size();
	}
	
	public static void main(String [] args){
		DistincetSubsequences d = new DistincetSubsequences();
		String S = "anacondastreetracecar";
		String T = "contra";
		System.out.println(d.numDistinct(S, T));
	}
}
