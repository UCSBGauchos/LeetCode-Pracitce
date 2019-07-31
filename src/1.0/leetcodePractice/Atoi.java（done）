package leetcodePractice;

public class Atoi {
	
	public int atoi(String str) {
		str = str.replaceAll(" ","");
		if(str.equals("")){
			return 0;
		}
		char [] charArray = str.toCharArray();
		int result = 0;
		if(charArray[0]!='-'&&charArray[0]!='+'){
			int size = str.length();
			for(char c: charArray){
				result = (int)(result+(c-48)*Math.pow(10, size-1));
				size--;
			}
		}else if(charArray[0]=='-'){
			int size = str.length()-1;
			for(char c: charArray){
				if(c!='-'){
					result = (int)(result+(c-48)*Math.pow(10, size-1));
					size--;
				}
			}
			result = result*(-1);
		}else if(charArray[0]=='+'){
			int size = str.length()-1;
			for(char c: charArray){
				if(c!='+'){
					result = (int)(result+(c-48)*Math.pow(10, size-1));
					size--;
				}
			}
		}
		return result;
    }
	
	public static void main(String [] args){
		String s = "    010";
		Atoi a = new Atoi();
		System.out.println(a.atoi(s));
	}
}
