package leetcodePractice;

public class ReverseInt {
	
	public int reverse(int x) {
		String s = Integer.toString(x);
		char [] charArray = s.toCharArray();
		int result = 0;
		if(charArray[0]!='-'){
			int size = s.length();
			int front = 0;
			int behind = s.length()-1;
			while(front<behind){
				char tmp = charArray[front];
				charArray[front] = charArray[behind];
				charArray[behind] = tmp;
				front++;
				behind--;
			}
			for(char c: charArray){
				result = (int)(result+(c-48)*Math.pow(10, size-1));
				size--;
			}
		}else{
			int size = s.length()-1;
			int front = 1;
			int behind = s.length()-1;
			while(front<behind){
				char tmp = charArray[front];
				charArray[front] = charArray[behind];
				charArray[behind] = tmp;
				front++;
				behind--;
			}
			for(char c: charArray){
				if(c!='-'){
					result = (int)(result+(c-48)*Math.pow(10, size-1));
					size--;
				}
			}
			result = result*(-1);
		}
		return result;
    }
	
	public static void main(String [] args){
		int x=-12345;
		ReverseInt r = new ReverseInt();
		System.out.println(r.reverse(x));
	}
}
