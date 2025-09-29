class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                for(int j=i+1;j<n;j++){
                    if(s.charAt(j) == '1' && s.charAt(j - 1) == '0') return false;
                }
            }
        }
        return true;
    }
}