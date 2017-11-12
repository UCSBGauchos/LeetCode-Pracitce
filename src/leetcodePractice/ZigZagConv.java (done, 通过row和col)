package leetcodePractice;

public class ZigZagConv {
	
	public String convert(String s, int nRows) {
		char [] charArray = s.toCharArray();
		char [][] helpMatrix = new char[nRows][1000];
		int row = 0;
		int col = 0;
		boolean needSwitch = false;
		for(int i=0; i<charArray.length; i++){
			if(needSwitch == false){
				helpMatrix[row][col] = charArray[i];
				if(row == nRows-1){
					needSwitch = true;
					if(row>0){
						row--;
					}
					col++;
				}else{
					if(row<nRows-1){
						row++;
					}else{
						col++;
					}
				}
			}else{
				helpMatrix[row][col] = charArray[i];
				if(row == 0){
					needSwitch = false;
					if(row<nRows-1){
						row++;
					}else{
						col++;
					}
				}else{
					if(row>0){
						row--;
					}
					col++;
				}
			}
		}
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i<helpMatrix.length; i++){
			for(int j=0; j<helpMatrix[0].length; j++){
				buffer.append(helpMatrix[i][j]);
			}
		}
		return buffer.toString();
	}
	
	public static void main(String [] args){
		String s = "Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.";
		ZigZagConv z = new ZigZagConv();
		String result = z.convert(s, 2);
		System.out.println(result);
	}
}
