//package leetcodePractice;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class EditDistance {
//	
//	public String intsert(String str, char c, int index){
//		StringBuffer buffer = new StringBuffer();
//		buffer.insert(index, c);
//		return buffer.toString();
//	}
//	
//	public String delete(String str, int index){
//		StringBuffer buffer = new StringBuffer();
//		buffer.deleteCharAt(index);
//		return buffer.toString();
//	}
//	
//	public String replace(String str, char c, int index){
//		StringBuffer buffer = new StringBuffer();
//		buffer.setCharAt(index, c);
//		return buffer.toString();
//	}
//	
//	public int help(String word1, String word2, char [] dict){
//		if(word1.equals(word2)){
//			return 0;
//		}
//		int addSum = 0;
//		int deleteSum = 0;
//		int replaceSum = 0;
//		
//		//add
//		if(word1.length()<word2.length()){
//			for(int i=0; i<word1.length(); i++){
//				for(char c: dict){
//					String newStringAfterInsert = intsert(word1, c, i);
//					addSum = help(newStringAfterInsert, word2, dict)+1;
//				}
//			}
//		}
//		
//		//delete
//		for(int i=0; i<word1.length(); i++){
//			String newStringAfterDelete = delete(word1, i);
//			deleteSum = help(newStringAfterDelete, word2, dict)+1;
//		}
//		
//		//replace
//		for(int i=0; i<word2.length(); i++){
//			for(char c: dict){
//				String newStringAfterReplace = replace(word1, c, i);
//				replaceSum = help(newStringAfterReplace, word2, dict)+1;
//			}
//		}
//		
//		
//		
//		
//		
//	}
//	
//	public int minDistance(String word1, String word2) {
//		char [] dict = word2.toCharArray();
//		help(word1, word2, dict);
//		return 0;
//    }
//	
//	public static void main(String [] args){
//		String str1  ="cat";
//		String str2 = "dog";
//		
//		
//	}
//}
