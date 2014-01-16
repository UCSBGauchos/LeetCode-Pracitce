package leetcodePractice;

public class CreateSpiralMatrix {
	
	public int[][] generateMatrix(int n) {
		int [][] spiralMatrix = new int [n][n];
		int number = 1;
		for(int layer = 0; layer<=n/2; layer++){
			for(int index = layer; index<spiralMatrix[0].length-layer; index++){
				spiralMatrix[layer][index] = number;
				number++;
			}
			for(int index = layer+1; index<spiralMatrix.length-layer; index++){
				spiralMatrix[index][spiralMatrix[0].length-layer-1] = number;
				number++;
			}
			for(int index = spiralMatrix[0].length-1-layer-1; index>=layer; index--){
				spiralMatrix[spiralMatrix.length-layer-1][index] = number;
				number++;
			}
			for(int index = spiralMatrix.length-1-layer-1; index>=layer+1; index--){
				spiralMatrix[index][layer] = number;
				number++;
			}
		}
		return spiralMatrix;
    }	
	
	public static void main(String [] args){
		int n = 0;
		CreateSpiralMatrix c = new CreateSpiralMatrix();
		int [][] spiralMatrix = c.generateMatrix(n);
		for(int i = 0; i< spiralMatrix.length; i++){
			for(int j = 0; j<spiralMatrix[0].length; j++){
				System.out.print(spiralMatrix[i][j]);
			}
			System.out.println();
		}
	}
}
