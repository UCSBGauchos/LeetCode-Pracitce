package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class TreeSum {
	
	
	
	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		HashMap<ArrayList<Integer>, Boolean> hash = new HashMap<ArrayList<Integer>, Boolean>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		java.util.Arrays.sort(num);
		for(int index = 0; index<num.length; index++){
			int front=index+1;
			int behind = num.length-1;
			while(front<behind){
				int sum_two = num[index]+num[front];
				if(sum_two+num[behind]<0){
					front++;
				}else if(sum_two+num[behind]>0){
					behind--;
				}else{
					ArrayList<Integer> list = new ArrayList<Integer>();
					list.add(num[index]);
					list.add(num[front]);
					list.add(num[behind]);
					hash.put(list, true);
					front++;
					behind--;
				}
			}
		}
		
		for(ArrayList<Integer> list: hash.keySet()){
			result.add(list);
		}
		
		return result;
    }
	
	public static void main(String [] args){
		int [] array = {-1, 0, 1, 2, -1, -4};
		TreeSum t = new TreeSum();
		ArrayList<ArrayList<Integer>> result = t.threeSum(array);
		for(ArrayList<Integer> list: result){
			for(int num: list){
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
