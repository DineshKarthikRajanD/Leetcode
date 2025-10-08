class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int count[] = new int [n+1];

        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }

        int res[] = new int [2];

        for(int i=1;i<count.length;i++){
            if(count[i] > 1){
                res[0] = i;
            }
            else if(count[i] == 0){
                res[1] = i;
            }
        }
        return res;
    }
}