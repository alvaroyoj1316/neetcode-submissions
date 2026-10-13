class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //iterate throught the array
        //sort the string
        //map the key, sorted string is K, V is a list containing the unsorted words
        //return the list of lists

        Map<String, List<String>> map = new HashMap<>();
        for (String str: strs) {
            char[] sArr = str.toCharArray();
            Arrays.sort(sArr);
            String sortedS = new String(sArr);
            map.putIfAbsent(sortedS, new ArrayList<String>());
            map.get(sortedS).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
