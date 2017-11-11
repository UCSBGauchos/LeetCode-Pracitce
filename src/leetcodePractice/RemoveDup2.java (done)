package leetcodePractice;

import java.util.HashMap;

public class RemoveDup2 {
	
	 public int removeDuplicates(int[] A) {
		 HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		 int n = A.length;
		 for(int index = 0; index<n; index++){
			 if(hash.get(A[index]) == null){
				 hash.put(A[index], 1);
			 }else{
				 int newValue = hash.get(A[index])+1;
				 hash.put(A[index], newValue);
			 }
			 if(hash.get(A[index])>2){
				 int tmp = index;
				 for(int i = index; i<n-1; i++){
					 A[i] = A[i+1];
				 }
				 n--;
				 index = tmp-1;
			 }
		 }
		 return n;
	 }
	
	public static void main(String [] args){
		RemoveDup2 r = new RemoveDup2();
		int [] A = {1,1,1,2};
		int result = r.removeDuplicates(A);
		System.out.println(result);
	}
}
