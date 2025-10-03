class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }

        int res[] = new int [nums.length];
        int j = 0;

        for(int i=0;i<list1.size();i++){
            res[j++] = list1.get(i);
            res[j++] = list2.get(i);
        }

        return res;
    }
}