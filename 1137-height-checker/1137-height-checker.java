class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length, count = 0;
        int check[] = new int [n];

        for(int i=0;i<n;i++){
            check[i] = heights[i];
        }

        Arrays.sort(check);

        for(int i=0;i<n;i++){
            if(check[i] != heights[i]){
                count++;
            }
        }

        return count;
    }
}