class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        } 
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list, Collections.reverseOrder());
        return list.size() >= 3 ? list.get(2) : list.get(0);
    }
}