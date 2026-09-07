class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            Character left = s.toLowerCase().charAt(l);
            Character right = s.toLowerCase().charAt(r);

            if (!Character.isLetterOrDigit(left)) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                r--;
                continue;
            }

            if (!left.equals(right)) {
                return false;
            }
            l++;
            r--;
            
        }
        return true;
    }
}
