class Solution {
    public String clearDigits(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length;
        StringBuilder str = new StringBuilder();

        for(int i=0;i<n;i++){
            if(Character.isDigit(arr[i])){
                str.deleteCharAt(str.length()-1);
            }
            else{
                str.append(arr[i]);
            }
        }

        return str.toString();
    }
}