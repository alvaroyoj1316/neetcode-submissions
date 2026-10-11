class Solution {
    public boolean isPalindrome(String s) {
        int l = 0; 
        int r = s.length() - 1;

        while (l < r) {
            Character lChar = s.toLowerCase().charAt(l);
            Character rChar = s.toLowerCase().charAt(r);
            if (!Character.isLetterOrDigit(lChar)) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(rChar)) {
                r--;
                continue;
            }
            if(!lChar.equals(rChar)) return false;
            l++;
            r--;
        }
        return true;
    }
}
