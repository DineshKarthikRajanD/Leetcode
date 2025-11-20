class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;

        if(k == 0) return true;

        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                if(!helper(nums, k, i)){
                    return false;
                }
            }
        }
        
        return true;
    }
    public boolean helper(int[] arr, int k, int pos){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == 1 && pos != i){
                if(Math.abs((i+1) - pos) < k){
                    return false;
                }
            }
        }
        return true;
    }
}