class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int res[] = new int [n+1];
        res[0] = first;
        int j = 0;

        for(int i=0;i<n;i++){
            int temp = res[j++] ^ encoded[i];
            res[j] = temp;
        }

        return res;
    }
}