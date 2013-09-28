package leetcodePractice;

import java.util.ArrayList;

public class GrayCode {
	
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	public void createGrayCode(ArrayList<Integer> list, int index, int number){
		if(index == number){
			return;
		}
		for(int i=0;i<list.size(); i++){
			if(!result.contains(list)){
				ArrayList<Integer> newList = new ArrayList<Integer>();
				newList.addAll(list);
				result.add(newList);
				index++;
			}
			if(list.get(i)==0){
				list.set(i, 1);
				if(!result.contains(list)){
					createGrayCode(list, index, number);
				}else{
					list.set(i, 0);
				}
			}
			if(list.get(i)==1){
				list.set(i, 0);
				if(!result.contains(list)){
					createGrayCode(list, index, number);
				}else{
					list.set(i, 1);
				}
			}
		}
	}
	
	
	public static void main(String [] args){
		int number = 2;
		int allGrayNumber = (int)Math.pow(2, number);
		ArrayList<Integer> Begin = new ArrayList<Integer>();
		for(int index = 0; index< number; index++){
			Begin.add(0);
		}
		GrayCode gc = new GrayCode();
		gc.createGrayCode(Begin, 0, allGrayNumber);
		System.out.println(gc.result);
	}
}
