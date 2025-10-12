class Solution {
    public int titleToNumber(String columnTitle) {
        int temp = 0, sum = 0;

        for(int i=0;i<columnTitle.length();i++){
            sum = temp * 26 + (columnTitle.charAt(i) - '@');
            temp = sum;
        }

        return sum;
    }
}