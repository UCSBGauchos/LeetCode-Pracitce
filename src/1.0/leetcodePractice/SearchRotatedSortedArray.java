package leetcodePractice;

public class SearchRotatedSortedArray {
	
	public int BinarySearch(int [] A, int begin, int end, int target){
		//System.out.println("The one to be searched is "+target);
		
		if(begin>end){
			return -1;
		}
		int mid = (begin+end)/2;
		if(A[mid] == target){
			return mid;
		}
		if(target<A[mid]){
			return BinarySearch(A, begin, mid-1, target);
		}else if(target>A[mid]){
			return BinarySearch(A, mid+1, end, target);
		}
		return -1;
	}
	
	public int search(int[] A, int target) {
		int mid = (A.length-1)/2;
		//right is in order
		//else left is in order
		if(A[mid]<=A[A.length-1]){
			if(target>=A[mid]&&target<=A[A.length-1]){
				return BinarySearch(A, mid, A.length-1, target);
			}else{
				for(int index = 0; index<mid; index++){
					if(target == A[index]){
						return index;
					}
				}
				return -1;
			}
		}else if(A[0]<=A[mid]){
			if(target>=A[0]&&target<=A[mid]){
				return BinarySearch(A, 0, mid, target);
			}else{
				for(int index = mid+1; index<A.length; index++){
					if(target == A[index]){
						return index;
					}
				}
				return -1;
			}
		}
		return -1;
    }
	public static void main(String [] args){
		int [] array = {1,3,0};
		SearchRotatedSortedArray sr = new SearchRotatedSortedArray();
		System.out.println(sr.search(array,0));
		
	}
}
