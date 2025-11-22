class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0, n = nums.length;

        for(int i=0;i<n;i++){
            res += Math.min((nums[i] % 3), 3 - (nums[i] % 3));
        }

        return res;
    }
}