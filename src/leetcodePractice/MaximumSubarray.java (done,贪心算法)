package leetcodePractice;

public class MaximumSubarray {
	
	public int maxSubArray(int [] A){
		 int sum = 0;  
		 int max = Integer.MIN_VALUE;  
		 for(int i =0; i < A.length ; i ++){  
			 System.out.println("now sum is "+sum);
			 System.out.println("now max is "+max);
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
		int [] A = {99,-98,4,5};
		System.out.println(m.maxSubArray(A));
	}
}
