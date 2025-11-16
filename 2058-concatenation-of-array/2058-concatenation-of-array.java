class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int res[] = new int [n * 2];
        for(int i=0;i<n;i++){
            res[i] = nums[i];
        }
        int j = n;
        for(int i=0;i<n;i++){
            res[j++] = nums[i];
        }
        return res;
    }
}