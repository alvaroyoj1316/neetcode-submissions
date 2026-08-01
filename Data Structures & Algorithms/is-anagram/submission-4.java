class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] ss = s.toCharArray();
        char[] st = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(st);
        if (Arrays.equals(ss, st)) {
            return true;
        }
        return false;
    }
}
