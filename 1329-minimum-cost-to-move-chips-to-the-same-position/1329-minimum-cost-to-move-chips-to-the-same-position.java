class Solution {
    public int minCostToMoveChips(int[] position) {
        int min = Integer.MAX_VALUE, cost = 0;
        for(int i=0;i<position.length;i++){
            for(int j=0;j<position.length;j++){
                if(Math.abs((position[j] - position[i])) % 2 == 0){
                    cost += 0;
                    System.out.println(cost);
                }
                else{
                    cost += 1;
                }
            }
            min = Math.min(min, cost);
            cost = 0;
        }
        return min;
    }
}