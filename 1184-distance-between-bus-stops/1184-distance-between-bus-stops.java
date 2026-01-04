class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int totSum = 0, sum = 0, n = distance.length;
        for(int i=0;i<n;i++){
            totSum += distance[i];
        }
        if(start > destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        for(int i=start;i<destination;i++){
            sum += distance[i];
        }
        System.out.println(sum);
        int cunt = totSum - sum;
        return Math.min(cunt, sum);
    }
}