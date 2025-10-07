class Solution {
    public int specialArray(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int  i=0;i<nums.length;i++){
            max = Math.max(max, nums[i]);
        }

        for(int i=0;i<=max;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(i <= nums[j]){
                    list.add(nums[j]);
                }
            }
            if(i == list.size()){
                return i;
            }
        }
        return -1;
    }
}