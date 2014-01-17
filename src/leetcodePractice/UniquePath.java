package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class UniquePath {
	
	public int help(int m ,int n, HashMap<ArrayList<Integer>, Integer> cache){
		if(m==0&&n==0){
			return 1;
		}else if(m<0 || n<0){
			return 0;
		}
		ArrayList<Integer> rightPoint = new ArrayList<Integer>();
		ArrayList<Integer> downPoint = new ArrayList<Integer>();
		rightPoint.add(m);
		rightPoint.add(n-1);
		downPoint.add(m-1);
		downPoint.add(n);
		int goRight = 0;
		int goDown = 0;
		if(cache.containsKey(rightPoint)){
			goRight = cache.get(rightPoint);
		}else{
			goRight = help(m, n-1, cache);
		}
		if(cache.containsKey(downPoint)){
			goDown = cache.get(downPoint);
		}else{
			goDown = help(m-1, n, cache);
		}
		return goRight+goDown;
	}
	
	public int uniquePaths(int m, int n) {
		int startX = m-1;
		int startY = n-1;
		HashMap<ArrayList<Integer>, Integer> cache = new HashMap<ArrayList<Integer>, Integer>();
		return help(startX, startY, cache);
    }
	
	public static void main(String [] args){
		int m = 7;
		int n = 3;
		UniquePath u = new UniquePath();
		System.out.println(u.uniquePaths(m, n));
	}
}
