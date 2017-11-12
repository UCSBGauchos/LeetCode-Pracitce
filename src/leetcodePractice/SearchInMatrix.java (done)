package leetcodePractice;

public class SearchInMatrix {
	
	public boolean searchMatrix(int [][] matrix, int target){
		int row = matrix.length;
		int col = matrix[0].length;
		int endRow = 0;
		int endCol = 0;
		for(int i=0; i<row; i++){
			if(matrix[i][col-1]>=target){
				endRow = i;
				break;
			}
		}
		for(int j=col-1; j>=0; j--){
			if(matrix[0][j]<=target){
				endCol = j;
				break;
			}
		}
		for(int i=0; i<=endRow; i++){
			for(int j=0; j<=endCol; j++){
				if(matrix[i][j]==target){
					return true;
				}
			}
			System.out.println();
		}
		return false;
	}
	
	public static void main(String [] args){
		SearchInMatrix sim = new SearchInMatrix();
		int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		System.out.println(sim.searchMatrix(matrix, 3));
		
	}
}
