package leetcodePractice;

import java.util.ArrayList;
import java.util.Stack;

public class PalindromePartition {
	   public boolean isOven(int length){
			if(length%2 == 0){
				return true;
			}else{
				return false;
			}
		}
		public boolean isPali(String str){
			if(str == ""){
				return true;
			}
			int mid = str.length()/2;
			int after = 0;
			char [] charArray = str.toCharArray();
			Stack<Character> stack = new Stack<Character>();
			for(int index = 0; index < mid; index++){
				stack.push(charArray[index]);
			}
			if(isOven(str.length())){
				after = mid;
			}else{
				after = mid+1;
			}
			for(int index = after; index<str.length(); index++){
				if(stack.pop()!=charArray[index]){
					return false;
				}
			}
			return true;
		}
		
		public void getSubString(String str){
			for(int i=1;i<str.length();i++){
				String front = str.substring(0,i);
				String behind = str.substring(i);
				//System.out.println(front);
				//System.out.println(behind);
			}
		}
		
		public void minCutMainFucntion(String str, int number, int [] mins, int level, ArrayList<Integer> tmp, int index, int length){
			//System.out.println(str);
			if(isPali(str)){
				tmp.add(0);
				return;
			}
			for(int i=1;i<str.length();i++){
				if(level == 1){
					index++;
					number = 0;
				}
				String front = str.substring(0,i);
				String behind = str.substring(i);
				int currentNum = number;
				currentNum ++;
				if(isPali(front)&&isPali(behind)){
					//System.out.println("they are "+front+" "+behind);
					//System.out.println("after sub "+(length - front.length()-behind.length())+" left");
					mins[index] = currentNum;
					if(length - front.length()-behind.length()==0){
						//tmp.push(number);
						//System.out.println("length get "+(length - front.length()-behind.length())+" so end");
						//System.out.println("find one cut is "+currentNum);
						tmp.add(currentNum);
						//int newLength = length - front.length()-behind.length();
					}
				}else if(!isPali(front)&&isPali(behind)){
					int newLevel = level+1;
					int newLength = length - behind.length();
					//System.out.println("after sub "+newLength+" left");
					//System.out.println("processing "+front);
					minCutMainFucntion(front, currentNum, mins, newLevel, tmp, index, newLength);
				}
				else if(!isPali(behind)&&isPali(front)){
					int newLevel = level+1;
					int newLength = length - front.length();
					//System.out.println("after sub "+newLength+" left");
					//System.out.println("processing "+behind);
					minCutMainFucntion(behind, currentNum, mins, newLevel, tmp, index, newLength);
				}
				else if(!isPali(behind)&&!isPali(front)){
					//System.out.println("processing "+front+behind);
					int newLevel = level+1;
					//System.out.println(length+" left");
					int newLength = length;
					minCutMainFucntion(front, currentNum, mins, newLevel, tmp, index, newLength);
					currentNum = mins[index];
					newLength = newLength-front.length();
					minCutMainFucntion(behind, currentNum, mins, newLevel, tmp, index, newLength);
				}
			}
		}
		
		public int getMinValue(ArrayList<Integer> array){
			int min = Integer.MAX_VALUE;
			for(int i=0;i<array.size();i++){
				if(array.get(i)<min){
					min = array.get(i);
				}
			}
			return min;
		}
			
		public int minCut(String str){
			int level = 1;
			int [] mins = new int[100];
			for(int i = 0; i< mins.length; i++){
				mins[i] = Integer.MAX_VALUE;
			}
			for(int index = 0; index<str.length(); index++){
				mins[index] = Integer.MAX_VALUE;
			}
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			minCutMainFucntion(str, 0, mins, level, tmp, 0, str.length());
			return getMinValue(tmp);
		}
		
		public static void main(String [] args){
			PalindromePartition pali = new PalindromePartition();
			String str = "a";//c aba b cbc
		
			System.out.println(	pali.minCut(str));
		}
}
