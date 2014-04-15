package leetcodePractice;

import java.util.HashMap;

public class JumpGame {
	
	public int helper(int [] A, int index, int goal, int minSteps, HashMap<Integer, Integer> cache){
		if(index == goal){
			return 0;
		}
		for(int tryStep = 1; tryStep<=A[index]; tryStep++){
			int newIndex = index+tryStep;
			if(newIndex<=goal){
				int steps = 0;
				if(cache.containsKey(newIndex)){
					steps = cache.get(newIndex);
				}else{
					steps = helper(A, newIndex, goal, minSteps, cache)+1;
					cache.put(newIndex, steps);
				}
				if(steps<minSteps){
					minSteps = steps;
				}
			}
		}
		return minSteps;
	}
	
	public int jump(int[] A) {
		int goal = A.length-1;
		int index = 0;
		int minSteps = 999999;
		HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
		return helper(A, index, goal, minSteps, cache);
    }
	
	public static void main(String [] args){
		int [] A = {2,3,1,1,4};
		JumpGame j = new JumpGame();
		System.out.println(j.jump(A));
	}
}
