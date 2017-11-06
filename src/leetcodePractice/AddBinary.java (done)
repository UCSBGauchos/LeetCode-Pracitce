package leetcodePractice;

public class AddBinary {
	
	public String addBinary(String a, String b){
		boolean needAdd = false;
		int aIndex = a.length()-1;
		int bIndex = b.length()-1;
		StringBuffer s = new StringBuffer();
		while(aIndex>=0||bIndex>=0){
			if(aIndex<0&&bIndex>=0){
				if(needAdd == false){
					s.append(b.charAt(bIndex));
					bIndex--;
				}else{
					if(b.charAt(bIndex)=='1'){
						s.append('0');
						needAdd = true;
						bIndex--;
					}else{
						s.append('1');
						needAdd = false;
						bIndex--;
					}
				}
			}else if(aIndex>=0&&bIndex<0){
				if(needAdd == false){
					s.append(a.charAt(aIndex));
					aIndex--;
				}else{
					if(a.charAt(aIndex)=='1'){
						s.append('0');
						needAdd = true;
						aIndex--;
					}else{
						s.append('1');
						needAdd = false;
						aIndex--;
					}
				}
			}else if(aIndex>=0&&bIndex>=0){
				if(needAdd == false){
					if(a.charAt(aIndex)=='1'&&b.charAt(bIndex)=='1'){
						s.append('0');
						needAdd = true;
						aIndex--;
						bIndex--;
					}else if(a.charAt(aIndex)=='0'&&b.charAt(bIndex)=='1'){
						s.append('1');
						needAdd = false;
						aIndex--;
						bIndex--;
					}else if(a.charAt(aIndex)=='1'&&b.charAt(bIndex)=='0'){
						s.append('1');
						needAdd = false;
						aIndex--;
						bIndex--;
					}else if(a.charAt(aIndex)=='0'&&b.charAt(bIndex)=='0'){
						s.append('0');
						needAdd = false;
						aIndex--;
						bIndex--;
					}
				}else{
					if(a.charAt(aIndex)=='1'&&b.charAt(bIndex)=='1'){
						s.append('1');
						needAdd = true;
						aIndex--;
						bIndex--;
					}else if(a.charAt(aIndex)=='0'&&b.charAt(bIndex)=='1'){
						s.append('0');
						needAdd = true;
						aIndex--;
						bIndex--;
					}else if(a.charAt(aIndex)=='1'&&b.charAt(bIndex)=='0'){
						s.append('0');
						needAdd = true;
						aIndex--;
						bIndex--;
					}else if(a.charAt(aIndex)=='0'&&b.charAt(bIndex)=='0'){
						s.append('1');
						needAdd = false;
						aIndex--;
						bIndex--;
					}
				}
			}
		}
		if(needAdd == true){
			s.append("1");
		}
		return s.reverse().toString();
	}
	
	public static void main(String [] args){
		String a = "101111";
		String b = "10";
		AddBinary add = new AddBinary();
		System.out.println(add.addBinary(a, b));
		
	}
}
