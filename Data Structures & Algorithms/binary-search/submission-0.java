class Solution {
    public int binarySearch(int l, int r, int[] arr, int seek) {
        if (l > r) return -1;
        int m = l + (r - l) / 2;

        if (arr[m] == seek) return m;

        return (arr[m] > seek) ? 
        binarySearch(l, m -1, arr, seek) : 
        binarySearch(m+1, r, arr, seek);
    }
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }
}
