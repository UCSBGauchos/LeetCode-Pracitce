package leetcodePractice;

import java.util.Stack;

public class LongestPali {
	
	public boolean isPali(String s){
		Stack <Character> stack = new Stack<Character>();
		char [] charArray = s.toCharArray();
		int size = s.length();
		if(size%2==0){
			for(int i=0; i<size/2; i++){
				stack.push(charArray[i]);
			}
			for(int j=size/2; j<size; j++){
				if(stack.pop()!=charArray[j]){
					return false;
				}
			}
		}else{
			for(int i=0; i<size/2; i++){
				stack.push(charArray[i]);
			}
			for(int j=size/2+1; j<size; j++){
				if(stack.pop()!=charArray[j]){
					return false;
				}
			}
		}
		return true;
	}
	
	public String longestPalindrome(String s) {
		int size = s.length();
		int window=0;
		for(window = size; window>=0; window--){
			for(int i=0; i<=size-window; i++){
				if(isPali(s.substring(i,i+window))){
					return s.substring(i,i+window);
				}
			}
		}
		return null;
    }
	
	public static void main(String [] args){
		LongestPali l = new LongestPali();
		String str = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		System.out.println(l.longestPalindrome(str));
		
	}
}
