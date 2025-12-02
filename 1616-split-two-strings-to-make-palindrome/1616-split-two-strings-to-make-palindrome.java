class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    private boolean check(String a, String b) {
        int l = 0, r = a.length() - 1;

        // Move while characters match
        while (l < r && a.charAt(l) == b.charAt(r)) {
            l++;
            r--;
        }

        // Now either a[l..r] or b[l..r] must be palindrome
        return isPal(a, l, r) || isPal(b, l, r);
    }

    private boolean isPal(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
