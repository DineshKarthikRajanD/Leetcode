class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length, min = Integer.MAX_VALUE, res = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                res = Math.abs(i - start);
                min = Math.min(min, res);
            }
        }
        return min;
    }
}