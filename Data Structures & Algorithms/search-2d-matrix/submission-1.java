class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //we can search the first index of the middle array
        //if greater, we search the right
        //if smaller we can search the left

        int l = 0;
        int r = matrix.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (l == r) {
                for (int num: matrix[l]) {
                    if (num == target) return true;
                }
            }

            if (matrix[m][0] > target) {
                //search the left 
                r = m - 1;
            }
            else {
                for (int num: matrix[m]) {
                    if (num == target) return true;
                }
                l = m + 1;
            }

        }
        return false;
    }
}
