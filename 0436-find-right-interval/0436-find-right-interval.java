class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int res[] = new int [n];

        for(int i=0;i<n;i++){
            res[i] = (helper(intervals, intervals[i][1]));
        }

        return res;
    }

    public int helper(int[][] arr, int num){
        int n = arr.length, min = Integer.MAX_VALUE, res = -1;
        
        for(int i=0;i<n;i++){
            if(arr[i][0] >= num && min > arr[i][0]){
                min = arr[i][0];
                res = i;
            }
        }

        return res;
    }
}