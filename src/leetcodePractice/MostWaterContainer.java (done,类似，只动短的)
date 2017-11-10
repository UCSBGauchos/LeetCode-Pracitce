package leetcodePractice;

public class MostWaterContainer {
	
	public int getArea(int x1, int x2, int y1, int y2){
		if(y1>=y2){
			return Math.abs(x1-x2)*y2;
		}else{
			return Math.abs(x1-x2)*y1;
		}
	}
	
	
	
	public int maxArea(int[] height) {
		int front = 0;
		int behind = height.length - 1;
		int maxArea = 0;
		while(front<behind){
			int curMaxArea = getArea(front, behind, height[front], height[behind]);
			if(curMaxArea>maxArea){
				maxArea = curMaxArea;
			}
			if(height[front]>=height[behind]){
				behind--;
			}else{
				front++;
			}
		}
        return maxArea;
    }
	
	public static void main(String [] args){
		int [] height = {5,6,4};
		MostWaterContainer m = new MostWaterContainer();
		System.out.println(m.maxArea(height));
	}
}
