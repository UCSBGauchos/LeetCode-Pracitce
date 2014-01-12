package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class Anagrams {
	
	public ArrayList<String> anagrams(String[] strs) {
		if(strs.length == 1 && strs[0] == ""){
			return new ArrayList<String>();
		}
		HashMap<String, ArrayList<String>> cache = new HashMap<String, ArrayList<String>>();
		ArrayList<String> result = new ArrayList<String>();
		for(String s: strs){
			char [] charArray = s.toCharArray();
			java.util.Arrays.sort(charArray);
			if(cache.get(new String(charArray)) == null){
				ArrayList<String> list = new ArrayList<String>();
				cache.put(new String(charArray), list);
				list.add(s);
			}else{
				cache.get(new String(charArray)).add(s);
			}
		}
		for(String key: cache.keySet()){
			if(cache.get(key).size()>1){
				for(String s: cache.get(key)){
					result.add(s);
				}
			}
		}
		return result;
    }
	
	public static void main(String [] args){
		Anagrams a = new Anagrams();
		String [] strs = {"abc", "cba", "sdfds"};
		ArrayList<String> list = new ArrayList<String>();
		list = a.anagrams(strs);
		for(String str: list){
			System.out.println(str);
		}
	}
}
