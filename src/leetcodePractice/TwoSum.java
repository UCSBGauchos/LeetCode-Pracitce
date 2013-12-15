package leetcodePractice;

public class TwoSum {
	
	 public int[] twoSum(int[] numbers, int target){
		 int [] result = new int[2];
		 for(int i=0; i<numbers.length; i++){
			 for(int j=0; j<numbers.length; j++){
				 if(j!=i){
					 int twoSum = numbers[i]+numbers[j];
					 if(twoSum==target){
						 result[0] = i+1;
						 result[1] = j+1;
						 return result;
					 }
				 }
			 }
		 }
		 return result;
	 }
	 public static void main(String [] args){
		int [] number = {5,75,25};
	    int target = 100;
	    TwoSum s = new TwoSum();
	    int [] result = s.twoSum(number, target);
	    for(int i=0; i<result.length; i++){
	    	System.out.print(result[i]);
	    }
	 }
}

