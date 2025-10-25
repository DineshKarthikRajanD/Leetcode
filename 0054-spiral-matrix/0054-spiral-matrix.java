class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int r = 0, c = 0, re = matrix.length-1, ce = matrix[0].length-1;

        while(re >= r && ce >= c){
            for(int i=c;i<=ce;i++){
                res.add(matrix[r][i]);
            }
            r++;
            for(int i=r;i<=re;i++){
                res.add(matrix[i][ce]);
            }
            ce--;
            if(re >= r){
                for(int i=ce;i>=c;i--){
                    res.add(matrix[re][i]);
                }
                re--;
            }
            if(ce >= c){
                for(int i=re;i>=r;i--){
                    res.add(matrix[i][c]);
                }
                c++;
            }
        }

        return res;
    }
}