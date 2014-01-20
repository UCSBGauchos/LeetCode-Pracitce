package leetcodePractice;

import java.util.ArrayList;

public class AllSubSets {
	
	 public ArrayList<ArrayList<Integer>> help(String s){
		 if(s.length() == 0){
			 ArrayList<Integer> list = new ArrayList<Integer>();
			 ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
			 result.add(list);
			 return result;
		 }
		 char last = s.charAt(0);
		 String remain = s.substring(1);
		 ArrayList<ArrayList<Integer>> pre = help(remain);
		 ArrayList<ArrayList<Integer>> cur = new ArrayList<ArrayList<Integer>>();
		 for(ArrayList<Integer> list: pre){
			 ArrayList<Integer> newList = new ArrayList<Integer>();
			 for(int i: list){
				 newList.add(i);
			 }
			 if(!cur.contains(newList)){
				 cur.add(newList);
			 }
			 list.add(last-48);
			 if(!cur.contains(list)){
				 cur.add(list);
			 }
		 }
		 return cur;
	 }
	
	 public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
		 java.util.Arrays.sort(num);
		 StringBuffer buffer = new StringBuffer();
		 for(int index = num.length-1; index>=0; index--){
			 buffer.append(num[index]);
		 }
		 return help(buffer.toString());
	 }
	
	public static void main(String [] args){
		AllSubSets a = new  AllSubSets();
		int [] array = {1,2,2};
		ArrayList<ArrayList<Integer>> result = a.subsetsWithDup(array);
		System.out.println(result);
	}
	
}
