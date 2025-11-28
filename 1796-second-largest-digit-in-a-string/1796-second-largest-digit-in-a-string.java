class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> set = new HashSet<>();
        int max = -1, sMax = -1, n = s.length();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                set.add(ch - '0');
            }
        }
        for(int num : set){
            if(num > max){
                sMax = max;
                max = num;
            }
        }
        return sMax;
    }
}