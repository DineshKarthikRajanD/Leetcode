class Solution {
    public int countHomogenous(String s) {
        int n = s.length();
        long MOD = 1000000007, res = 0;
        List<String> list = new ArrayList<>();
        String temp = "" + s.charAt(0);

        for(int i=1;i<n;i++){
            if(s.charAt(i) == s.charAt(i-1)){
                temp += s.charAt(i);
            }
            else{
                list.add(temp);
                temp = "" + s.charAt(i);
            }
        }
        list.add(temp);

        for(int i=0;i<list.size();i++){
            long len = list.get(i).length();
            res += (len * (len + 1) / 2) %  MOD;
        }

        return (int)res;
    }
}