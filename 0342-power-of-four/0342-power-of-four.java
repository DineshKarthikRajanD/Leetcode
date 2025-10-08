class Solution {
    public boolean isPowerOfFour(int n) {
        int sum = 0;

        for(int i=0;Math.pow(4,i)<=n;i++){
            sum = (int) Math.pow(4, i);
            if(n == sum){
                return true;
            }
            sum = 0;
        }

        return false;
    }
}