package leetcodePractice;

import java.util.HashMap;

public class FirstMissingPositive {
	
	public int firstMissingPositive(int[] A) {
        HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>();
        for(int i:A){
        	hash.put(i, true);
        }
        for(int i=1; i<=Integer.MAX_VALUE; i++){
        	if(!hash.containsKey(i)){
        		return i;
        	}
        }
        return Integer.MAX_VALUE;
    }
	
	public static void main(String [] args){
		FirstMissingPositive f = new FirstMissingPositive();
		int [] A = {1,2,0};
		int result = f.firstMissingPositive(A);
		System.out.println(result);
	}
}
