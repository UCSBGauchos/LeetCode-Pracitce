package leetcodePractice;

public class MergeSortedArray {
	
	public void merge(int A[], int m, int B[], int n) {
		int index = A.length-1;
		int indexA = m-1;
		int indexB = n-1;
		
		while(index>=0){
			if(indexA>=0&&indexB>=0&&A[indexA]>=B[indexB]){
				A[index] = A[indexA];
				index--;
				indexA--;
			}else if(indexA>=0&&indexB>=0&&A[indexA]<B[indexB]){
				A[index] = B[indexB];
				index--;
				indexB--;
			}else if(indexA < 0){
				A[index] = B[indexB];
				index--;
				indexB--;
			}else if(indexB<0){
				A[index] = A[indexA];
				index--;
				indexA--;
			}
		}
    }
	
	
	
	public static void main(String [] args){
		int m = 5;
		int n = 5;
		
		int [] a = new int [m+n];
		int [] b = new int [n];
		for(int i = 0; i< m; i++){
			a[i] = 2*i+1;
		}
		for(int i = 0; i< n; i++){
			b[i] = 2*i+2;
		}
		MergeSortedArray merge = new MergeSortedArray();
		merge.merge(a, m, b, n);
		for(int i: a){
			System.out.print(i);
		}
	}
}
