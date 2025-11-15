class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, count = 0;
        while(true){
            if(helper(nums, k, i)){
                break;
            }
            else{
                i++;
                count++;
            }
        }
        return count;
    }
    public boolean helper(int[] arr, int k, int s){
        for(int i=s;i<arr.length;i++){
            if(arr[i] < k){
                return false;
            }
        }
        return true;
    }
}