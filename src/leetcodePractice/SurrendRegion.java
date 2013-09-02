package leetcodePractice;

public class SurrendRegion {
	public boolean flip(BoardPoint [][] board, int row, int col){
		//basecase
		if(row<0||col<0||row>=board.length||col>=board[0].length){
			return false;
		}
		
		if(board[row][col].value=='o'){
			if(board[row][col].visited==false){
				board[row][col].visited=true;
				if(flip(board,row,col+1)&&flip(board,row,col-1)&&flip(board,row-1,col)&&flip(board,row+1,col)){
					board[row][col].value='x';
				}
				flip(board, row-1, col);
				flip(board, row+1, col);
				flip(board, row, col-1);
				flip(board, row, col+1);
			}
		}
		if(board[row][col].value=='x'){
			if(board[row][col].visited==false){
				board[row][col].visited=true;
				flip(board, row-1, col);
				flip(board, row+1, col);
				flip(board, row, col-1);
				flip(board, row, col+1);
			}
			return true;
		}
		return true;
	}
	public static void main(String [] args){
		BoardPoint [][] board = new BoardPoint[4][4];
		char x = 'x';
		char o = 'o';
		board[0][0] = new BoardPoint(0,0,x);
		board[0][1] = new BoardPoint(0,1,x);
		board[0][2] = new BoardPoint(0,2,x);
		board[0][3] = new BoardPoint(0,3,x);
		
		board[1][0] = new BoardPoint(1,0,x);
		board[1][1] = new BoardPoint(1,1,o);
		board[1][2] = new BoardPoint(1,2,o);
		board[1][3] = new BoardPoint(1,3,x);
		
		board[2][0] = new BoardPoint(2,0,x);
		board[2][1] = new BoardPoint(2,1,x);
		board[2][2] = new BoardPoint(2,2,o);
		board[2][3] = new BoardPoint(2,3,x);
		
		board[3][0] = new BoardPoint(3,0,x);
		board[3][1] = new BoardPoint(3,1,o);
		board[3][2] = new BoardPoint(3,2,x);
		board[3][3] = new BoardPoint(3,3,x);
		
		SurrendRegion surr = new SurrendRegion();
		surr.flip(board, 0, 0);
		
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				System.out.print(board[i][j].value+" ");
			}
			System.out.println();
		}
	}
}
