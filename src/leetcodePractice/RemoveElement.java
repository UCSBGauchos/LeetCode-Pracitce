package leetcodePractice;

import java.util.ArrayList;

public class RemoveElement {
	
	public int removeElement(int[] A, int elem) {
		int length = A.length;
		for(int i=0; i<length; i++){
			if(A[i]==elem){
				for(int j=i; j<length-1; j++){
					A[j] = A[j+1];
				}
				length--;
				i--;
			}
		}
		for(int i: A){
			System.out.print(i);
		}
		return length;
    }
	
	public static void main(String [] args){
		int [] array = {1};
		int element = 1;
		RemoveElement r = new RemoveElement();
		int length = r.removeElement(array, element);
		System.out.println(length);
	}
}
