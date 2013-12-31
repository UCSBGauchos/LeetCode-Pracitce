package leetcodePractice;

public class SearchForARange {
	
	public int getLeft(int [] A, int target){
		int begin = 0;
		int end = A.length-1;
		
		while(begin<end){
			int mid = (begin+end)/2;
			if(A[mid] >= target){
				end = mid-1;
			}else{
				begin = mid+1;
			}
		}
		if(end>=0&&A[end] == target){
			return end;
		}else if(end+1<A.length&&A[end+1] == target){
			return end+1;
		}else{
			return -1;
		}
	}
	
	public int getRight(int [] A, int target){
		
		int begin = 0;
		int end = A.length-1;
		
		while(begin<end){
			int mid = (begin+end)/2;
			if(A[mid] <= target){
				begin = mid+1;
			}else{
				end = mid-1;
			}
		}
		if(begin<A.length&&A[begin]==target){
			return begin;
		}else if(begin-1>=0&&A[begin-1] == target){
			return begin-1;
		}else{
			return -1;
		}
		
	}
	
	
	
	public int[] searchRange(int[] A, int target) {
		int [] result = new int[2];
		int left = getLeft(A, target);
		int right = getRight(A, target);
		
		result[0] = left;
		result[1] = right;
		
		return result;
		
    }
	
	public static void main(String [] args){
		
		SearchForARange s = new SearchForARange();
		
		int [] array = {2, 2};
		int target = 2;
		
		int [] result = s.searchRange(array, target);
		
		for(int i: result){
			System.out.print(i);
		}
		
		
		
	}
	
}
