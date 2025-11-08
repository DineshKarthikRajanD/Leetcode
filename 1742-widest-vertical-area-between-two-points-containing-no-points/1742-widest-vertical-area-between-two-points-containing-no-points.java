class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length, diff = 0, max = 0;
        int arr[] = new int [n];

        for(int i=0;i<n;i++){
            arr[i] = points[i][0];
        }

        Arrays.sort(arr);

        for(int i=1;i<n;i++){
            diff = arr[i] - arr[i-1];
            max = Math.max(max, diff);
        }

        return max;
    }
}