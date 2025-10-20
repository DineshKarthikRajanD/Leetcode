class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(n != 1){
            set.add(n);
            n = helper(n);
            if(set.contains(n)){
                return false;
            }
        }
        return true;
    }
    public int helper(int num){
        String str = String.valueOf(num);
        int sum = 0;
        for(int i=0;i<str.length();i++){
            sum += (int)Math.pow((str.charAt(i) - '0'), 2);
        }
        return sum;
    }
}