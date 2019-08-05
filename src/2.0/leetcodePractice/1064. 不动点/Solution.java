class Solution {
    public int fixedPoint(int[] A) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i< A.length; i++) {
            if (A[i] == i) {
                if (i < result) {
                    result = i;
                }
                return result;
            }
        }
        return -1;
    }
}