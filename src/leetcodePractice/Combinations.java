package leetcodePractice;

import java.util.ArrayList;

public class Combinations {
	
	public ArrayList<ArrayList<Integer>> removeDup(ArrayList<ArrayList<Integer>> lists){
		ArrayList<ArrayList<Integer>> newResult = new ArrayList<ArrayList<Integer>>();
		for(ArrayList<Integer> list: lists){
			java.util.Collections.sort(list);
			if(!newResult.contains(list)){
				newResult.add(list);
			}
		}
		return newResult;
	}
	
	public ArrayList<ArrayList<Integer>> helperFunction(ArrayList<Integer> list, int k){
		ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
		if(k==1){
			ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
			for(int number: list){
				ArrayList<Integer> onePossible = new ArrayList<Integer>();
				onePossible.add(number);
				result.add(onePossible);
			}
			return result;
		}
		for(int i=0; i<list.size(); i++){
			int choose = list.remove(i);
			ArrayList<ArrayList<Integer>> pre = helperFunction(list, k-1);
			for(ArrayList<Integer> preList: pre){
				preList.add(choose);
			}
			list.add(choose);
			java.util.Collections.sort(list);
			all.addAll(pre);
		}
		return all;
	}
	
	 public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=n; i++){
			list.add(i);
		}
		 ArrayList<ArrayList<Integer>> result = helperFunction(list, k);
		 return result;
	 }
	 
	 public static void main(String [] args){
		 Combinations c = new Combinations();
		 ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		 int scope = 10;
		 int number = 7;
		 lists = c.combine(scope, number);
		 System.out.println(c.removeDup(lists));
	 }
	 
}
