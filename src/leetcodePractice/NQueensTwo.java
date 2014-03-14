package leetcodePractice;

import java.util.ArrayList;

public class NQueensTwo {
	public boolean canSet(int [] boardRows, int row, int col){
		for(int i=0; i<boardRows.length; i++){
			if(boardRows[i]==col&&i!=row&&col!=0){
				
				return false;
			}
		}
		int tmp = row;
		while(row-1>=0){
			if(boardRows[row-1]!=0&&(col==boardRows[row-1]-(tmp-(row-1))||col==boardRows[row-1]+(tmp-(row-1)))){
				return false;
			}
			row = row-1;
		}
		while(row+1<boardRows.length){
			if(boardRows[row+1]!=0&&(col==boardRows[row+1]-(row+1-tmp)||col==boardRows[row+1]+(row+1-tmp))){
				return false;
			}
			row=row+1;
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
	
	public int totalNQueens(int n) {
		if(n==1){
			return 1;
		}
		if(n<3){
			return 0;
		}
		ArrayList<int []> result = new ArrayList<int []>();
		int [] boardRows = new int [n];
		int row = 0;
		help(boardRows, row, result, n);
		for(int [] array: result){
			for(int i: array){
				System.out.print(i);
			}
			System.out.println();
		}
		
		return result.size();
	}
	public static void main(String [] args){
		NQueensTwo n = new NQueensTwo();
		System.out.println(n.totalNQueens(4));
	}
}
