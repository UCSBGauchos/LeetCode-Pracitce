package leetcodePractice;

import java.util.HashMap;

public class ClimbStairs {
	
	public int helper(int n, HashMap<Integer, Integer> cache){
		int result = 0;
		if(n == 0){
        	return 1;
        }else if(n<0){
        	return 0;
        }
		if(cache.containsKey(n)){
			result = cache.get(n);
		}else{
			result = helper(n-1, cache)+helper(n-2, cache);
		}
		cache.put(n, result);
        return result;
	}
	
	public int climbStairs(int n) {
		HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
		int result = helper(n, cache);
		return result;
    }
	
	public static void main(String [] args){
		int n = 35;
		ClimbStairs c = new ClimbStairs();
		System.out.println(c.climbStairs(n));
	}
}
