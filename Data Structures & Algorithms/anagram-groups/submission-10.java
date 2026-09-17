class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        //we iterate throught hte array and sort the string
        //then we put if absent in the map, the sorted string as K and map to value list of words 
        //that when sorted equal the key k
        //put the unsorted word in the list
        for (int i = 0; i < strs.length; i++) {
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String sortedS = new String(s);
            map.putIfAbsent(sortedS, new ArrayList<String>());
            map.get(sortedS).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
