package leetcodePractice;

import java.util.ArrayList;

public class SpiralMatrix {
	
	public ArrayList<Integer> spiralOrder(int[][] matrix) {
		if(matrix.length == 0){
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(matrix.length==1){
			for(int number: matrix[0]){
				result.add(number);
			}
			return result;
		}else if(matrix[0].length==1){
			for(int index = 0; index<matrix.length; index++){
				result.add(matrix[index][0]);
			}
			return result;
		}
		for(int layer = 0; layer<=Math.min(matrix.length, matrix[0].length)/2; layer++){
			for(int index = layer; index<matrix[0].length-layer; index++){
				if(result.size()<matrix.length*matrix[0].length){
					result.add(matrix[layer][index]);
				}
			}
			for(int index = layer+1; index<matrix.length-layer; index++){
				if(result.size()<matrix.length*matrix[0].length){
					result.add(matrix[index][matrix[0].length-layer-1]);
				}
			}
			for(int index = matrix[0].length-1-layer-1; index>=layer; index--){
				if(result.size()<matrix.length*matrix[0].length){
					result.add(matrix[matrix.length-layer-1][index]);
				}
			}
			for(int index = matrix.length-1-layer-1; index>=layer+1; index--){
				if(result.size()<matrix.length*matrix[0].length){
					result.add(matrix[index][layer]);
				}
			}
		}
		return result;
    }
	
	public static void main(String [] args){
		SpiralMatrix s = new SpiralMatrix();
		int [][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		ArrayList<Integer> result = s.spiralOrder(matrix);
		for(int i: result){
			System.out.println(i);
		}
	}
}
