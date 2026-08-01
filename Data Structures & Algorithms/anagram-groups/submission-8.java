class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //we iterate througth array
        //we sort the string
        //we store the ordered string as the key in a hashmap
        //the vale is a list
        //returnt the list

        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            String sortedS = new String(sorted);
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
