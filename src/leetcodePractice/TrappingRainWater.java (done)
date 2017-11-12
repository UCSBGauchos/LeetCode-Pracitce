package leetcodePractice;

import java.util.ArrayList;

public class TrappingRainWater {
	
	public void helper(int [] A, int max, int base, ArrayList<Integer> levelArea){
		if(base == max){
			return;
		}
		int area = 0;
		for(int i=0; i<A.length; i++){
			int width = 0;
			int tmp = i+1;
			if(i+1<A.length&&A[i]>base&&A[i+1]==base){
				while(tmp<A.length&&A[tmp]==base){
					A[tmp]++;
					width++;
					tmp++;
				}
				if(tmp!=A.length){
					area = area+1*width;
					width= 0;
				}else{
					width = 0;
				}
			}
			i = tmp-1;
		}
		levelArea.add(area);
		helper(A, max, base+1, levelArea);
	}
	
	public int trap(int[] A) {
		int max = 0;
		for(int i:A){
			if(i>=max){
				max = i;
			}
		}
		int base = 0;
		int area = 0;
		ArrayList<Integer> levelList = new ArrayList<Integer>();
		helper(A, max, base, levelList);
		for(int i: levelList){
			area+=i;
		}
		return area;
    }
	
	public static void main(String [] args){
		TrappingRainWater t = new TrappingRainWater();
		int [] array = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(t.trap(array));
	}
	
}
