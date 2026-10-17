class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int l = 0;
        int maxLen = 0; 
        

        if (s.length() == 0) return 0;

        for (int r = 0; r < s.length(); r++) {
            Character a = s.charAt(r);
            if (map.containsKey(a)) {
                l = Math.max(map.get(a) + 1, l);
            }
            map.put(a, r);
            maxLen = Math.max((r - l + 1), maxLen);
        }
        return maxLen;
    }
}
