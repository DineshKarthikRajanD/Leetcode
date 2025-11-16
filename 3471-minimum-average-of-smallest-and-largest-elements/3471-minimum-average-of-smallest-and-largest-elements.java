class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Double> list = new ArrayList<>();
        for(int i=0,j=n-1;i<n/2;i++,j--){
            double avg = (nums[i] + nums[j]) / 2.0;
            list.add(avg);
        }
        Collections.sort(list);
        return list.get(0);
    }
}