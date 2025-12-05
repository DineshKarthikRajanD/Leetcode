class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length, sum = 0, count = 0, lSum = 0, rSum = 0;

        for(int num : nums){
            sum += num;
        }

        for(int i=0;i<n-1;i++){
            lSum += nums[i];
            rSum = sum - lSum;
            if((lSum % 2 == 0 && rSum % 2 == 0) || (lSum % 2 != 0 && rSum % 2 != 0)){
                count++;
            }
        }

        return count;
    }
}