package leetcodePractice;

public class Sqrt {
	
	public int sqrt(int x) {
        for(int i=1; i<=x/2; i++){
        	System.out.println(i);
        	if(i*i == x){
        		return i;
        	}else if(i*i>x){
        		return i-1;
        	}
        }
        return 0;
    }
	
	public static void main(String [] args){
		Sqrt s = new Sqrt();
		int result = s.sqrt(2147483647);
		System.out.println(result);
	}
	
}
