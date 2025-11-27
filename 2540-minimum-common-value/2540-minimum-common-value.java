class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length, min = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < m; j++) {
            set.add(nums2[j]);
        }
        for (int i = 0; i < n; i++) {
            if (set.contains(nums1[i])) {
                return nums1[i];
            }
        }
        return min;
    }
}