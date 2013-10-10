package leetcodePractice;

import java.util.ArrayList;

public class removeDuparray {
	public int removeDuplicates(int[] A) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
		if(A.length==0){
			return 0;
		}
		int length = A.length;
		ArrayList<Integer> cache = new ArrayList<Integer>();
		cache.add(A[0]);
		for(int i=1; i<length; i++){
			int tmp = i;
			while(tmp<length&&cache.contains(A[tmp])){
				for(int j=tmp; j<length-1; j++){
					A[j] = A[j+1];
				}
				length--;
			}
			cache.add(A[tmp]);
			i = tmp;
		}
		return length;
    }
	
	public static void main(String [] args){
		int [] array = {1,1,2,2};
		removeDuparray rd = new removeDuparray();
		System.out.println(rd.removeDuplicates(array));
	}
}
