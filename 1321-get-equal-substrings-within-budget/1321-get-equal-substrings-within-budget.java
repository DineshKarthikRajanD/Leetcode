class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length(), diff = 0, max = 0, l = 0, r = 0;

        while(r < n){
            diff += Math.abs(t.charAt(r) - s.charAt(r));

            while(diff > maxCost){
                diff -= Math.abs(t.charAt(l) - s.charAt(l));
                l++;
            }
            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}