package leetcodePractice;

import java.util.HashMap;

public class SingleNum {
	
	 public int singleNumber(int[] A) {
		 HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		 for(int i: A){
			 if(hash.get(i)==null){
				 hash.put(i, 1);
			 }else{
				 hash.put(i, 2);
			 }
		 }
		 for(int key: hash.keySet()){
			 if(hash.get(key)==1){
				 return key;
			 }
		 }
		 return 0;
	 }
	
	public static void main(String [] args){
		SingleNum s = new SingleNum();
		int [] A = {1,1,2,3,3};
		System.out.println(s.singleNumber(A));
	}
}
