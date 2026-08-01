class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (int num: nums) {
            if (map.containsKey(num)) return true;
            map.put(num, i);
            i++;
        }
        return false;
    }
}