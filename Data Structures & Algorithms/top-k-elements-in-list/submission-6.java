class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Map.Entry<Integer, Integer>> l = new ArrayList<>(map.entrySet());

        l.sort((a, b) -> (b.getValue() - a.getValue()));

        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = l.get(i).getKey();
        }
        return arr;

    }
}
