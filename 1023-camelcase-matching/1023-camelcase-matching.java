class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();
        int n = queries.length;

        for(int i=0;i<n;i++){
            if(helper(queries[i], pattern)){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }

        return res;
    }

    public boolean helper(String str, String pattern){
        int i = 0, j = 0, n = str.length();
        while(i < n){
            char ch = str.charAt(i);
            if(j < pattern.length() && str.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }
            else if(Character.isLowerCase(ch)){
                i++;
            }
            else{
                return false;
            }
        }
        return j == pattern.length();
    }
}