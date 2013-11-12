package leetcodePractice;

import java.util.ArrayList;

public class EditDistance {
	
	public ArrayList<String> insert(String word, char c){
		ArrayList<String> newStrings = new ArrayList<String>();
		for(int i=0; i<=word.length(); i++){
			String firstPart = word.substring(0,i);
			String SecondPart = word.substring(i);
			String newString = firstPart+c+SecondPart;
			newStrings.add(newString);
		}
		return newStrings;
	}
	
	public ArrayList<String> replace(String word, ArrayList<Character> Dict){
		ArrayList<String> newStrings = new ArrayList<String>();
		for(char c: Dict){
			for(int i=0; i<word.length(); i++){
				if(!newStrings.contains(word.replace(word.charAt(i), c))){
					newStrings.add(word.replace(word.charAt(i), c));
				}
			}
		}
		return newStrings;
	}
	
	public ArrayList<String> delete(String word){
		ArrayList<String> newStrings = new ArrayList<String>();
		for(int index = 0; index<word.length(); index++){
			StringBuffer buffer = new StringBuffer(word);
			buffer.deleteCharAt(index);
			String newString = buffer.toString();
			newStrings.add(newString);
		}
		return newStrings;
	}
	
	ArrayList<String> has = new ArrayList<String>();
	
	public void minDistance(ArrayList<String> list, ArrayList<Character> Dict, String target){
		ArrayList<String> levelList = new ArrayList<String>();
		for(String str: list){
			
			ArrayList<String> oneStep = replace(str, Dict);
//			for(String s: oneStep){
//				System.out.println("The children of "+oneStep+" is "+s);
//			}
			for(String s: oneStep){
				if(!has.contains(s)){
					levelList.add(s);
					has.add(s);
				}
			}
		}
	}
	
	
	public static void main(String [] args){
		String word1 = "ab";
		String word2 = "ba";
		ArrayList<Character> Dict = new ArrayList<Character>();
		Dict.add('a');
		Dict.add('b');
		EditDistance ed = new EditDistance();
		ArrayList<String> list = new ArrayList<String>();
		list.add(word1);
		ed.minDistance(list, Dict, word2);
		for(String str: ed.has){
			System.out.println(str);
		}
		
	}
}
