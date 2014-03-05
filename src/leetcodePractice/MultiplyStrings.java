package leetcodePractice;

import java.util.ArrayList;

public class MultiplyStrings {
	 public String multiply(String num1, String num2) {
		 String smaller = smallAndBig(num1, num2).get(0);
		 String bigger = smallAndBig(num1, num2).get(1);
		 char [] smallerArray = smaller.toCharArray();
		 char [] biggerArray = bigger.toCharArray();
		 ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		 ArrayList<Integer> answer = new ArrayList<Integer>();
		 int prev = 0;
		 boolean needAdd = false;
		 for(int i = smallerArray.length-1; i>=0; i--){
			 ArrayList<Integer> tmpList = new ArrayList<Integer>();
			 prev = 0;
			 for(int j = biggerArray.length-1; j>=0; j--){
				 int tmp = (biggerArray[j]-48)*(smallerArray[i]-48)+prev;
				 int ten = tmp/10;
				 int one = 0;
				 if(tmp>=10){
					 one = tmp-ten*10;
				 }else{
					 one = tmp;
				 }
				 tmpList.add(one);
				 prev = ten;
			 }
			 if(prev!=0){
				 tmpList.add(prev);
			 }
			 result.add(tmpList);
		 }
		 for(int i=0; i<result.size(); i++){
			 for(int j=0; j<i; j++){
				 result.get(i).add(0, 0);
			 }
		 }
		 int length = getLongest(result);
		 boolean need = false;
		 int prev2 = 0;
		 for(int i=0; i<length; i++){
			 int ten = 0;
			 int tmp = 0;
			 for(int j=0; j<result.size(); j++){
				 if(i>=result.get(j).size()){
					 tmp+=0;
				 }else{
					 tmp+=result.get(j).get(i);
				 }
			 }
			 tmp = tmp+prev2;
			 if(tmp>=10){
				 ten = tmp/10;
				 tmp = tmp-ten*10;
			 }
			 prev2 = ten;
			 answer.add(tmp);
		 }
		 if(prev2!=0){
			 answer.add(prev2);
		 }
		 StringBuffer buffer = new StringBuffer();
		 for(int i=answer.size()-1; i>=0; i--){
			 buffer.append((char)(answer.get(i)+48));
		 }
		 return buffer.toString();
	 }
	
	 
	 public ArrayList<String> smallAndBig(String num1, String num2){
		 ArrayList<String> result = new ArrayList<String>();
		 if(num1.length()<=num2.length()){
			 result.add(num1);
			 result.add(num2);
		 }else{
			 result.add(num2);
			 result.add(num1);
		 }
		 return result;
	 }
	 
	 public int getLongest(ArrayList<ArrayList<Integer>> result){
		 int longest = 0;
		 for(ArrayList<Integer> list: result){
			 if(list.size()>=longest){
				 longest = list.size();
			 }
		 }
		 return longest;
	 }
	 
	 public static void main(String [] args){
		 String one = "123456789";
		 String two = "987654321";
		 MultiplyStrings m = new MultiplyStrings();
		 System.out.println(m.multiply(one, two));
		 
	 }
	 
}
