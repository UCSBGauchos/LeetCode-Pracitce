package leetcodePractice;

import java.util.ArrayList;

public class Pascaltrangle2 {
	public ArrayList<Integer> getRow(int rowIndex) {
		if(rowIndex == 0){
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(1);
			return list;
		}else if(rowIndex == 1){
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(1);
			return list;
		}
		ArrayList<Integer> prev = getRow(rowIndex-1);
		ArrayList<Integer> cur = new ArrayList<Integer>();
		for(int i=0; i<prev.size(); i++){
			if(i == 0){
				cur.add(1);
			}else{
				cur.add(prev.get(i-1)+prev.get(i));
			}
		}
		cur.add(1);
		return cur;
    }
	
	public static void main(String [] args){
		Pascaltrangle2 p = new Pascaltrangle2();
		System.out.println(p.getRow(3));
	}
}
