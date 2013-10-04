package leetcodePractice;

public class MergeSortedArray {
//	
	public int [] merge(int [] a, int [] b){
		int [] helper = new int [a.length];
		int indexForA = (a.length-1)/2;
		int indexForB = b.length-1;
		int indexForHelper = helper.length-1;
		while(indexForHelper>=0){
			if(indexForA>=0&&indexForB>=0&&a[indexForA]>b[indexForB]){
				helper[indexForHelper] = a[indexForA];
				indexForHelper--;
				indexForA--;
			}else if(indexForA>=0&&indexForB>=0&&b[indexForB]>a[indexForA]){
				helper[indexForHelper] = b[indexForB];
				indexForHelper--;
				indexForB--;
			}else if(indexForB<0){
				helper[indexForHelper] = a[indexForA];
				indexForHelper--;
			}else if(indexForA<0){
				helper[indexForHelper] = b[indexForB];
				indexForHelper--;
			}
		}
		return helper;
		
	}
	
	public static void main(String [] args){
		int [] a = new int [10];
		int [] b = new int [5];
		for(int i = 0; i< a.length/2; i++){
			a[i] = 2*i+1;
		}
		for(int i = 0; i< b.length; i++){
			b[i] = 2*i+2;
		}
		MergeSortedArray msa = new MergeSortedArray();
		int [] sortedArray = msa.merge(a, b);
		for(int i: sortedArray){
			System.out.println(i);
		}
		
	}
}
