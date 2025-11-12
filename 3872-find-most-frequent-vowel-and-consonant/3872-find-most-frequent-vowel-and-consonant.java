class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        int n = s.length();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            set.add(ch);
        }
        String str = "aeiou";
        int max1 = 0, max2 = 0;
        for(char ch : set){
            if(str.contains(ch+"") && max1 < map.get(ch)){
                max1 = map.get(ch);
            }
            else if(!str.contains(ch+"") && max2 < map.get(ch)){
                max2 = map.get(ch);
            }
        }
        return max1 + max2;
    }
}