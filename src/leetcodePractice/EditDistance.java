package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class EditDistance {
	
	
	//this function will return all the possibilities 
	public  HashMap<String, Boolean> helper(String word1, String word2) {
		HashMap<String, Boolean> next = new  HashMap<String, Boolean>();
		char [] dict = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int result = 0;
		
		for(int i=0; i<=word1.length(); i++){
			for(char c: dict){
				StringBuffer buffer = new StringBuffer(word1);
				buffer.insert(i, c);
				String insertedString = buffer.toString();
				next.put(insertedString, true);
			}
		}
		
		for(int i=0; i<word1.length(); i++){
			StringBuffer buffer = new StringBuffer(word1);
			buffer.deleteCharAt(i);
			String removedString = buffer.toString();
			next.put(removedString, true);
		}
		
		for(int i=0; i<word1.length(); i++){
			for(char c: dict){
				StringBuffer buffer = new StringBuffer(word1);
				buffer.setCharAt(i, c);
				String modifiedString = buffer.toString();
				next.put(modifiedString, true);
			}
		}
		
		
		
		
			
		return next;
    }
	
	public static void main(String [] args){
		String word1 = "abc";
		String word2 = "abcde";
		
		EditDistance m  = new EditDistance();
		HashMap<String, Boolean> result = m.helper(word1, word2);
		for(String s: result.keySet()){
			System.out.println(s);
		}
	}
	
}
