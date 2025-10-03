class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length - 3, r = nums.length - 1, f, s, t, sum = 0, res = 0;

        while(l >= 0){
            f = nums[l];
            s = nums[l+1];
            t = nums[r];
            sum = f + s;
            if(sum > t){
                res = sum + t;
                break;
            }
            l--;
            r--;
        }
        return res;
    }
}