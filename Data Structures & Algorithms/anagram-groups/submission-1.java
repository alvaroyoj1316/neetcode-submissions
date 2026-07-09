class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //we iterate throught the array strs

        //a word is an anagram if sorted has all the same letters

        //if it is part of the anagram, add it to a list

        //return a list of lists of type string


        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedS = new String(arr);
            map.putIfAbsent(sortedS, new ArrayList<String>());
            map.get(sortedS).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
