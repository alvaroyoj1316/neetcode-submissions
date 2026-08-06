class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            char[] stArr = s.toCharArray();
            Arrays.sort(stArr);
            String sortedS = new String(stArr);
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
