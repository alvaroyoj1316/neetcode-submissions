class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int searching = target - nums[i];

            if (map.containsKey(searching)) {
                return new int[]{map.get(searching), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
