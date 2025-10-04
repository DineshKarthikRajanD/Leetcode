class Solution {
    public int maxProduct(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum = (nums[i] - 1) * (nums[j] - 1);
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}