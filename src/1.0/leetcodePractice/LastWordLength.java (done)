package leetcodePractice;

public class LastWordLength {
	
	public int lengthOfLastWord(String s) {
		String [] splitedString = s.split(" ");
		if(splitedString.length == 0){
			return 0;
		}
		int length = splitedString.length-1;
		int result = splitedString[length].length();
		return result;
    }
	
	public static void main(String [] args){
		LastWordLength l = new LastWordLength();
		String s = " ";
		int result = l.lengthOfLastWord(s);
		System.out.println(result);
	}
}
