class Solution {
    public int fib(int n) {
        return helper(0, 1, n);
    }
    public int helper(int a, int b, int n){
        if(n == 0) return a;
        return helper(b, a+b, n-1);
    }
}