class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length, count = 0;
        int res[] = new int [n];
        for(int i=0;i<n;i++){
            int num = nums[i];
            for(int j=0;j<n;j++){
                if(j !=  i && nums[j] < nums[i]){
                    count++;
                }
            }
            res[i] = count;
            count = 0;
        }
        return res;
    }
}