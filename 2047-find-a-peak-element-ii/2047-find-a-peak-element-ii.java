class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int arr[] = new int [2];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(helper(mat, i, j)){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }

        return arr;
    }

    public boolean helper(int[][] arr, int i, int j){
        int num = arr[i][j];
        int n = arr.length, m = arr[0].length, count = 0;

        if(j+1 >= m || arr[i][j+1] < num) count++;
        if(i+1 >= n || arr[i+1][j] < num) count++;
        if(j-1 < 0 || arr[i][j-1] < num) count++;
        if(i-1 < 0 || arr[i-1][j] < num) count++;

        return count == 4 ? true : false;
    }
}