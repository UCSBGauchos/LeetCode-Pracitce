package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class SubstringWithConcatenationOfAllWords {
	
	//get all con of an inputlist
	public HashMap<String, Boolean> getAll(ArrayList<String> list){	
		if(list.size()==1){
			HashMap<String, Boolean> result = new HashMap<String, Boolean>();
			result.put(list.get(0), true);
			return result;
		}
		
		String top = list.get(0);
		list.remove(top);
		HashMap<String, Boolean> cur = new HashMap<String, Boolean>();
		HashMap<String, Boolean> last = getAll(list);
		for(String s: last.keySet()){
			for(int i=0; i<=s.length(); i=i+top.length()){
				String first = s.substring(0,i);
				String second = s.substring(i);
				String newString = first+top+second;
				cur.put(newString, true);
			}
		}
		return cur;
	}
	
	public ArrayList<Integer> findSubstring(String S, String[] L) {
		ArrayList<String> list = new ArrayList<String>();
		HashMap<String, Boolean> hash = new HashMap<String, Boolean>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(String s: L){
			list.add(s);
		}
		int size = list.size();
		hash = getAll(list);
		int length = list.get(0).length()*size;
		for(int i=0; i<=S.length()-length; i++){
			String sub = S.substring(i, i+length);
			if(hash.containsKey(sub)){
				result.add(i);
			}
		}
		return result;
    }

	public static void main(String [] args){
		String S = "barfoothefoobarman";
		String [] L = {"foo", "bar"};
		ArrayList<Integer> result = new ArrayList<Integer>();
		SubstringWithConcatenationOfAllWords s = new SubstringWithConcatenationOfAllWords();
		result = s.findSubstring(S, L);
		for(int i: result){
			System.out.println(i);
		}
	}
}
