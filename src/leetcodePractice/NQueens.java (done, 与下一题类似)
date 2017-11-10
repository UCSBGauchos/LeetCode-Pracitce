package leetcodePractice;

import java.util.ArrayList;

public class NQueens {
	
	public boolean canSet(int [] boardRows, int row, int col){
		for(int i=0; i<boardRows.length; i++){
			if(boardRows[i]==col&&i!=row&&col!=0){
				
				return false;
			}
		}
		if(row-1>=0){
			if(boardRows[row-1]!=0&&(col==boardRows[row-1]-1||col==boardRows[row-1]+1)){
				return false;
			}
		}
		if(row+1<boardRows.length){
			if(boardRows[row+1]!=0&&(col==boardRows[row+1]-1||col==boardRows[row+1]+1)){
				return false;
			}
		}
		return true;
	}
	
	public void help(int [] boardRows, int row, ArrayList<int []> result, int num){
		//System.out.println(row);
		
		if(row == num){
			int [] tmp = new int[num];
			for(int i=0; i<boardRows.length; i++){
				tmp[i] = boardRows[i];
			}
			result.add(tmp);
			return;
		}
		for(int col=1; col<=num; col++){
			//if the row, we can put queen at i col, set the value
			if(canSet(boardRows, row, col)){
				boardRows[row] = col;
				int newRow = row+1;
				help(boardRows, newRow, result, num);
			}
		}
		boardRows[row] = 0;
	}
	
	public ArrayList<String []> solveNQueens(int n) {
		if(n<3){
			return null;
		}
		ArrayList<int []> result = new ArrayList<int []>();
		ArrayList<String []> boardResult = new ArrayList<String []>();
		int [] boardRows = new int [n];
		int row = 0;
		help(boardRows, row, result, n);
		for(int [] array: result){
			String [] board = new String [n];
			for(int i=0; i<n; i++){
				StringBuffer buffer = new StringBuffer();
				for(int j=0; j<n; j++){
					if(j==array[i]-1){
						buffer.append('Q');
					}else{
						buffer.append('.');
					}
				}
				String str = buffer.toString();
				board[i] = str;
			}
			boardResult.add(board);
		}
		
		return boardResult;
	}
	
	public static void main(String [] args){
		NQueens n = new NQueens();
		int num = 1;
		ArrayList<String []> result = n.solveNQueens(num);
		for(String [] strs: result){
			for(String str: strs){
				System.out.println(str);
			}
			System.out.println();
		}
		
		
	}
}
