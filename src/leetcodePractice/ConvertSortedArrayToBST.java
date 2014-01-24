package leetcodePractice;

public class ConvertSortedArrayToBST {
	
	public TreeNode help(int begin, int end, int [] num){
		if(begin>end){
			return null;
		}
		int middle = (begin+end)/2;
		TreeNode root = new TreeNode(num[middle]);
		root.left = help(begin, middle-1, num);
		root.right = help(middle+1, end, num);
		return root;
	}
	
	public TreeNode sortedArrayToBST(int[] num) {
		return help(0, num.length-1, num);
    }
	
	public static void main(String [] args){
		ConvertSortedArrayToBST c = new ConvertSortedArrayToBST();
		int [] num = {1,2,3,4,5};
		TreeNode root = c.sortedArrayToBST(num);
		System.out.println(root.left.right.val);
	}
}
