class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;

        // precompute cumulative shifts (from right to left)
        for (int i = n - 2; i >= 0; i--) {
            shifts[i] = (shifts[i] + shifts[i + 1]) % 26;
        }

        // use StringBuilder to avoid repeated string creation
        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < n; i++) {
            // reuse your helper logic for each position
            str.setCharAt(i, (char) helper(str.charAt(i), shifts[i]));
        }

        return str.toString();
    }

    // same shift logic, just for one character now
    public int helper(char ch, int num) {
        return (ch - 'a' + num) % 26 + 'a';
    }
}
