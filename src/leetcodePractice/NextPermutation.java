package leetcodePractice;

import java.util.ArrayList;

public class NextPermutation {
	public void nextPermutation(int[] num) {
		ArrayList<Integer> allPur = new ArrayList<Integer>();
		for(int i: num){
			allPur.add(i);
		}
		
    }
	
	public static void main(String [] args){
		int [] array = {1,3,2};
		NextPermutation n = new NextPermutation();
		n.nextPermutation(array);
		for(int i: array){
			System.out.print(i);
		}
	}
}
