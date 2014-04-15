package leetcodePractice;

import java.util.ArrayList;

public class AllUniquePermutation {
	public ArrayList<String> helper(String str){
		if(str.length() == 1){
			ArrayList<String> list = new ArrayList<String>();
			list.add(str);
			return list;
		}
		char c = str.charAt(0);
		String remain = str.substring(1);
		ArrayList<String> prev = helper(remain);
		ArrayList<String> cur = helper(remain);
		for(String s: prev){
			for(int i=0; i<=s.length(); i++){
				StringBuffer buffer = new StringBuffer(s);
				buffer.insert(i, c);
				cur.add(buffer.toString());
			}
		}
		return cur;
		
	}
	
	public ArrayList<ArrayList<Integer>> permuteUnique(int [] num) {
		StringBuffer buffer = new StringBuffer();
		for(int i: num){
			buffer.append(i);
		}
		String str = buffer.toString();
		ArrayList<String> tmpResult = helper(str);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for(String s: tmpResult){
			 if(s.length() == num.length){
				 ArrayList<Integer> list = new ArrayList<Integer>();
				 int [] array = new int[num.length];
				 char [] charArray = s.toCharArray();
				 for(char c: charArray){
					 list.add(c-48);
				 }
				 if(!result.contains(list)){
					 result.add(list);
				 }
				
			 }
		}
		return result;
    }
	
	public static void main(String [] args){
		int [] test = {1,1,2};
		AllUniquePermutation a = new AllUniquePermutation();
		System.out.println(a.permuteUnique(test));
	}
}
