class Solution {
    public int[] findErrorNums(int[] nums) {
        int res[] = new int [2];
        Arrays.sort(nums);
        int s = 1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i > 0 && nums[i-1] == nums[i]){
                res[0] = nums[i];
            }
            if(nums[i] == s){
                s++;
            }
        }
        res[1] = s;
        return res;
    }
}