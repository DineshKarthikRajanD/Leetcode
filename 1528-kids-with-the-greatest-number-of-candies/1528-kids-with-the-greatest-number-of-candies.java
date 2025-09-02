class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max = Math.max(candies[i],max);
        }
        ArrayList<Boolean> res = new ArrayList<>();
        for(int val : candies){
            res.add((val+extraCandies) >= max);
        }
        return res;
    }
}