class Solution {
    public int reverseBits(int n) {
        String temp = Integer.toBinaryString(n);
        int j = temp.length()-1;
        String ch = "";

        for(int i=31;i>=0;i--){
            if(j >= 0){
                ch += temp.charAt(j);
                j--;
            }
            else{
                ch += '0';
            }
        }
        int res = (int) Long.parseLong(ch, 2);
        return res;
    }
}