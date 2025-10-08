class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] res = new int[rows * cols][2];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[index][0] = i;
                res[index][1] = j;
                index++;
            }
        }

        for (int i = 0; i < res.length - 1; i++) {
            for (int j = i + 1; j < res.length; j++) {
                int dist1 = Math.abs(res[i][0] - rCenter) + Math.abs(res[i][1] - cCenter);
                int dist2 = Math.abs(res[j][0] - rCenter) + Math.abs(res[j][1] - cCenter);

                if (dist1 > dist2) {
                    int temp0 = res[i][0];
                    int temp1 = res[i][1];
                    res[i][0] = res[j][0];
                    res[i][1] = res[j][1];
                    res[j][0] = temp0;
                    res[j][1] = temp1;
                }
            }
        }

        return res;
    }
}
