class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        String check1, check2;
        check1 = str.toString();
        check2 = rev(check1);
        if (check1.equals(check2)) return true;

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                // Try skipping either left or right
                String s1 = s.substring(left + 1, right + 1); // skip left
                String s2 = s.substring(left, right);         // skip right
                return s1.equals(rev(s1)) || s2.equals(rev(s2));
            }
        }
        return true;
    }

    public static String rev(String str) {
        StringBuilder sam = new StringBuilder(str);
        return sam.reverse().toString();
    }
}
