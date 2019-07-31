package leetcodePractice;

import java.awt.List;
import java.util.ArrayList;

public class Trangle {
	
	public int getMin(ArrayList<Integer> list){
		int min = Integer.MAX_VALUE;
		for(int i: list){
			if(i<=min){
				min = i;
			}
		}
		return min;
	}
	
	public int minimumTotal(ArrayList<ArrayList<Integer>> trangle) {
		if(trangle.size() == 1){
			return getMin(trangle.get(0));
		}
		ArrayList<Integer> first = trangle.get(0);
		trangle.remove(first);
		return getMin(first)+minimumTotal(trangle);
	}
	
	public static void main(String [] args){
		Trangle t = new Trangle();
		ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list1.add(2);
		list2.add(3);
		list2.add(4);
		list3.add(6);
		list3.add(5);
		list3.add(7);
		list4.add(4);
		list4.add(1);
		list4.add(8);
		list4.add(4);
		triangle.add(list1);
		triangle.add(list2);
		triangle.add(list3);
		triangle.add(list4);
		System.out.println(t.minimumTotal(triangle));
	}
}
