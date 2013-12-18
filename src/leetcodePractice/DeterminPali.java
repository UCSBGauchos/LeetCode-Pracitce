package leetcodePractice;

public class DeterminPali {
	
	public int helper(String str, int index){
		if(index == -1){
			return -1;
		}
		if(str.length()==1){
			return 1;
		}
		//base case: for even, mid 2
		if(index == str.length()/2-1){
			if(str.length()%2==0){
				if(str.charAt(index)==str.charAt(index+1)){
					return index+2;
				}else{
					return -1;
				}
			}else{
				if(str.charAt(index)==str.charAt(index+2)){
					return index+3;
				}else{
					return -1;
				}
			}
		}
		int newIndex = index+1;
		int next = helper(str, newIndex);
		if(next==-1){
			return -1;
		}
		if(str.charAt(next)==str.charAt(index)){
			return next+1;
		}else{
			return -1;
		}
		
		
	}
	
	public boolean isPalindrome(int x) {
		if(x<0){
			return false;
		}
		String str = Integer.toString(x);
		if(helper(str, 0)==str.length()){
			return true;
		}else{
			return false;
		}
    }
	
	public static void main(String [] args){
		DeterminPali d = new DeterminPali();
		int x = 1298778921;//2
		System.out.println(d.isPalindrome(x));
	}
}
