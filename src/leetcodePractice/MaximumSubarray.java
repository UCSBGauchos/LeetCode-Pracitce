package leetcodePractice;

public class MaximumSubarray {
	
	public int maxSubArray(int [] A){
		 int sum = 0;  
		 int max = Integer.MIN_VALUE;  
		 for(int i =0; i < A.length ; i ++){  
			 sum +=A[i];        
			 if(sum>max){
				 max = sum;  
			 }
			 if(sum < 0){
				 sum = 0; 
			 }  
		 }
		 return max;  
	}
	
	public static void main(String [] args){
		MaximumSubarray m = new MaximumSubarray();
		int [] A = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(m.maxSubArray(A));
	}
}
