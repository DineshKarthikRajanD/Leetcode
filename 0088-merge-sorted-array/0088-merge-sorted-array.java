import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[] = new int[nums1.length], j = 0, k = 0;

        for (int i = 0; i < m; i++) {
            res[j++] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            res[j++] = nums2[i];
        }

        Arrays.sort(res);

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = res[i];
        }
    }
}
