package leetcodePractice;

import java.util.ArrayList;

public class PascalTrangle {
	public ArrayList<Integer> getPT(int number){
		ArrayList<Integer> curList = new ArrayList<Integer>();
//		if(number == 1){
//			ArrayList<Integer> baseCase1 = new ArrayList<Integer>();
//			System.out.println(number);
//			baseCase1.add(1);
//			System.out.print('1');
//			System.out.println();
//		}
		if(number == 2){
			ArrayList<Integer> baseCase2 = new ArrayList<Integer>();
			System.out.println('1');
			baseCase2.add(1);
			baseCase2.add(1);
			System.out.println(1+" "+1);
			return baseCase2;
		}
		if(number>2){
			ArrayList<Integer> preList = getPT(number-1);
			int [] tmpPreArray = new int [number-1];
			int index = 0;
			for(int i: preList){
				tmpPreArray[index] = i;
				index++;
			}
			int [] tmpCurArray = new int [number];
			tmpCurArray[0] = tmpPreArray[0];
			tmpCurArray[number-1] = tmpPreArray[number-2];
			for(int i=1;i<number-1;i++){
				tmpCurArray[i] = tmpPreArray[i-1]+tmpPreArray[i];
			}
			for(int i=0;i<number;i++){
				curList.add(tmpCurArray[i]);
				System.out.print(tmpCurArray[i]+" ");
			}
			System.out.println();
			return curList;
		}
		return curList;
	}
	
	public static void main(String [] args){
		int number = 5;
		PascalTrangle pt = new PascalTrangle();
		pt.getPT(number);
		
	}
}
