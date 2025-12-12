class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            set.add(num);
        }
        for(int num : set){
            if(map.get(num) == 1){
                sum += num;
            }
        }
        return sum;
    }
}