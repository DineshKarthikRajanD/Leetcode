class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length, st = 1;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i > 0 && nums[i-1] == nums[i]){
                continue;
            }
            while(st < nums[i]){
                res.add(st);
                st++;
            }
            if(st == nums[i]){
                st++;
            }
        }
        while(st <= n){
            res.add(st);
            st++;
        }
        return res;
    }
}