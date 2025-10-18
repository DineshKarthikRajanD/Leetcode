class Solution {
    public boolean findSubarrays(int[] nums) {
        int sum1 = 0, sum2 = 0, n = nums.length;

        for(int i=0;i<n-1;i++){
            sum1 = nums[i] + nums[i+1];
            for(int j=i+1;j<n-1;j++){
                sum2 = nums[j] + nums[j+1];
                if(sum1 == sum2){
                    return true;
                }
            }
        }

        return false;
    }
}