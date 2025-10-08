class Solution {
    public int[] countBits(int n) {
        int arr[] = new int [n+1];

        for(int i=0;i<=n;i++){
            arr[i] = helper(i);
        }

        return arr;
    }

    public int helper(int num){
        String str = Integer.toBinaryString(num);
        int count = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        
        return count;
    }
}