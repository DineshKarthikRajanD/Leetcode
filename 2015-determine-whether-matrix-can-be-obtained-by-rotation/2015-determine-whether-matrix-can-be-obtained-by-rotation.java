class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(isEquals(mat, target)) return true;
        
        int n = mat.length;
        for(int k=0;k<3;k++){
            int res[][] = new int [n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    res[i][j] = mat[j][n - 1 - i];
                }
            }
            if(isEquals(res, target)) return true;
            mat = res; 
        }
        return false;
    }
    public boolean isEquals(int a[][], int b[][]){
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j] != b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}