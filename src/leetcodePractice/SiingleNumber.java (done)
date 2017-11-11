package leetcodePractice;

public class SiingleNumber {
	
	public int find(int [] array){
		java.util.Arrays.sort(array);
		for(int i = 0; i<array.length-2; i=i+2){
			if(array[i]!=array[i+1]){
				return array[i];
			}
		}
		return array[array.length-1];
	}
	
	public static void main(String [] args){
		SiingleNumber sn = new SiingleNumber();
		int [] array = {2,3,4,1,2,4,1};
		System.out.println(sn.find(array));
		
	}
}
