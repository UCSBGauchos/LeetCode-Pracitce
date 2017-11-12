package leetcodePractice;

public class ValidSudoku {
	
	public boolean isValidSudoku(char[][] board) {
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[0].length; j++){
				for(int col=0; col<board[0].length; col++){
					if(col!=j&&board[i][j]!='.'&&board[i][j]==board[i][col]){
						return false;
					}
				}
				for(int row=0; row<board.length; row++){
					if(row!=i&&board[i][j]!='.'&&board[i][j]==board[row][j]){
						return false;
					}
				}
				int rowSection = i/3;
				int colSection = j/3;
				
				if(i!=0+rowSection*3&&j!=0+colSection*3&&board[i][j]!='.'&&board[0+rowSection*3][0+colSection*3] == board[i][j]){
					return false;
				}
				if(i!=0+rowSection*3&&j!=1+colSection*3&&board[i][j]!='.'&&board[0+rowSection*3][1+colSection*3] == board[i][j]){
					return false;
				}
				if(i!=0+rowSection*3&&j!=2+colSection*3&&board[i][j]!='.'&&board[0+rowSection*3][2+colSection*3] == board[i][j]){
					return false;
				}
				if(i!=1+rowSection*3&&j!=0+colSection*3&&board[i][j]!='.'&&board[1+rowSection*3][0+colSection*3] == board[i][j]){
					return false;
				}
				if(i!=1+rowSection*3&&j!=1+colSection*3&&board[i][j]!='.'&&board[1+rowSection*3][1+colSection*3] == board[i][j]){
					return false;
				}
				if(i!=1+rowSection*3&&j!=2+colSection*3&&board[i][j]!='.'&&board[1+rowSection*3][2+colSection*3] == board[i][j]){
					return false;
				}
				if(i!=2+rowSection*3&&j!=0+colSection*3&&board[i][j]!='.'&&board[2+rowSection*3][0+colSection*3] == board[i][j]){
					return false;
				}
				if(i!=2+rowSection*3&&j!=1+colSection*3&&board[i][j]!='.'&&board[2+rowSection*3][1+colSection*3] == board[i][j]){
					return false;
				}
				if(i!=2+rowSection*3&&j!=2+colSection*3&&board[i][j]!='.'&&board[2+rowSection*3][2+colSection*3] == board[i][j]){
					return false;
				}
			}
		}
		return true;
    }
	
	public static void main(String [] args){
		
		ValidSudoku v = new ValidSudoku();
		
		char [][] board = new char[3][3];
		board[0][0] = '5';
		board[0][1] = '3';
		board[0][2] = '.';
		board[1][0] = '6';
		board[1][1] = '.';
		board[1][2] = '.';
		board[2][0] = '.';
		board[2][1] = '9';
		board[2][2] = '8';
		
		System.out.println(v.isValidSudoku(board));
		
		
	}
}
