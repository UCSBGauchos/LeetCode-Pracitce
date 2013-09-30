package leetcodePractice;

public class InterLevString {
	
	public BooleanNode [][] DPArrayForA;
	public BooleanNode [][] DPArrayForB;
	//DPArray[aIndex][bIndex] means whether c[aIndex+bIndex] is from a[aIndex] or b[bIndex]
	public void createDPArrayA (int row, int col){
		DPArrayForA = new BooleanNode[row][col];
		for(int i=0; i<row; i++){
			for(int j=0;j<col;j++){
				DPArrayForA[i][j] = new BooleanNode();
			}
		}
	}
	public void createDPArrayB (int row, int col){
		DPArrayForB = new BooleanNode[row][col];
		for(int i=0; i<row; i++){
			for(int j=0;j<col;j++){
				DPArrayForB[i][j] = new BooleanNode();
			}
		}
	}
	public boolean check(String a, String b, String c, int aIndex, int bIndex, int cIndex, int aSize, int bSize, int cSize){
		if(cSize != (aSize+bSize)){
			return false;
		}
		if(cIndex == cSize&&bIndex == bSize&&aIndex == aSize){
			return true;
		}
		Boolean aF = false;
		Boolean bF = false;
		char charC = c.charAt(cIndex);
		
		
		if(aIndex<aSize){
			char charA = a.charAt(aIndex);
			if(charC == charA&&DPArrayForA[cIndex][aIndex].visited==false){
				DPArrayForA[cIndex][aIndex].value = check(a,b,c,aIndex+1,bIndex,cIndex+1,aSize,bSize,cSize);
				aF = DPArrayForA[cIndex][aIndex].value;
				DPArrayForA[cIndex][aIndex].visited = true;
			}else if(charC == charA&&DPArrayForA[cIndex][aIndex].visited==true){
				aF = DPArrayForA[cIndex][aIndex].value;
			}
		}
		if(bIndex<bSize){
			char charB = b.charAt(bIndex);
			if(charC == charB&&DPArrayForB[cIndex][bIndex].visited==false){
				DPArrayForB[cIndex][bIndex].value = check(a,b,c,aIndex,bIndex+1,cIndex+1,aSize,bSize,cSize);
				bF = DPArrayForB[cIndex][bIndex].value;
				DPArrayForB[cIndex][bIndex].visited = true;
			}else if(charC == charB&&DPArrayForB[cIndex][bIndex].visited==true){
				bF = DPArrayForB[cIndex][bIndex].value;
			}
		}
		return aF||bF;
	}
	
	public static void main(String [] args){
		String a = "XXY";
		String b = "XXZ";
		String c = "XXZXXY";
		InterLevString ils = new InterLevString();
		int aSize = a.length();
		int bSize = b.length();
		int cSize = c.length();
		ils.createDPArrayA(cSize, aSize);
		ils.createDPArrayB(cSize, bSize);
		System.out.println(ils.check(a, b, c, 0, 0, 0, aSize, bSize, cSize));
	}
}
