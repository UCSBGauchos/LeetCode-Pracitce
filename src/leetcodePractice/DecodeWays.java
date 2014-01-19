package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DecodeWays {
	
	public int stringToInt(String str){
		if(str.charAt(0)=='0'){
			return 0;
		}
		return (str.charAt(0)-48)*10+(str.charAt(1)-48);
	}
	
	public int help(String s, HashMap<String, Integer> hash){
		System.out.println(s);
		if(s.length() == 1&&!s.equals("0")){
			return 1;
		}else if(s.length() == 0){
			return 1;
		}else if(s.equals("0")){
			return 0;
		}
		char one = s.charAt(0);
		String two = s.substring(0,2);
		String remainOne = s.substring(1);
		String remainTwo = s.substring(2);
		int rTwo = 0;
		int rOne = 0;
		if(stringToInt(two)<=26&&stringToInt(two)>=1){
			if(hash.containsKey(remainTwo)){
				rTwo = hash.get(remainTwo);
			}else{
				rTwo = help(remainTwo, hash);
				hash.put(remainTwo, rTwo);
			}
		}
		if(one!='0'){
			if(hash.containsKey(remainOne)){
				rOne = hash.get(remainOne);
			}else{
				rOne = help(remainOne, hash);
				hash.put(remainOne, rOne);
			}
		}
		return rTwo+rOne;
	}
	
	
	public int numDecodings(String s) {
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		if(s.equals("0")||s.equals("")){
			return 0;
		}
		return help(s, hash);
    }
	
	public static void main(String [] args){
		DecodeWays d = new DecodeWays();
		String s = "11";
		int result = d.numDecodings(s);
		System.out.println(result);
	}
}
