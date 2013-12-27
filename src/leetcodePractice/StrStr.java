package leetcodePractice;

public class StrStr {
	
	public String strStr(String haystack, String needle) {
		int length = needle.length();
		for(int i=0; i<=haystack.length()-length; i++){
			String part = haystack.substring(i, i+length);
			if(part.equals(needle)){
				return haystack.substring(i);
			}
		}
		return null;
    }
	
	public static void main(String [] args){
		String haystack = "abc12bcd";
		String needle = "12";
		
		StrStr s = new StrStr();
		String position = s.strStr(haystack, needle);
		
		System.out.println(position);
	}
}
