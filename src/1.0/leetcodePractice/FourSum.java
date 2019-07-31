package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class FourSum {
	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		HashMap<ArrayList<Integer>, Boolean> hash = new HashMap<ArrayList<Integer>, Boolean>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		java.util.Arrays.sort(num);
		for(int index1 = 0; index1<num.length; index1++){
			for(int index2 = index1+1; index2<num.length; index2++){
				int front=index2+1;
				int behind = num.length-1;
				while(front<behind){
					int sum_three = num[index1]+num[index2]+num[front];
					if(sum_three+num[behind]<target){
						front++;
					}else if(sum_three+num[behind]>target){
						behind--;
					}else{
						ArrayList<Integer> list = new ArrayList<Integer>();
						list.add(num[index1]);
						list.add(num[index2]);
						list.add(num[front]);
						list.add(num[behind]);
						hash.put(list, true);
						front++;
						behind--;
					}
				}
			}
		}
		
		for(ArrayList<Integer> list: hash.keySet()){
			result.add(list);
		}
		
		return result;
    }
	
	public static void main(String [] args){
		int [] array = {1, 0, -1, 0, -2, 2};
		FourSum t = new FourSum();
		ArrayList<ArrayList<Integer>> result = t.fourSum(array, 0);
		for(ArrayList<Integer> list: result){
			for(int num: list){
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
