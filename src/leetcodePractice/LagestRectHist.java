package leetcodePractice;

public class LagestRectHist {
	public boolean canBeRect(int i, int j, int [] array){
		int begin = 0;
		int end = 0;
		if(i<=j){
			begin = i;
			end = j;
		}else if(i>j){
			begin = j;
			end = i;
		}
		for(int index = begin; index<=end; index++){
			if(array[index]<array[i]){
				return false;
			}
		}
		return true;
	}
	
	public int largestRectangleArea(int [] array){
		int max = 0;
		for(int i=0; i<array.length; i++){
			int sumLeft = 0;
			int sumRight = 0;
			int sum = 0;
			for(int j=i; j>=0; j--){
				if(canBeRect(i, j, array)){
					sumLeft = array[i]*(Math.abs(i-j)+1);
				}
			}
			for(int j=i+1; j<array.length; j++){
				if(canBeRect(i, j, array)){
					sumRight = array[i]*(Math.abs(i-j));
				}
			}
			sum = sumLeft+sumRight;
			if(sum>max){
				max = sum;
			}
		}
		return max;
	}
	public static void main(String [] args){
		int [] array = {2,1,2};
		LagestRectHist lrh = new LagestRectHist();
		System.out.println(lrh.largestRectangleArea(array));
		
	}
}
