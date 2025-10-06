class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = Integer.MIN_VALUE, res = 0;
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                res = i;
                max = arr[i];
            }
        }
        return res;
    }
}