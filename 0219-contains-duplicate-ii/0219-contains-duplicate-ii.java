class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l=0,r=0,n=nums.length;
        while(r < n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            if(map.size() > k){
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                if(map.getOrDefault(nums[l],0) < 1){
                    map.remove(nums[l]);
                }
                l++;
            }
            if(map.getOrDefault(nums[r],0) > 1 && Math.abs(l-r) <= k){
                return true;
            }
            r++;
        }
        return false;
    }
}