class Solution {
    public String convertDateToBinary(String date) {
        String res = "";
        String arr[] = date.split("-");
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(i != n - 1){
                res += Integer.toBinaryString(Integer.parseInt(arr[i])) + "-";
            }
            else{
                res += Integer.toBinaryString(Integer.parseInt(arr[i]));
            }
        }
        return res;
    }
}