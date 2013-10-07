package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class WordBreak {
	
	ArrayList<String> DPcache = new ArrayList<String>();
	public boolean wordBreak(String s, Set<String> dict){
		if(dict.contains(s)){
			return true;
		}
		for(int i = 1; i<=s.length(); i++){
			String firstPart = s.substring(0,i);
			if(dict.contains(firstPart)){
				String remain = s.substring(i);
				if(!DPcache.contains(remain)){
					boolean result = wordBreak(remain, dict);
					if(result==true){
						return true;
					}else{
						DPcache.add(remain);
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
