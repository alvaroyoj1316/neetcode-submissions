class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        //anagrams are going to be equal when sorted.
        //itareate throgh the list and sort

        //act -> act
        //map the sorted version to its actuual word

        //pots -> opst
        //tops -> opst
        //stop -> opst

        //if it matches, add it to that list

        //return all the lists which are the values in the hash map

        for (String s: strs) {
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String sortedS = new String(str);
            map.putIfAbsent(sortedS, new ArrayList<String>());
            map.get(sortedS).add(s);
        }
        return new ArrayList<>(map.values());

    }
}
