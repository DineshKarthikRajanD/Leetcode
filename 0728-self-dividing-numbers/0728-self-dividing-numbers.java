class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();

        for(int i=left;i<=right;i++){
            if(i % 10 != 0){
                if(helper(i)){
                    res.add(i);
                }
            }
        }

        return res;
    }

    public boolean helper(int n){
        String str = String.valueOf(n);
        for(int i=0;i<str.length();i++){
            int temp = str.charAt(i) - '0';
            if(temp == 0 || n % temp != 0) return false;
        }
        return true;
    }
}