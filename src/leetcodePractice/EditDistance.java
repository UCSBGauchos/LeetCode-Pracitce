package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class EditDistance {
	
	int min = Integer.MAX_VALUE;
	
	public String insert(String a, int place, char c){
		StringBuffer buffer = new StringBuffer(a);
		buffer.insert(place, c);
		return buffer.toString();
	}
	
	public String delete(String a, int place){
		StringBuffer buffer = new StringBuffer(a);
		buffer.deleteCharAt(place);
		return buffer.toString();
	}
	
	public String replace(String a, int place, char c){
		StringBuffer buffer = new StringBuffer(a);
		buffer.setCharAt(place, c);
		return buffer.toString();
	}
	
	public int help(String word1, String word2, char [] dict, ArrayList<String> cache, int add, int del, int mod){
		if(word1.equals(word2)){
			//System.out.println("Got it! ");
			if(add+mod+del<=min){
				min = add+mod+del;
				//System.out.println("Now the smallest one is "+min);
			}
			return min;
		}
		if(word1.length()<word2.length()){
			for(char c: dict){
				for(int i=0; i<=word1.length(); i++){
					String newStr = insert(word1, i, c);
					if(!cache.contains(newStr)){
						add++;
						cache.add(newStr);
						help(newStr, word2, dict, cache, add, mod, del);
						cache.remove(newStr);
						add--;
					}
				}
			}
		}
		if(word1.length()>word2.length()){
			for(int i=0; i<word1.length(); i++){
				String newStr = delete(word1, i);
				if(!cache.contains(newStr)){
					cache.add(newStr);
					del++;
					help(newStr, word2, dict, cache, add, mod, del);
					cache.remove(newStr);
					del--;
				}
			}
		}
		if(word1.length()==word2.length()){
			//System.out.println(cache);
			for(char c: dict){
				for(int i=0; i<word1.length(); i++){
					String newStr = replace(word1, i, c);
					if(!cache.contains(newStr)){
						cache.add(newStr);
						mod++;
						help(newStr, word2, dict, cache, add, mod, del);
						cache.remove(newStr);
						mod--;
					}
				}
			}
		}
		
		return min;
	}
	
	
	public int minDistance(String word1, String word2) {
		char [] dict = {'a', 'b', 'c', 'd', 'e', 'f', 'g','h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
//		char [] array1 = word1.toCharArray();
//		ArrayList<Character> tmp = new ArrayList<Character>();
//		for(char c: array1){
//			tmp.add(c);
//		}
//		char [] array2 = word2.toCharArray();
//		StringBuffer buffer = new StringBuffer();
//		for(int i = 0; i<array2.length; i++){
//			if(!tmp.contains(array2[i])){
//				buffer.append(array2[i]);
//			}
//		}
//		//System.out.println(buffer.toString());
//		//char [] dict = buffer.toString().toCharArray();
		ArrayList<String> cache = new ArrayList<String>();
		int add = 0;
		int del = 0;
		int mod = 0;
		return help(word1, word2, dict, cache, add, del, mod);
		
    }
	
	public static void main(String [] args){
		EditDistance e = new EditDistance();
		String word1 = "abc";
		String word2 = "ab";
		System.out.println(e.minDistance(word1, word2));
	}
}
