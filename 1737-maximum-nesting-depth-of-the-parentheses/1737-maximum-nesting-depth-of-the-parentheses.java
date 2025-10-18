class Solution {
    public int maxDepth(String s) {
        int max = 0, count = 0, n = s.length();

        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                count++;
                max = Math.max(max, count);
            }
            else if(s.charAt(i) == ')'){
                count--;
            }
        }

        return max;
    }
}