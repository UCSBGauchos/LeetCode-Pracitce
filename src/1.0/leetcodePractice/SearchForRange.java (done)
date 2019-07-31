package leetcodePractice;

public class SearchForRange {
	
	public int getLeft(int [] array, int target){
		int begin = 0;
		int end = array.length-1;
		
		while(begin<end){
			int middle = (begin+end)/2;
			//if middle >= target, modify end, else if middle < target, modify start
			if(array[middle] >= target){
				end = middle-1;
			}else if(array[middle] < target){
				begin = middle+1;
			}
		}
		return begin;
	}
	
	public int getRight(int [] array, int target){
		int begin = 0;
		int end = array.length-1;
		
		while(begin<end){
			int middle = (begin+end)/2;
			if(array[middle]>target){
				end = middle-1;
			}else if(array[middle]<=target){
				begin = middle+1;
			}
		}
		return begin;
	}
	
	public static void main(String [] args){
		SearchForRange s = new SearchForRange();
		int [] array = {1,2,4,6,7};
		System.out.println("Left is "+s.getLeft(array, 8));
		System.out.println("Right is "+s.getRight(array, 8));
	}
}
