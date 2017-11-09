package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

//keySet store all the keys, and we will run LRU cache algorithm on this array
//hash store all the key and value pair, we can use the key to find the value

public class LRUCache {
	
	int [] keySet;
	HashMap<Integer, Integer> hash;
	int index = 0;
	
	public LRUCache(int capacity) {
		keySet = new int[capacity];
		hash = new HashMap<Integer, Integer>();
    }
    
    public int get(int key) {
    	for(int i=0; i<keySet.length; i++){
    		if(keySet[i]==key){
    			for(int j=i; j>=1; j--){
    				keySet[j] = keySet[j-1];
    			}
    			keySet[0] = key;
    			//return keySet[0];
    			return hash.get(keySet[0]);
    		}
    	}
    	return -1;
    }
    
    public void set(int key, int value) {
    	for(int i: keySet){
    		if(key == i){
    			hash.put(key, value);
    			return;
    		}
    	}
    	for(int j = keySet.length-1; j>=1; j--){
			keySet[j] = keySet[j-1];
		}
		keySet[0] = key;
		hash.put(key, value);
    }
    
    public static void main(String [] args){
    	LRUCache l = new LRUCache(5);
    	l.set(1, 11);
    	l.set(2, 12);
    	l.set(3, 13);
    	for(int i: l.keySet){
    		System.out.print(i);
    	}
    	System.out.println();
    	System.out.println(l.get(2));
    	for(int i: l.keySet){
    		System.out.print(i);
    	}
    	System.out.println();
    }
}
