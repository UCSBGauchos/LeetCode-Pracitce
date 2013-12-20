package leetcodePractice;

import java.util.HashMap;

public class RomToInt {
	
	public int romanToInt(String s) {
		for(int i=1; i<=3999; i++){
			String rom = intToRoman(i);
			if(rom.equals(s)){
				return i;
			}
		}
		return 0;
    }
	
	public String intToRoman(int num) {
		HashMap<Integer, String> numberDict = new HashMap<Integer, String>();
		numberDict.put(1, "I");
		numberDict.put(2, "II");
		numberDict.put(3, "III");
		numberDict.put(4, "IV");
		numberDict.put(5, "V");
		numberDict.put(6, "VI");
		numberDict.put(7, "VII");
		numberDict.put(8, "VIII");
		numberDict.put(9, "IX");
		numberDict.put(10, "X");
		numberDict.put(20, "XX");
		numberDict.put(30, "XXX");
		numberDict.put(40, "XL");
		numberDict.put(50, "L");
		numberDict.put(60, "LX");
		numberDict.put(70, "LXX");
		numberDict.put(80, "LXXX");
		numberDict.put(90, "XC");
		numberDict.put(100, "C");
		numberDict.put(200, "CC");
		numberDict.put(300, "CCC");
		numberDict.put(400, "CD");
		numberDict.put(500, "D");
		numberDict.put(600, "DC");
		numberDict.put(700, "DCC");
		numberDict.put(800, "DCCC");
		numberDict.put(900, "CM");
		numberDict.put(1000, "M");
		numberDict.put(2000, "MM");
		numberDict.put(3000, "MMM");
		
		
		if(num>10&&num<20){
			int one = num-10;
			String oneS = numberDict.get(one);
			return numberDict.get(10)+oneS;
		}else if(num>20&&num<30){
			int one = num-20;
			String oneS = numberDict.get(one);
			return numberDict.get(20)+oneS;
		}else if(num>30&&num<40){
			int one = num-30;
			String oneS = numberDict.get(one);
			return numberDict.get(30)+oneS;
		}else if(num>40&&num<50){
			int one = num-40;
			String oneS = numberDict.get(one);
			return numberDict.get(40)+oneS;
		}else if(num>50&&num<60){
			int one = num-50;
			String oneS = numberDict.get(one);
			return numberDict.get(50)+oneS;
		}else if(num>60&&num<70){
			int one = num-60;
			String oneS = numberDict.get(one);
			return numberDict.get(60)+oneS;
		}else if(num>70&&num<80){
			int one = num-70;
			String oneS = numberDict.get(one);
			return numberDict.get(70)+oneS;
		}else if(num>80&&num<90){
			int one = num-80;
			String oneS = numberDict.get(one);
			return numberDict.get(80)+oneS;
		}else if(num>90&&num<100){
			int one = num-90;
			String oneS = numberDict.get(one);
			return numberDict.get(90)+oneS;
		}else if(num>100&&num<200){
			int ten = num-100;
			String tenS = intToRoman(ten);
			return numberDict.get(100)+tenS;
		}else if(num>200&&num<300){
			int ten = num-200;
			String tenS = intToRoman(ten);
			return numberDict.get(200)+tenS;
		}else if(num>300&&num<400){
			int ten = num-300;
			String tenS = intToRoman(ten);
			return numberDict.get(300)+tenS;
		}else if(num>400&&num<500){
			int ten = num-400;
			String tenS = intToRoman(ten);
			return numberDict.get(400)+tenS;
		}else if(num>500&&num<600){
			int ten = num-500;
			String tenS = intToRoman(ten);
			return numberDict.get(500)+tenS;
		}else if(num>600&&num<700){
			int ten = num-600;
			String tenS = intToRoman(ten);
			return numberDict.get(600)+tenS;
		}else if(num>700&&num<800){
			int ten = num-700;
			String tenS = intToRoman(ten);
			return numberDict.get(700)+tenS;
		}else if(num>800&&num<900){
			int ten = num-800;
			String tenS = intToRoman(ten);
			return numberDict.get(800)+tenS;
		}else if(num>900&&num<1000){
			int ten = num-900;
			String tenS = intToRoman(ten);
			return numberDict.get(900)+tenS;
		}else if(num>1000&&num<2000){
			int hundred = num-1000;
			String hunS = intToRoman(hundred);
			return numberDict.get(1000)+hunS;
		}else if(num>2000&&num<3000){
			int hundred = num-2000;
			String hunS = intToRoman(hundred);
			return numberDict.get(2000)+hunS;
		}else if(num>3000&&num<4000){
			int hundred = num-3000;
			String hunS = intToRoman(hundred);
			return numberDict.get(3000)+hunS;
		}else{
			return numberDict.get(num);
		}
    }
	
	public static void main(String [] args){
		String x = "MMMDCCCIX";
		RomToInt r = new RomToInt();
		System.out.println(r.romanToInt(x));
	}
}
