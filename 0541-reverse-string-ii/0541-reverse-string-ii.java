class Solution {
    public String str = "";
    public String reverseStr(String s, int k) {
        int n = s.length();
        for(int i=0;i<n;i+=2*k){
            String temp = s.substring(i, Math.min(i + k, n));
            helper(temp);
            if (i + k < n) {
                str += s.substring(i + k, Math.min(i + 2 * k, n));
            }
        }
        return str;
    }
    public void helper(String s){
        StringBuilder sam = new StringBuilder(s);
        sam.reverse();
        str += sam.toString();
    }
}