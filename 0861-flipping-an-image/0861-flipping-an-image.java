class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int res[][] = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0,l=n-1;j<n;j++,l--){
                res[i][j] = image[i][l];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][j] = 1 - res[i][j];
            }
        }
        return res;
    }
}