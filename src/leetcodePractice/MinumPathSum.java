package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class MinumPathSum {
	
	public int help(int [][] grid, int m, int n, HashMap<ArrayList<Integer>, Integer> cache){
		if(m == grid.length-1 && n == grid[0].length-1){
			return grid[m][n];
		}else if(m>grid.length-1 || n>grid[0].length-1){
			return -1;
		}
		int goRight = 0;
		int goDown = 0;
		int curRight = 0;
		int curDown = 0;
		//this part for the DP
		ArrayList<Integer> rightPoint = new ArrayList<Integer>();
		ArrayList<Integer> downPoint = new ArrayList<Integer>();
		rightPoint.add(m);
		rightPoint.add(n+1);
		downPoint.add(m+1);
		downPoint.add(n);
		if(cache.containsKey(downPoint)){
			goDown = cache.get(downPoint);
		}else{
			goDown = help(grid, m+1, n, cache);
		}
		if(cache.containsKey(rightPoint)){
			goRight = cache.get(rightPoint);
		}else{
			goRight = help(grid, m, n+1, cache);
			cache.put(rightPoint, goRight);
		}
		if(goDown == -1){
			curDown = -1;
		}else{
			curDown = grid[m][n]+goDown;
			cache.put(downPoint, goDown);
		}
		
		if(goRight == -1){
			curRight = -1;
		}else{
			curRight = grid[m][n]+goRight;
		}
		if(curRight>0&&curDown<0){
			return curRight;
		}else if(curRight<0&&curDown>0){
			return curDown;
		}else if(curRight>0&&curDown>0){
			return Math.min(curRight, curDown);
		}else{
			return 0;
		}
	}
	
	public int minPathSum(int[][] grid) {
		HashMap<ArrayList<Integer>, Integer> cache= new HashMap<ArrayList<Integer>, Integer>();
		int startX = 0;
		int startY = 0;
		int result = help(grid, startX, startY, cache);
		return result;
    }
	
	public static void main(String [] args){
		MinumPathSum m = new MinumPathSum();
		int [][] grid = {{1,2,3}, {4,5,6}, {7,8,9}};
		int result = m.minPathSum(grid);
		System.out.println(result);
	}
}
