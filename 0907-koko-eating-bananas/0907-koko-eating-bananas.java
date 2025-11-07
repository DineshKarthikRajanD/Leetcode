import java.util.*;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int res = right;

        while (left <= right) {
            int k = left + (right - left) / 2;
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += Math.ceil((double)piles[i] / k);
                if (sum > h) break;
            }

            if (sum <= h) {
                res = k;
                right = k - 1;
            } else {
                left = k + 1;
            }
        }

        return res;
    }
}
