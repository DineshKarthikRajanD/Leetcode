class Solution {
    public int[] sumZero(int n) {
        int l = 0, r = n - 1, j = -1, k = 1;
        int res[] = new int [n];
        if(n % 2 != 0) res[n / 2] = 0;
        while(l < r){
            res[l] = j--;
            res[r] = k++;
            l++;
            r--;
        }
        return res;
    }
}