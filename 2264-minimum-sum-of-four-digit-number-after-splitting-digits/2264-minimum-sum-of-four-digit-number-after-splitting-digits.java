class Solution {
    public int minimumSum(int num) {
        String str = String.valueOf(num);
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        String a = "" + arr[0] + arr[2];
        String b = "" + arr[1] + arr[3];
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}