package leetcodePractice;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
		boolean [][] visited = new boolean[board.length][board[0].length];
		for(int row = 0; row<board.length; row++){
			for(int col = 0; col<board[0].length; col++){
				visited[row][col] = false;
			}
		}
		for(int row = 0; row<board.length; row++){
			for(int col = 0; col<board[0].length; col++){
				boolean result= traverse(row, col, board, word, visited);
				if(result == true){
					return true;
				}
			}
		}
		return false;
	}
	public boolean traverse(int row, int col, char [][] board, String word, boolean [][] visited){
		if(word.length()==1&&word.charAt(0)==board[row][col]){
			return true;
		}
		String last = word.substring(0,1);
		String remain = word.substring(1);
		boolean left = false;
		boolean right = false;
		boolean up = false;
		boolean down = false;
		visited[row][col] = true;
		if(last.charAt(0)==board[row][col]){
			if(row>=1&&visited[row-1][col]==false){
				up = traverse(row-1, col, board, remain, visited);
			}
			if(row<=board.length-2&&visited[row+1][col]==false){
				down = traverse(row+1, col, board, remain, visited);
			}
			if(col>=1&&visited[row][col-1]==false){
				left = traverse(row, col-1, board, remain, visited);
			}
			if(col<=board[0].length-2&&visited[row][col+1]==false){
				right = traverse(row, col+1, board, remain, visited);
			}
			visited[row][col] = false;
			return (up||down||left||right);
			
		}else{
			visited[row][col] = false;
			return false;
		}
		
	}
	
	public static void main(String [] args){
		WordSearch ws = new WordSearch();
		char [][] boad = {{'a','b'},{'c','d'}};
		String word = "cabd";
		System.out.println(ws.exist(boad, word));
	}
}
