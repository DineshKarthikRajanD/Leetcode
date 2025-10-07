class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=n;i++){
            while(j < n - 1 && nums[j] == nums[j+1]){
                j++;
            }
            if(j < n && nums[j] == i){
                j++;
            }
            else{
                list.add(i);
            }
        }
        return list;
    }
}