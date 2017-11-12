package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class SurrendedRegion {
	
	public boolean help(char [][] board, int row, int col, ArrayList<ArrayList<Integer>> hasVisited, HashMap<ArrayList<Integer>, Boolean> cache){
		boolean top = false;
		boolean left = false;
		boolean right = false;
		boolean down = false;
		if(row-1>=0){
			ArrayList<Integer> newPosition = new ArrayList<Integer>();
			newPosition.add(row-1);
			newPosition.add(col);
			if(!hasVisited.contains(newPosition)){
				if(!cache.containsKey(newPosition)){
					hasVisited.add(newPosition);
					top = help(board, row-1, col, hasVisited, cache);
					cache.put(newPosition, top);
					hasVisited.remove(newPosition);
				}else{
					top = cache.get(newPosition);
				}
			}else{
				top =  true;
			}
		}
		if(row+1<board.length){
			ArrayList<Integer> newPosition = new ArrayList<Integer>();
			newPosition.add(row+1);
			newPosition.add(col);
			if(!hasVisited.contains(newPosition)){
				if(!cache.containsKey(newPosition)){
					hasVisited.add(newPosition);
					down = help(board, row+1, col, hasVisited, cache);
					cache.put(newPosition, down);
					hasVisited.remove(newPosition);
				}else{
					down = cache.get(newPosition);
				}
			}else{
				down = true;
			}
		}
		if(col-1>=0){
			ArrayList<Integer> newPosition = new ArrayList<Integer>();
			newPosition.add(row);
			newPosition.add(col-1);
			if(!hasVisited.contains(newPosition)){
				if(!cache.containsKey(newPosition)){
					hasVisited.add(newPosition);
					left = help(board, row, col-1, hasVisited, cache);
					cache.put(newPosition, left);
					hasVisited.remove(newPosition);
				}else{
					left = cache.get(newPosition);
				}
			}else{
				left = true;
			}
		}
		if(col+1<board[0].length){
			ArrayList<Integer> newPosition = new ArrayList<Integer>();
			newPosition.add(row);
			newPosition.add(col+1);
			if(!hasVisited.contains(newPosition)){
				if(!cache.containsKey(newPosition)){
					hasVisited.add(newPosition);
					right = help(board, row, col+1, hasVisited, cache);
					cache.put(newPosition, right);
					hasVisited.remove(newPosition);
				}else{
					right = cache.get(newPosition);
				}
			}else{
				right =  true;
			}
		}
		if(top&&down&&left&&right&&board[row][col]=='O'){
			board[row][col] = 'X';
			return true;
		}else if(board[row][col]=='X'){
			return true;
		}
		return false;
	}
	
	public void solve(char[][] board) {
		if(board.length==0){
			return ;
		}
		ArrayList<ArrayList<Integer>> hasVisited = new ArrayList<ArrayList<Integer>>();
		HashMap<ArrayList<Integer>, Boolean> DPCache = new HashMap<ArrayList<Integer>, Boolean>();
		help(board, 0, 0, hasVisited, DPCache);
    }
	
	public static void main(String [] args){
		SurrendedRegion s = new SurrendedRegion();
		char [][] board = {{'X', 'O', 'X', 'O', 'X', 'O'}, {'O', 'X', 'O', 'X', 'O', 'X'}, {'X', 'O', 'X', 'O', 'X', 'O'}, {'O', 'X', 'O', 'X', 'O', 'X'}};
		s.solve(board);
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[0].length; j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
}
