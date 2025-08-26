class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int [nums.length * 2];
        int j = 0, k = 0;
        while(j < 2){
            for(int i=0;i<nums.length;i++){
                ans[k++] = nums[i];
            }
            j++;
        }
        return ans;
    }
}