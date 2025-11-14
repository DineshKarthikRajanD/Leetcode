class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, j = 0;
        int res[] = new int [n];
        for(int i=1;i<n;i+=2){
            int temp =  nums[i-1];
            nums[i-1] = nums[i];
            nums[i] = temp;
            res[j++] = nums[i-1];
            res[j++] = nums[i];
        }
        return res;
    }
}