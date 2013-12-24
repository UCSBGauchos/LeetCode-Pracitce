package leetcodePractice;

import java.util.ArrayList;

public class GenerateParentheses {
	
	public ArrayList<String> generateParenthesis(int n) {
		if(n == 1){
			String s = "()";
			ArrayList<String> result = new ArrayList<String>();
			result.add(s);
			return result;
		}
		ArrayList<String> prev = generateParenthesis(n-1);
		ArrayList<String> cur = new ArrayList<String>();
		ArrayList<String> result = new ArrayList<String>();
		for(String list: prev){
			for(int i = 0; i<list.length(); i++){
				String first = list.substring(0,i);
				String second = list.substring(i);
				String whole = first+"()"+second;
				cur.add(whole);
			}
		}
		for(String s: cur){
			if(!result.contains(s)){
				result.add(s);
			}
		}
		return result;
    }
	
	public static void main(String [] args){
		GenerateParentheses g = new GenerateParentheses();
		ArrayList<String> result = g.generateParenthesis(3);
		for(String s: result){
			System.out.print(s+" ");
		}
	}
}
