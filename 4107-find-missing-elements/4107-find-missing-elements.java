class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int s = nums[0], e = nums[n-1];
        for(int i=s;i<=e;i++){
            if(!helper(nums,i)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean helper(int[] arr, int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}