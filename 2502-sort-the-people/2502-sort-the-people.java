class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        boolean swap;

        for(int i=0;i<n-1;i++){
            swap = false;
            for(int j=0;j<n-i-1;j++){
                if(heights[j] < heights[j+1]){
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;
                    String t = names[j];
                    names[j] = names[j+1];
                    names[j+1] = t;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
        }

        return names;
    }
}