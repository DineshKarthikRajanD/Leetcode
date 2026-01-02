class Solution {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length;
        int n = len / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int i=0;i<len;i++){
            if(map.get(nums[i]) == n){
                return nums[i];
            }
        }
        return -1;
    }
}