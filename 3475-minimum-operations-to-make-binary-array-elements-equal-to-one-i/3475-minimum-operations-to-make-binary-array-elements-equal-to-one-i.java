class Solution {
    public int minOperations(int[] nums) {
        int l=0,r=0,n=nums.length,count=0;
        while(r <= n - 3){
            if(nums[r] == 0){
                l = r;
                while(l <= r + 2){
                    nums[l] = 1 - nums[l];
                    l++;
                }
                count++;
            }
            r++;
        }
        for (int num : nums) {
            if (num == 0) return -1;
        }
        return count;
    }
}