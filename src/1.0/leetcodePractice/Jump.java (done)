package leetcodePractice;

public class Jump {
	
	public boolean help(int [] A, int index){
		if(index == A.length-1){
			return true;
		}
		for(int i=1; i<=A[index]; i++){
			if(help(A, index+i)){
				return true;
			}
		}
		return false;
	}
	
	public boolean canJump(int[] A) {
		int index  =0;
		return help(A, index);
	}
	
	public static void main(String [] args){
		Jump j = new Jump();
		int [] A = {3,2,1,0,4};
		System.out.println(j.canJump(A));
	}
}
