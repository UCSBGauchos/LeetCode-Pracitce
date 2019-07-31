package leetcodePractice;

import java.util.ArrayList;

public class CombinationSum2 {
	
	public void help(ArrayList<ArrayList<Integer>> lists, ArrayList<Integer> list, ArrayList<Integer> input, int target){
		int sum = 0;
		for(int i: list){
			sum+=i;
		}
		if(sum==target){
			ArrayList<Integer> snapShot = new ArrayList<Integer>();
			snapShot.addAll(list);
			java.util.Collections.sort(snapShot);
			if(!lists.contains(snapShot)){
				lists.add(snapShot);
			}
		}
		
		for(int i=0; i<input.size(); i++){
			int number = input.get(i);
			if(number<=target){
				input.remove(i);
				list.add(number);
				help(lists, list, input, target);
				list.remove(list.size()-1);
				input.add(number);
			}
		}
	}
	
	public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> input = new ArrayList<Integer>();
		for(int i: num){
			input.add(i);
		}
		help(lists, list, input, target);
		return lists;
	}
	
	public static void main(String [] args){
		CombinationSum2 c = new CombinationSum2();
		int [] num = {10,1,2,7,6,1,5};
		int target = 8;
		ArrayList<ArrayList<Integer>> result = c.combinationSum2(num, target);
		System.out.println(result);
		
	}
	
	
}
