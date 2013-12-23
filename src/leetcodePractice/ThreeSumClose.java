package leetcodePractice;

public class ThreeSumClose {
	
	public int threeSumClosest(int[] num, int target) {
		int min = Integer.MAX_VALUE;
		int result = 0;
		for(int index1 = 0; index1<num.length; index1++){
			for(int index2 = index1+1; index2<num.length; index2++){
				for(int index3 = index2+1; index3<num.length; index3++){
					if(Math.abs(num[index1]+num[index2]+num[index3]-target)<=min){
						min = Math.abs(num[index1]+num[index2]+num[index3]-target);
						result = num[index1]+num[index2]+num[index3];
					}
				}
			}
		}
		return result;
    }
	
	public static void main(String [] args){
		int [] array = {0,2,1,-3};
		int target = 1;
		ThreeSumClose t = new ThreeSumClose();
		System.out.println(t.threeSumClosest(array, target));
	}
}
