class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, j = 0;
        int res[] = new int [n];
        for(int i=1;i<n;i+=2){
            res[j++] = nums[i];
            res[j++] = nums[i-1];
        }
        return res;
    }
}