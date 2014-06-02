package leetcodePractice;

import java.util.ArrayList;

public class Permutations {
	
	public ArrayList<ArrayList<Integer>> helper(ArrayList<Integer> list){
		if(list.size()==1){
			ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
			result.add(list);
			return result;
		}
		int first = list.get(0);
		ArrayList<Integer> remain = new ArrayList<Integer>();
		for(int i=1; i<list.size(); i++){
			remain.add(list.get(i));
		}
		ArrayList<ArrayList<Integer>> prev = helper(remain);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for(ArrayList<Integer> preList: prev){
			for(int i=0; i<=preList.size(); i++){
				ArrayList<Integer> newList = new ArrayList<Integer>();
				newList.addAll(preList);
				newList.add(i, first);
				result.add(newList);
			}
		}
		return result;
	}
	
	public ArrayList<ArrayList<Integer>> permute(int [] num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i: num){
			list.add(i);
		}
		return helper(list);
    }
	
	public static void main(String [] args){
		Permutations p = new Permutations();
		int [] num = {1,2,3};
		ArrayList<ArrayList<Integer>> result = p.permute(num);
	    System.out.println(result);
	}
}
