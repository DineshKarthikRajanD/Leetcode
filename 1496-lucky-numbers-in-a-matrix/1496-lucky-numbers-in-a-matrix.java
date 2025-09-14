class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        HashSet<Integer> max = new HashSet<>();
        HashSet<Integer> min = new HashSet<>();
        for(int mat[] : matrix){
            int rowMin = mat[0];
            for(int i=0;i<mat.length;i++){
                rowMin = Math.min(rowMin, mat[i]);
            }
            min.add(rowMin);
            System.out.println(rowMin);
        }

        for(int i=0;i<n;i++){
            int colMax = matrix[0][i];
            for(int j=0;j<m;j++){
                colMax = Math.max(colMax, matrix[j][i]);
            }
            max.add(colMax);
            System.out.println(colMax);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(min.contains(matrix[i][j]) && max.contains(matrix[i][j])){
                    res.add(matrix[i][j]);
                }
            }
        }
        return res;
    }
}