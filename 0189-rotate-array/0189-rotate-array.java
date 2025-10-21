class Solution {
    public void rotate(int[] nums, int k) {
        int l = 0, r = nums.length;
        k = k % r;

        reverse(nums, l, r);
        reverse(nums, l, k);
        reverse(nums, k, r);
    }
    public void reverse(int[] arr, int l, int r){
        r = r - 1;
        while(l <= r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}