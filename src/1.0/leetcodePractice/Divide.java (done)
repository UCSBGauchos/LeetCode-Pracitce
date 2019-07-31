package leetcodePractice;

import java.util.ArrayList;

public class Divide {
	
	 public int divide(int dividend, int divisor) {
		 int rDividend = Math.abs(dividend);
		 int rDivisor = Math.abs(divisor);
		 
		 int sum = 0;
		 int index = 0;
		 while(sum<rDividend){
			 index++;
			 sum+=rDivisor;
			 if(sum>rDividend){
				 index--;
			 }
		 }
		 if(dividend>0&&divisor<0){
			 return -index;
		 }else if(dividend<0&&divisor>0){
			 return -index;
		 }else if(dividend>0&&divisor>0){
			 return index;
		 }else{
			 return index;
		 }
	 }
	
	public static void main(String [] ags){
		Divide d = new Divide();
		int dividend = 2147483647;
		int divisor = 1;
		
		int result = d.divide(dividend, divisor);
		System.out.println(result);
	}
}
