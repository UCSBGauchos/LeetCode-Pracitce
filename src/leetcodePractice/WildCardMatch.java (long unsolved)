package leetcodePractice;

public class WildCardMatch {
	public boolean isMatch(String s, String p) {
		if(s.length()==0&&p.length()==0){
			return true;
		}else if(s.length()==0&&p.length()!=0){
			if(p.length()>1&&p.charAt(1)=='*'){
				String pRemain = p.substring(2);
				if(isMatch(s, pRemain)){
					return true;
				}
			}else if(p.length()==1){
				return false;
			}
		}else if(s.length()!=0&&p.length()==0){
			return false;
		}else if(p.length()>1&&p.charAt(0)=='?'&&p.charAt(1)=='*'){
			String pRemain = p.substring(2);
			//System.out.println("pRemain is "+pRemain);
			for(int i=0; i<=s.length(); i++){
				String sRemain = s.substring(i);
				//System.out.println("try "+i+" sRemain is "+sRemain);
				if(isMatch(sRemain, pRemain)){
					return true;
				}
			}
		}else if(p.length()>1&&p.charAt(0)=='?'&&p.charAt(1)!='*'){
			String pRemain = p.substring(1);
			String sRemain = s.substring(1); 
			//System.out.println("pRemain is "+pRemain);
			//System.out.println("sRemain is "+sRemain);
			if(isMatch(sRemain, pRemain)){
				return true;
			}
		}else if(p.length()>1&&p.charAt(0)!='*'&&p.charAt(1)=='*'){
			if(p.charAt(0)!=s.charAt(0)){
				//System.out.println("skip one!");
				String pRemain = p.substring(2);
				//System.out.println("pRemain is "+pRemain);
				//System.out.println("sRemain is "+s);
				if(isMatch(s, pRemain)){
					return true;
				}
			}else{
				//System.out.println("star match, can try it!");
				for(int i=0; i<=s.length(); i++){
					if(i>0){
						if(s.substring(i-1, i).charAt(0)!=p.charAt(0)){
							//System.out.println("terminate trying!");
							break;
						}
					}
					String sRemain = s.substring(i);
					String pRemain = p.substring(2);
					//System.out.println("try "+i+" pRemain is "+pRemain);
					//System.out.println("try "+i+" sRemain is "+sRemain);
					if(isMatch(sRemain, pRemain)){
						return true;
					}
				}
			}
		}else if(p.charAt(0)==s.charAt(0)||p.charAt(0)=='?'){
			String pRemain = p.substring(1);
			String sRemain = s.substring(1);
			//System.out.println("pRemain is "+pRemain);
			//System.out.println("sRemain is "+sRemain);
			if(isMatch(sRemain, pRemain)){
				return true;
			}
		}else if(p.charAt(0)=='*'){
			String pRemain = p.substring(1);
			//System.out.println("pRemain is "+pRemain);
			for(int i=0; i<=s.length(); i++){
				String sRemain = s.substring(i);
				//System.out.println("try "+i+" sRemain is "+sRemain);
				if(isMatch(sRemain, pRemain)){
					return true;
				}
			}
		}
		return false;
    }
	
	public static void main(String [] args){
		WildCardMatch w = new WildCardMatch();
		String s = "aaaaaaa";
		String p = "*";
		System.out.println(w.isMatch(s, p));
	}
}
