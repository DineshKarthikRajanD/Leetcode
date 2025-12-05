class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int left = 0, right = removable.length, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isSubsequenceAfterRemoval(s, p, removable, mid)) {
                ans = mid;
                left = mid + 1;   // try to remove more
            } else {
                right = mid - 1;  // remove less
            }
        }
        return ans;
    }

    private boolean isSubsequenceAfterRemoval(String s, String p, int[] removable, int k) {
        // mark removed indices
        boolean[] removed = new boolean[s.length()];
        for (int i = 0; i < k; i++) {
            removed[removable[i]] = true;
        }

        int j = 0; // pointer for p

        for (int i = 0; i < s.length() && j < p.length(); i++) {
            if (!removed[i] && s.charAt(i) == p.charAt(j)) {
                j++;
            }
        }
        return j == p.length(); // subsequence matched
    }
}
