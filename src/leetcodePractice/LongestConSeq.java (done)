package leetcodePractice;

public class LongestConSeq {
	
	public int longestConsecutive(int[] num) {
		int max = 1;
		int count = 1;
		java.util.Arrays.sort(num);
		for(int i=0; i<num.length-1; i++){
			if(num[i+1]-num[i]==1){
				count++;
				if(count>=max){
					max = count;
				}
			}else if(num[i+1]-num[i]>=2){
				count = 1;
			}
		}
		return max;
    }
	
	public static void main(String [] args){
		LongestConSeq l = new LongestConSeq();
		int [] array = {1,2,0,1};
		System.out.println(l.longestConsecutive(array));
	}
}
