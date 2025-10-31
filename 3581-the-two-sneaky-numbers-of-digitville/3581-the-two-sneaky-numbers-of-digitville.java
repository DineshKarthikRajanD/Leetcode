class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int res[] = new int [2];
        HashSet<Integer> set = new HashSet<>();
        int j = 0;

        for(int num : nums){
            if(map.get(num) == 2 && !set.contains(num)){
                res[j++] = num;
                set.add(num);
            }
            if(j == 2) break;
        }

        return res;
    }
}