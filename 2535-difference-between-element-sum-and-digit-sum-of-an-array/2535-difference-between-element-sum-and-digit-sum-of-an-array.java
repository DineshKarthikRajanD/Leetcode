class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length, eSum = 0, dSum = 0;

        for(int i=0;i<n;i++){
            eSum += nums[i];
            dSum += helper(nums[i]);
        }

        return Math.abs(eSum - dSum);
    }

    public int helper(int num){
        String str = String.valueOf(num);
        int sum = 0;
        for(int i=0;i<str.length();i++){
            sum += str.charAt(i) - '0';
        }
        return sum;
    }
}