package leetcodePractice;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {
	
	public boolean contains(String s, String t){
		char [] charArrayS = s.toCharArray();
		char [] charArrayT = t.toCharArray();
		int [] helper = new int[256];
		for(int i=0;i<charArrayT.length; i++){
			int index = (int)charArrayT[i];
			helper[index]++;
		}
		for(int i=0; i<charArrayS.length; i++){
			int index = (int)charArrayS[i];
			if(helper[index]>0){
				helper[index]--;
			}
		}
		for(int i=0; i<helper.length; i++){
			if(helper[i]!=0){
				return false;
			}
		}
		return true;
	}
	
//	public String minWindow(String S, String T) {
//  
//        
//    }
	
	
	
	public static void main(String [] args){
		String s = "abdnf";
		String t = "abf";
		MinWindow mw = new MinWindow();
		//String result = mw.minWindow(s, t);
		System.out.println(mw.contains(s, t));
	}
}
