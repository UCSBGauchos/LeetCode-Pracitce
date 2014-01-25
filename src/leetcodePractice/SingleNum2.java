package leetcodePractice;

import java.util.HashMap;

public class SingleNum2 {
	public int singleNumber(int[] A) {
		 HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		 for(int i: A){
			 if(hash.get(i)==null){
				 hash.put(i, 1);
			 }else{
				 int oldValue = hash.get(i);
				 int newValue = oldValue+1;
				 hash.put(i, newValue);
			 }
		 }
		 for(int key: hash.keySet()){
			 if(hash.get(key)!=3){
				 return key;
			 }
		 }
		 return 0;
	 }
	
	public static void main(String [] args){
		SingleNum2 s = new SingleNum2();
		int [] A = {1,1,1,2,3,3,3};
		System.out.println(s.singleNumber(A));
	}
}
