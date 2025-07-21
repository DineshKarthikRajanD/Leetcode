class Solution {
    public long countSubarrays(int[] nums, int k) {
        int l=0,r=0,n=nums.length,freq=0,max=Integer.MIN_VALUE;
        long res = 0;
        for(int num : nums){
            max = Math.max(max,num);
        }
        while(r < n){
            if(max == nums[r]){
                freq++;
            }
            while(freq >= k){
                if(nums[l] == max){
                    freq--;
                }
                res += n - r;
                l++;
            }
            r++;
        }
        return res;
    }
}