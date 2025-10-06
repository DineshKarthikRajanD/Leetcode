class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int [2];
        boolean flag = false;

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if((numbers[i]+numbers[j]) == target){
                    res[0] = i+1;
                    res[1] = j+1;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return res;
    }
}