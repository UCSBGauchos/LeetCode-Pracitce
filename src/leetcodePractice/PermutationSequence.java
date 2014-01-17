package leetcodePractice;

import java.util.ArrayList;

public class PermutationSequence {
	
	public ArrayList<String> helper(String str){
		if(str.length() == 1){
			ArrayList<String> result = new ArrayList<String>();
			result.add(str);
			return result;
		}
		char last = str.charAt(0);
		String remain = str.substring(1);
		ArrayList<String> prev = helper(remain);
		ArrayList<String> cur = new ArrayList<String>();
		for(String s: prev){
			for(int i = 0; i<=s.length(); i++){
				StringBuffer buffer = new StringBuffer(s);
				buffer.insert(i, last);
				cur.add(buffer.toString());
			}
		}
		return cur;
		
	}
	
	public String getPermutation(int n, int k){
		StringBuffer buffer = new StringBuffer();
		for(int i=1; i<=n; i++){
			buffer.append(i);
		}
		ArrayList<String> results = helper(buffer.toString());
		String [] array = new String [results.size()];
		int index = 0;
		for(String s: results){
			array[index] = s;
			index++;
		}
		java.util.Arrays.sort(array);
		return array[k-1];
	}
	
	public static void main(String [] args){
		int n = 8;
		int k = 15485;
		PermutationSequence p = new PermutationSequence();
		String result = p.getPermutation(n, k);
		System.out.println(result);
	}
}
