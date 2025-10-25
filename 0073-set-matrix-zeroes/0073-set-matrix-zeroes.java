class Solution {

    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] res = new int[n][m];

        // Copy original matrix to res
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j] = matrix[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    helper(res, i, j);
                }
            }
        }

        // Copy res back to original matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = res[i][j];
            }
        }
    }

    public void helper(int[][] arr, int i, int j){
        int n = arr.length, m = arr[0].length;

        // Set entire row to 0
        for(int k=0;k<m;k++){
            arr[i][k] = 0;
        }

        // Set entire column to 0
        for(int k=0;k<n;k++){
            arr[k][j] = 0;
        }
    }
}
