package leetcodePractice;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum {
	
	public void help(int[] candidates, int target, int sum, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> results){
		if(sum == target){
			System.out.println("Got it! "+list);
			ArrayList<Integer> tmp = new ArrayList<Integer>();
//			int [] array = new int[list.size()];
//			for(int i=0; i<list.size(); i++){
//				array[i] = list.get(i);
//			}
//			java.util.Arrays.sort(array);
//			for(int i=0; i<list.size(); i++){
//				tmp.add(array[i]);
//			}
//			//System.out.println("Got it! "+tmp);
//			if(!results.contains(tmp)){
//				results.add(tmp);
//			}
			tmp.addAll(list);
			Collections.sort(tmp);
			if(!results.contains(tmp)){
				results.add(tmp);
			}
		}
		for(int i=0; i<candidates.length; i++){
			System.out.println("should add "+candidates[i]);
			sum+=candidates[i];
			System.out.println(sum);
			if(sum<=target){
				list.add(candidates[i]);
				help(candidates, target, sum, list, results);
				System.out.println(list);
				System.out.println("should remove "+candidates[i]);
				list.remove(list.size()-1);
				sum = sum-candidates[i];
			}else{
				sum = sum-candidates[i];
			}
		}
	}
	
	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
		ArrayList<Integer> snapshot = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		int sum = 0;
		help(candidates, target, sum, snapshot, results);
		return results;
    }
	
	public static void main(String [] args){
		int [] candidates = {8,7,4,3};
		int target = 11;
		CombinationSum c = new CombinationSum();
		System.out.println(c.combinationSum(candidates, target));
	}
}
