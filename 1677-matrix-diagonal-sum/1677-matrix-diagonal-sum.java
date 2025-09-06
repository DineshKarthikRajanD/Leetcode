class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j || i == (n - 1) - j){
                    System.out.println(mat[i][j]);
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}