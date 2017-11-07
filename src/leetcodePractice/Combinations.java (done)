package leetcodePractice;

import java.util.ArrayList;

public class Combinations {
	
	public ArrayList<ArrayList<Integer>> help(int k, ArrayList<Integer> dict, ArrayList<ArrayList<Integer>> result){
		//System.out.println(dict);
		if(dict.size()==0){
			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
			results.add(list);
			return results;
		}
		int first = dict.get(0);
		dict.remove(0);
		ArrayList<ArrayList<Integer>> prev = help(k, dict, result);
		ArrayList<ArrayList<Integer>> newlists = new ArrayList<ArrayList<Integer>>();
		for(ArrayList<Integer> list: prev){
			newlists.add(list);
			ArrayList<Integer> newList = new ArrayList<Integer>();
			newList.addAll(list);
			newList.add(first);
			newlists.add(newList);
			if(newList.size()==k&&!result.contains(newList)){
				java.util.Collections.sort(newList);
				result.add(newList);
			}
		}
		return newlists;
		
	}
	
	public ArrayList<ArrayList<Integer>> combine(int n, int k){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> dict = new ArrayList<Integer>();
		for(int i=1; i<=n; i++){
			dict.add(i);
		}
		help(k, dict, result);
		return result;
	}
	
	public static void main(String [] args){
		Combinations c = new Combinations();
		int n=4;
		int k=2;
		
		System.out.println(c.combine(n, k));
		
	}
}
