class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length(), count = 0, res = 0;

        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'R'){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                res++;
            }
        }

        return res;
    }
}