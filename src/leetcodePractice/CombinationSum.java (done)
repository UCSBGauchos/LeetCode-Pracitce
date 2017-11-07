package leetcodePractice;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum {
	
	public void help(int[] candidates, int target, int sum, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> results){
		if(sum == target){
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.addAll(list);
			Collections.sort(tmp);
			if(!results.contains(tmp)){
				results.add(tmp);
			}
		}
		for(int i=0; i<candidates.length; i++){
			sum+=candidates[i];
			if(sum<=target){
				list.add(candidates[i]);
				help(candidates, target, sum, list, results);
				//这里要注意，这里同时对sum进行了还原，原因是这里修改的是for的结果，而不是递归，消除的是sum的影响
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
		int [] candidates = {2,3,6,7};
		int target = 7;
		CombinationSum c = new CombinationSum();
		System.out.println(c.combinationSum(candidates, target));
	}
}
