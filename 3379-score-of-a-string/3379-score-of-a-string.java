class Solution {
    public int scoreOfString(String s) {
        int temp = 0, sum = 0;
        for(int i=1;i<s.length();i++){
            temp = Math.abs(s.charAt(i - 1) - s.charAt(i));
            sum += temp;
        }
        return sum;
    }
}