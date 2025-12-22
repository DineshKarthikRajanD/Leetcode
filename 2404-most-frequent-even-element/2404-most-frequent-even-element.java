class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(num % 2 == 0){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int max = 0, temp = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > max || (freq == max && num < temp)) {
                max = freq;
                temp = num;
            }
        }
        return temp;
    }
}