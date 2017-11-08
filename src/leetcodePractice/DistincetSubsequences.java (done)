package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class DistincetSubsequences {
	
	int sum = 0;
	
	public int help(String S, String T, char [] dict){

		if(T.length()-S.length()==0&&!S.equals(T)){
			return 0;
		}else if(T.length()-S.length()==0&&S.equals(T)){
			return 1;
		}
		
		for(char c: dict){
			for(int i=0; i<T.length(); i++){
				StringBuffer buffer = new StringBuffer(T);
				buffer.insert(i, c);
				String newString = buffer.toString();
				if(help(S, newString, dict)!=0){
					sum++;
				}
			}
		}
		return 0;
	}
	
	public int numDistinct(String S, String T) {
		
		if(S.length()<T.length()){
			return 0;
		}
		
		HashMap<Character, Boolean> hash = new HashMap<Character, Boolean>();
		char [] array = T.toCharArray();
		for(char c: array){
			hash.put(c, true);
		}
		char [] dict = new char[hash.keySet().size()];
		int index = 0;
		for(char c: hash.keySet()){
			dict[index] = c;
			index++;
		}
		return help(S, T, dict);
    }
	
	
	public static void main(String [] args){
		DistincetSubsequences d = new DistincetSubsequences();
		String S = "anacondastreetracecar";
		String T = "contra";
		d.numDistinct(S, T);
		System.out.println(d.sum);
	}
}
