class Solution {
    public int countDigits(int num) {
        String str = String.valueOf(num);
        int count = 0;
        boolean flag = false;

        for(int i=0;i<str.length();i++){
            int n = str.charAt(i) - '0';
            if(num % n == 0){
                count++;
                flag = true;
            }
        }
        return flag ? count : 0;
    }
}