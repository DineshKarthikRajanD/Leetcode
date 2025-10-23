class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        int n = nums.length;

        for(int i=0;i<n;i++){
            int size = res.size();
            for(int j=0;j<size;j++){
                List<Integer> list = new ArrayList<>(res.get(j));
                list.add(nums[i]);
                res.add(list);
            }
        }

        return res;
    }
}