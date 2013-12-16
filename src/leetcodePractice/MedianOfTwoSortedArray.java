package leetcodePractice;

public class MedianOfTwoSortedArray {
	public double findMedianSortedArrays(int A[], int B[]) {
		int aSize = A.length;
		int bSize = B.length;
		int [] mergedArray = new int [aSize+bSize];
		int i=0;
		int j=0;
		int k=0;
		while(i<aSize||j<bSize){
			if(i<aSize&&j<bSize&&A[i]<=B[j]){
				mergedArray[k] = A[i];
				i++;
				k++;
			}else if(i<aSize&&j<bSize&&A[i]>B[j]){
				mergedArray[k] = B[j];
				j++;
				k++;
			}else if(i==aSize){
				mergedArray[k] = B[j];
				j++;
				k++;
			}else if(j==bSize){
				mergedArray[k] = A[i];
				i++;
				k++;
			}
		}
		int size = mergedArray.length;
		if(size%2==0){
			return (double)(mergedArray[size/2-1]+mergedArray[size/2])/2;
		}else{
			return mergedArray[size/2];
		}
	}
	
	public static void main(String [] args){
		int [] A = {1,3,5};
		int [] B = {2,4,6};
		//123456
		MedianOfTwoSortedArray m = new MedianOfTwoSortedArray();
		double result = m.findMedianSortedArrays(A, B);
		System.out.println(result);
	}
}
