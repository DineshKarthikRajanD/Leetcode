class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        Arrays.sort(strs);
        char first[] = strs[0].toCharArray();
        char last[] = strs[strs.length - 1].toCharArray();
        int n = first.length, m = last.length;

        for(int i=0;i<Math.min(n,m);i++){
            if(first[i] != last[i]) break;
            res += first[i];
        }

        return res;
    }
}