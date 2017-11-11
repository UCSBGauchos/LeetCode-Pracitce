package leetcodePractice;

import java.util.ArrayList;

public class PascalTrangle {
	
	public ArrayList<ArrayList<Integer>> generate(int numRows) {
		if(numRows == 0){
			return new ArrayList<ArrayList<Integer>>();
		}
		if(numRows == 1){
			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
			list.add(1);
			result.add(list);
			return result;
		}else if(numRows == 2){
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
			list1.add(1);
			list2.add(1);
			list2.add(1);
			result.add(list1);
			result.add(list2);
			return result;
		}
		ArrayList<ArrayList<Integer>> prev = generate(numRows-1);
		ArrayList<ArrayList<Integer>> cur = new ArrayList<ArrayList<Integer>>();
		cur.addAll(prev);
		int length = prev.size();
		ArrayList<Integer> list = prev.get(length-1);
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int i=0; i<list.size(); i++){
			if(i == 0){
				newList.add(1);
			}else{
				newList.add(list.get(i-1)+list.get(i));
			}
		}
		newList.add(1);
		cur.add(newList);
		return cur;
    }
	
	public static void main(String [] args){
		PascalTrangle p = new PascalTrangle();
		int num = 0;
		ArrayList<ArrayList<Integer>> result = p.generate(num);
		System.out.println(result);
	}
}
