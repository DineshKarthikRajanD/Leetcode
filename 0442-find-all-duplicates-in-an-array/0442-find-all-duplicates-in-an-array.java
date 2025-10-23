class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        ArrayList<Integer> res = new ArrayList<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            if(map.get(nums[i]) > 1){
                res.add(nums[i]);
                i = i + 1;
            }
        }

        return res;
    }
}