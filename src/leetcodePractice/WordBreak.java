package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class WordBreak {
	
	Map<String, Boolean> DPmap = new HashMap<String, Boolean>();
	public boolean wordBreak(String s, Set<String> dict){
		if(dict.contains(s)){
			return true;
		}
		for(int i = 1; i<=s.length(); i++){
			String firstPart = s.substring(0,i);
			String remain = s.substring(i);
			if(dict.contains(firstPart)){
				if(DPmap.containsKey(remain)){
					if(DPmap.get(remain)){
						return true;
					}
				}else{
					Boolean result = wordBreak(remain, dict);
					DPmap.put(remain, result);
					if(result){
					    return true;
					}
				}
			}
		}
		return false;
	}
	
	public static void main(String [] args){
		WordBreak wb = new WordBreak();
		Set<String> Dict = new HashSet<String>();
		Dict.add("peach");
		Dict.add("apple");
		Dict.add("pear");
		Dict.add("pie");
		
		
		System.out.println(Dict);
		String str= "applepie";
		System.out.println(wb.wordBreak(str, Dict));
	}
}
