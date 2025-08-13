class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        double i = 0, temp = 0; 
        while(temp <= n){
            temp = Math.pow(3, i);
            if(temp == n){
                return true;
            }
            i++;
        }
        return false;
    }
}