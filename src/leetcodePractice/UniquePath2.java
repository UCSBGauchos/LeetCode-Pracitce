package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class UniquePath2 {
	
	public int help(int m, int n, int [][] obstacleGrid, HashMap<ArrayList<Integer>, Integer> cache){
		if(m==obstacleGrid.length-1 && n == obstacleGrid[0].length-1&&obstacleGrid[m][n] != 1){
			return 1;
		}else if(m>obstacleGrid.length-1 || n>obstacleGrid[0].length-1){
			return 0;
		}
		if(obstacleGrid[m][n] == 1){
			return 0;
		}
		ArrayList<Integer> rightPoint = new ArrayList<Integer>();
		ArrayList<Integer> downPoint = new ArrayList<Integer>();
		rightPoint.add(m);
		rightPoint.add(n+1);
		downPoint.add(m+1);
		downPoint.add(n);
		int goRight = 0;
		int goDown = 0;
		if(cache.containsKey(rightPoint)){
			goRight = cache.get(rightPoint);
		}else{
			goRight = help(m, n+1, obstacleGrid, cache);
			cache.put(rightPoint, goRight);
		}
		if(cache.containsKey(downPoint)){
			goDown = cache.get(downPoint);
		}else{
			goDown = help(m+1, n, obstacleGrid, cache);
			cache.put(downPoint, goDown);
		}
		return goRight+goDown;
	}
	
	public int uniquePathsWithObstacles(int [][] obstacleGrid) {
		int startX = 0;
		int startY = 0;
		HashMap<ArrayList<Integer>, Integer> cache = new HashMap<ArrayList<Integer>, Integer>();
		return help(startX, startY, obstacleGrid, cache);
    }
	
	public static void main(String [] args){
		int [][] obstacleGrid = {{0,0,0}, {0,1,0}, {0,0,0}};
		UniquePath2 u = new UniquePath2();
		int result = u.uniquePathsWithObstacles(obstacleGrid);
		System.out.println(result);
	}
}
