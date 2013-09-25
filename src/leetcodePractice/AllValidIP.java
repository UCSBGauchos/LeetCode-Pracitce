package leetcodePractice;

import java.util.ArrayList;

public class AllValidIP {
	
	public double stringToNumber(String str){
		double number = 0;
		char [] array = str.toCharArray();
		for(int index = 0;index<array.length;index++){
			number = number+((int)(array[index])-48)*Math.pow(10, array.length-1-index);
		}
		return number;
	}
	
	public boolean isValid(double number){
		if(number<=255&&number>=0){
			return true;
		}else{
			return false;
		}
	}
	
	public ArrayList<ArrayList<String>> removeUnValid(ArrayList<ArrayList<String>> ips){
		ArrayList<ArrayList<String>> newIPs = new ArrayList<ArrayList<String>>();
		for(ArrayList<String> ip: ips){
			if(ip.size() == 4){
				newIPs.add(ip);
			}
		}
		return newIPs;
	}
	
	public ArrayList<ArrayList<String>> allIP(String ip, int number){
		if(ip.length()>12){
			return null;
		}
		if(number == 3){
			double value = stringToNumber(ip);
			if(isValid(value)){
				ArrayList<String> result = new ArrayList<String>();
				ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
				result.add(ip);
				results.add(result);
				return results;
			}else{
				ArrayList<String> result = new ArrayList<String>();
				ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
				results.add(result);
				return results;
			}
		}
		ArrayList<ArrayList<String>> preLists = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> curListsOne = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> curListsTwo = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> curListsThree = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> allCurLists = new ArrayList<ArrayList<String>>();
		
		if(number<3){
			String str1 = ip.substring(0,1);
			String remain1 = ip.substring(1);
			preLists = allIP(remain1, number+1);
			for(ArrayList<String> list: preLists){
				double value = stringToNumber(str1);
				if(isValid(value)){
					list.add(str1);
				}
				curListsOne.add(list);
			}
			
			String str2 = ip.substring(0,2);
			String remain2 = ip.substring(2);
			preLists = allIP(remain2, number+1);
			for(ArrayList<String> list: preLists){
				double value = stringToNumber(str2);
				if(isValid(value)){
					list.add(str2);
				}
				curListsTwo.add(list);
			}
			
			String str3 = ip.substring(0,3);
			String remain3 = ip.substring(3);
			preLists = allIP(remain3, number+1);
			for(ArrayList<String> list: preLists){
				double value = stringToNumber(str3);
				if(isValid(value)){
					list.add(str3);
				}
				curListsThree.add(list);
			}
		}
		
		
		
		allCurLists.addAll(curListsOne);
		allCurLists.addAll(curListsTwo);
		allCurLists.addAll(curListsThree);
		
		
		return allCurLists;
	}
	
	public static void main(String [] args){
		String IP = "25525511135";
		AllValidIP avi = new AllValidIP();
		System.out.println(avi.allIP(IP, 0));
	}
}
