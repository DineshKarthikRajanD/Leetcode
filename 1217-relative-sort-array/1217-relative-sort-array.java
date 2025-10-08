class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        ArrayList<Integer> res = new ArrayList<>();
        boolean arr[] = new boolean [arr1.length];

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i] == arr1[j]){
                    res.add(arr1[j]);
                    arr[j] = true;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(!arr[i]){
                res.add(arr1[i]);
            }
        }
        int ans[] = new int [res.size()];

        for(int i=0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        
        return ans;
    }
}