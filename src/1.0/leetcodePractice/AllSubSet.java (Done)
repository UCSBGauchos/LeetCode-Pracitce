package leetcodePractice;

import java.util.ArrayList;

public class AllSubSet {
	
	public ArrayList<ArrayList<Integer>> subsetHelper(ArrayList<Integer> list){
		if(list.size() == 0){
			ArrayList<Integer> onePoss = new ArrayList<Integer>();
			ArrayList<ArrayList<Integer>> possibles = new ArrayList<ArrayList<Integer>>();
			possibles.add(onePoss);
			return possibles;
		}
		int number = list.remove(0);
		ArrayList<ArrayList<Integer>> preLists = subsetHelper(list);
		ArrayList<ArrayList<Integer>> newLists = new ArrayList<ArrayList<Integer>>();
		newLists.addAll(preLists);
		for(ArrayList<Integer> preList: preLists){
			ArrayList<Integer> tmpList = new ArrayList<Integer>();
			tmpList.addAll(preList);
			tmpList.add(number);
			java.util.Collections.sort(tmpList);
			newLists.add(tmpList);
		}
		return newLists;
		
	}
	
	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<S.length; i++){
			list.add(S[i]);
		}
		ArrayList<ArrayList<Integer>> result = subsetHelper(list);
		return result;
    }
	public static void main(String [] args){
		AllSubSet ass = new AllSubSet();
		int [] array = {1,2,3};
		ArrayList<ArrayList<Integer>> result = ass.subsets(array);
		System.out.println(result);
	}
}
