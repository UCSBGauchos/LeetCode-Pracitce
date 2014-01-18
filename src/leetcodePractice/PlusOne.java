package leetcodePractice;

public class PlusOne {
	
	public int[] plusOne(int[] digits) {
		int [] result = new int[digits.length+1];
		boolean need = true;
		int j = result.length-1;
		for(int i = digits.length-1; i>=0; i--){
			if(need == true){
				int tmp = digits[i]+1;
				int tmpS = tmp%10;
				result[j] = tmpS;
				j--;
				if(tmp>=10){
					need = true;
				}else{
					need = false;
				}
			}else{
				result[j] = digits[i];
				need = false;
				j--;
			}
		}
		if(need == true){
			result[j] = 1;
			int [] trueResult = new int [result.length];
			int index = 0;
			for(int i: result){
				trueResult[index] = i;
				index++;
			}
			return trueResult;
		}else{
			int [] trueResult = new int [digits.length];
			int index = 0;
			for(int i=1; i<result.length; i++){
				trueResult[index] = result[i];
				index++;
			}
			return trueResult;
		}
    }
	
	public static void main(String [] args){
		PlusOne p = new PlusOne();
		int [] digits = {9,8};
		int [] result = p.plusOne(digits);
		for(int i: result){
			System.out.print(i);
		}
	}
}
