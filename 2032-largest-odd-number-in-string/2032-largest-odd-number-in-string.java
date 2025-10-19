class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();

        for(int i=0;i<len;i++){
            String temp = num.substring(0, len - i);
            char l = temp.charAt(temp.length() - 1);
            if((l - '0') % 2 != 0){
                return temp;
            }
        }
        return "";
    }
}