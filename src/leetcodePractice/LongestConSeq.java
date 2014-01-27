package leetcodePractice;

public class LongestConSeq {
	public void mergeSort(int [] array, int start, int end){
		if(start<end){
			int mid = (start+end)/2;
			mergeSort(array, start, mid);
			mergeSort(array, mid+1, end);
			merge(array, start, mid, end);
		}
	}
	public void merge(int [] array, int start, int mid, int end){
		int left = start;
		int right = mid+1;
		int [] helper = new int[array.length];
		int tmpIndex = 0;
		int index= start;
		for(int i: array){
			helper[tmpIndex] = i;
			tmpIndex++;
		}
		while(left<=mid&&right<=end){
			if(helper[left]<=helper[right]){
				array[index] = helper[left];
				left++;
			}else{
				array[index] = helper[right];
				right++;
			}
			index++;
		}
		int remain = mid - left;
		if(remain>=0){
			while(left<=mid){
				array[index] = helper[left];
				left++;
				index++;
			}
		}
	}
	
	public int longestConsecutive(int [] array){
		mergeSort(array, 0,array.length-1);
		int [] helper = new int[array.length-1];
		for(int i=1;i<array.length;i++){
			helper[i-1] = array[i]-array[i-1];
		}
		int longest = 0;
		int number = 0;
		for(int i:helper){
			if(i==1){
				number++;
			}else{
				if(number>longest){
					longest = number;
				}
				number=0;
			}
		}
		return longest+1;
	}
	
	public static void main(String [] args){
		int [] array = {100, 101,102, 103, 104,4, 200, 1, 3, 2};
		LongestConSeq lcs = new LongestConSeq();
		System.out.println("lcs is "+lcs.longestConsecutive(array));
	}
}
