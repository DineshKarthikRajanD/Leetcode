class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;

        for(int i=left;i<=right;i++){
            if(helper(i)){
                count++;
            }
        }
        return count;
    }
    public boolean helper(int num){
        String str = Integer.toBinaryString(num);
        int n = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                n++;
            }
        }

        int ch = 0;

        for(int i=1;i<=n;i++){
            if(n % i == 0){
                ch++;
            }
        }
        if(ch == 2) return true;
        else return false;
    }
}