class Solution {
    public int numSub(String s) {
        long MOD = 1_000_000_007, count = 0, streak = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                streak++;
                count = (count + streak) % MOD;
            } else {
                streak = 0;
            }
        }

        return (int) count;
    }
}