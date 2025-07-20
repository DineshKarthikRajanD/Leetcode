class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int l=0,r=0,n=nums.length,res=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        while(r < n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size() == set.size()){
                res += n - r;
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                if(map.getOrDefault(nums[l],0) < 1){
                    map.remove(nums[l]);
                }
                l++;
            }
            r++;
        }
        return res;
    }
}