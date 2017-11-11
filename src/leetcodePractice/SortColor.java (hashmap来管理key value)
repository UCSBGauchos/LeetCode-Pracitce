package leetcodePractice;

import java.util.HashMap;
import java.util.Map;

public class SortColor {
	public void sortColors(int[] A) {
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for(int i:A){
			if(!hashmap.containsKey(i)){
				hashmap.put(i, 1);
			}else{
				int oldValue = hashmap.get(i);
				int newValue = oldValue+1;
				hashmap.put(i, newValue);
			}
		}
		int [] sortedColor = new int [A.length];
		int count =  0;
		for(int key: hashmap.keySet()){
			for(int j=0; j<hashmap.get(key); j++){
				A[count] = key;
				count++;
			}
		}
		
	}
	public static void main(String [] args){
		int red = 0;
		int white = 1;
		int blue = 2;
		int [] array = {1,0};
		SortColor sc = new SortColor();
		sc.sortColors(array);
	}
}
