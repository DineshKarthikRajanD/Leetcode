class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length(), m = word2.length(), i = 0;
        String res = "";

        for(i=0;i<Math.min(n,m);i++){
            res += word1.charAt(i);
            res += word2.charAt(i);
        }
        System.out.print(i+" "+n);
        if(i != n){
            for(int j=i;j<n;j++){
                res += word1.charAt(j);
            }
        }
        else if(i != m){
            for(int j=i;j<m;j++){
                res += word2.charAt(j);
            }
        }
        else{
            return res;
        }
        return res;
    }
}