class Solution {
    public int[][] generateMatrix(int n) {
        int res[][] = new int [n][n];
        int rs = 0, cs = 0, re = n - 1, ce = n - 1, summa = 1;

        while(rs <= re && cs <= ce){
            
            for(int i=cs;i<=ce;i++){
                res[rs][i] = summa++;
            }
            rs++;
            
            for(int i=rs;i<=re;i++){
                res[i][ce] = summa++;
            }
            ce--;

            if(re >= re){
                for(int i=ce;i>=cs;i--){
                    res[re][i] = summa++;
                }
                re--;
            }

            if(ce >= cs){
                for(int i=re;i>=rs;i--){
                    res[i][cs] = summa++;
                }
                cs++;
            }
        }
        
        return res;
    }
}