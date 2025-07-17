class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal) - atMost(nums,goal-1);
    }
    public int atMost(int[] nums,int goal){
        if(goal < 0){
            return 0;
        }
        int n = nums.length,l=0,r=0,count=0,sum=0;
        while(r < n){
            sum += nums[r];
            while(sum > goal){
                sum -= nums[l++];
            }
            count += r-l+1;
            r++;
        }
        return count;
    }
}