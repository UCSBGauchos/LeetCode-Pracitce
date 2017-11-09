package leetcodePractice;

public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		char [] array = s.toCharArray();
		int maxLength = 0;
		for(int i=0; i<array.length; i++){
			int turnLength = 0;
			int turnPoint = i;
			boolean [] cache = new boolean[256];
			while(turnPoint<array.length&&cache[array[turnPoint]] == false){
				cache[array[turnPoint]] = true;
				turnPoint++;
				turnLength++;
			}
			if(turnLength>=maxLength){
				maxLength = turnLength;
			}
		}
        return maxLength;
    }
	
	public static void main(String [] args){
		String str = "abcabcbb";
		LongestSubstring l = new LongestSubstring();
		System.out.println(l.lengthOfLongestSubstring(str));
	}
}
