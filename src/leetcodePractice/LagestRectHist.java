package leetcodePractice;

public class LagestRectHist {
	
	public int get(int [] height, int begin, int end){
		int min = Integer.MAX_VALUE;
		for(int i=begin; i<=end; i++){
			if(height[i]<=min){
				min = height[i];
			}
		}
		return (end-begin+1)*min;
	}
	
	public int largestRectangleArea(int[] height) {
		int begin = 0;
		int end = height.length-1;
		int max = 0;
		while(begin<end){
			int result = get(height, begin, end);
			if(result>max){
				max = result;
			}
			if(height[begin]<=height[end]){
				begin++;
			}else{
				end--;
			}
		}
		return max;
    }
	
	public static void main(String [] args){
		LagestRectHist l = new LagestRectHist();
		int [] rect = {2,1,5,6,2,3};
		System.out.println(l.largestRectangleArea(rect));
	}
}
