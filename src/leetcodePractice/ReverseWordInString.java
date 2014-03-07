package leetcodePractice;

import java.util.ArrayList;

public class ReverseWordInString {
	
	public String reverseWords(String s) {
		if(s==null){
			return null;
		}
		if(s.length()==0){
			return "";
		}
		ArrayList<String> list = new ArrayList<String>();
		StringBuffer tmp = new StringBuffer();
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)!=' '&&i+1<s.length()){
				tmp.append(s.charAt(i));
			}else if(s.charAt(i)==' '&&i>0&&s.charAt(i-1)!=' '){
				list.add(tmp.toString());
				tmp = new StringBuffer();
			}else if(s.charAt(i)!=' '&&i+1 == s.length()){
				tmp.append(s.charAt(i));
				list.add(tmp.toString());
			}else{
				tmp = new StringBuffer();
			}
		}
		System.out.println(list);
		String [] strs = new String[list.size()];
		for(int i=0; i<list.size(); i++){
			strs[i] = list.get(i);
		}
		
		int i = 0;
		int j = strs.length-1;
		while(i<=j){
			String tmpStr = strs[i];
			strs[i] = strs[j];
			strs[j] = tmpStr;
			i++;
			j--;
		}
		StringBuffer buffer = new StringBuffer();
		int index = 0;
		for(String str: strs){
			buffer.append(str);
			if(index!=strs.length-1){
				buffer.append(" ");
			}
			index++;
		}
		return buffer.toString();
    }
	
	public static void main(String [] args){
		ReverseWordInString r = new ReverseWordInString();
		String test = "a";
		System.out.println(r.reverseWords(test));
	}
}
