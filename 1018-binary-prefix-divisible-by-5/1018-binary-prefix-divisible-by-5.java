class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(helper(nums, i)){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }

        return res;
    }
    public boolean helper(int[] nums, int len){
        int value = 0;

        for(int i = 0; i <= len; i++){
            value = (value * 2 + nums[i]) % 5;
        }

        return value == 0;
    }
}