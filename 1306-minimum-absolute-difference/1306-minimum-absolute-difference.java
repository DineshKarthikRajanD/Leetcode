class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for(int i=1;i<arr.length;i++){
            int diff = Math.abs(arr[i] - arr[i-1]);
            min = Math.min(min, diff);
        }
        for(int i=1;i<arr.length;i++){
            int diff = Math.abs(arr[i] - arr[i-1]);
            if(diff == min){
                ArrayList<Integer> res = new ArrayList<>();
                res.add(arr[i-1]);
                res.add(arr[i]);
                list.add(res);
            }
        }
        return list;
    }
}