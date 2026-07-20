class Solution {
    public boolean isAnagram(String s, String t) {
        //take strings
        //sort them
        //if they are equal they are anagrams

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
}
