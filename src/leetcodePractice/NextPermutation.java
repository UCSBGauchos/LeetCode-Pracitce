package leetcodePractice;

public class NextPermutation {
	public void nextPermutation(int[] num) {
		int i=0;
	
        for(i=num.length-1; i>=1; i--){
        	
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
