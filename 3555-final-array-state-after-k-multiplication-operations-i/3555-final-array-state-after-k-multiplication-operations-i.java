class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        for(int i=0;i<k;i++){
            int index = helper(nums);
            nums[index] = nums[index] * multiplier;
        }
        return nums;
    }
    public int helper(int[] nums){
        int n = nums.length;
        int arr[] = Arrays.copyOf(nums, n);
        Arrays.sort(arr);
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(min == nums[i]) return i;
        }
        return 0;
    }
}