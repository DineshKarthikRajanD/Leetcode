class Solution {
    public String convertToTitle(int columnNumber) {
        int res = 0, rem = 0;
        StringBuilder ans = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            rem = columnNumber % 26;
            ans.append((char)(rem + 'A'));
            columnNumber = columnNumber / 26; 
        }
        return ans.reverse().toString();
    }
}