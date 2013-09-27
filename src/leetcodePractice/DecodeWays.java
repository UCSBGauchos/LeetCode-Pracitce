package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DecodeWays {
	
	ArrayList<ArrayList<String>> allLists = new ArrayList<ArrayList<String>>();
	int number = 0;
	public ArrayList<ArrayList<String>> deCode(String str){
		if(str.length() == 0){
			ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();
			ArrayList<String> list = new ArrayList<String>();
			lists.add(list);
			number++;
			return lists;
		}
		String lastOne = str.substring(0,1);
		String remainOne = str.substring(1);
		ArrayList<ArrayList<String>> preLists1 = deCode(remainOne);
		ArrayList<ArrayList<String>> curLists1 = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> curLists2 = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> allCurLists = new ArrayList<ArrayList<String>>();
		for(ArrayList<String> preList: preLists1){
			ArrayList<String> curList = new ArrayList<String>();
			curList.addAll(preList);
			curList.add(lastOne);
			curLists1.add(curList);
			if(lastOne.equals("1")){
				allLists.add(curList);
			}
		}
		if(str.length()>=2){
			String lastTwo = str.substring(0,2);
			String remainTwo = str.substring(2);
			ArrayList<ArrayList<String>> preLists2 = deCode(remainTwo);
			for(ArrayList<String> preList: preLists2){
				ArrayList<String> curList = new ArrayList<String>();
				curList.addAll(preList);
				curList.add(lastTwo);
				curLists2.add(curList);
				if(lastTwo.equals("12")){
					allLists.add(curList);
				}
			}
		}
		allCurLists.addAll(curLists1);
		allCurLists.addAll(curLists2);
		return allCurLists;	
	}
	
	
	
	
	public static void main(String [] args){
		Map<Character, Character> map = new HashMap<Character, Character>();
		for(int i = 1; i<=26; i++){
			char key = (char)(i+48);
			char value = (char)(64+i);
			map.put(key, value);
		}
		String str = "123";
		DecodeWays dw = new DecodeWays();
		dw.deCode(str);
		System.out.println(dw.number);
		System.out.println(dw.allLists);

	}
}
