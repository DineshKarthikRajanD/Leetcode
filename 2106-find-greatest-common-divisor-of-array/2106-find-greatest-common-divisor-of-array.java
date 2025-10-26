class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        int a = Math.abs(max);
        int b = Math.abs(min);

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}