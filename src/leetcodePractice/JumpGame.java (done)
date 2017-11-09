package leetcodePractice;

import java.util.HashMap;

public class JumpGame {
	
	public boolean help(int [] A, int index, HashMap<Integer, Boolean> cache){
		int maxLength = A[index];
		// basecase
		if(maxLength == 0&&index!=A.length-1){
			return false;
		}
		if(index == A.length-1){
			return true;
		}
		for(int i=1; i<=maxLength; i++){
			int newIndex = index+i;
			if(!cache.containsKey(newIndex)){
				boolean result = help(A, newIndex, cache);
				if(result){
					cache.put(newIndex, true);
				    return true;
				}else{
					cache.put(newIndex, false);
				}
			}else{
				if(cache.get(newIndex)){
					return true;
				}
			}
			
		}
		return false;
	}
	
	public boolean canJump(int[] A) {
		int startPosition = 0;
		HashMap<Integer, Boolean> cache = new HashMap<Integer, Boolean>(); 
		return help(A, startPosition, cache);
    }
	
	public static void main(String [] args){
		JumpGame j = new JumpGame();
		int [] A = {2,3,1,1,4};
		System.out.println(j.canJump(A));
	}
}
