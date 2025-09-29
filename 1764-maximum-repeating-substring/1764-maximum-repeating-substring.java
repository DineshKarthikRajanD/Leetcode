class Solution {
    public int maxRepeating(String sequence, String word) {
        int res = 0;
        String temp = word;

        while(sequence.contains(temp)){
            res++;
            temp += word;
        }
        
        return res;
    }
}