package leetcodePractice;

import java.util.HashMap;

public class CountAndSay {
	
	public String helper(String str, int index, int n){
		if(index==n){
			return str;
		}
		String result = "";
		int count = 0;
		char [] array = str.toCharArray();
		char last = array[0];
		for(int i=0; i<array.length; i++){
			if(array[i]==last){
				count++;
			}else{
				result = result+count+last;
				last = array[i];
				count = 1;
			}
		}
		result = result+count+last;
		String truResult = helper(result, index+1, n);
		
		return truResult;
	}
	
	public String countAndSay(int n) {
		String first = "1";
		int index = 1;
		String result = helper(first, index, n);
		return result;
    }
	
	public static void main(String [] args){
		int num = 5;
		CountAndSay c = new CountAndSay();
		System.out.println(c.countAndSay(num));
	}
}
