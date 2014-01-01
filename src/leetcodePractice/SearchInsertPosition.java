package leetcodePractice;

public class SearchInsertPosition {
	
	 public int searchInsert(int[] A, int target) {
		 int start = 0;
		 int end = A.length-1;
		 
		 while(start<end){
			 int mid = (start+end)/2;
			 if(A[mid] == target){
				 return mid;
			 }else if(A[mid]<target){
				 start = mid+1;
			 }else if(A[mid]>target){
				 end = mid-1;
			 }
		 }
		 if(target>A[start]){
			 return start+1;
		 }else{
			 return start;
		 }
	 }
	
	public static void main(String [] args){
		int [] array = {1,3,5,6};
		int target = 0;
		SearchInsertPosition s = new SearchInsertPosition();
		
		int result = s.searchInsert(array, target);
		System.out.println(result);
	}
}
