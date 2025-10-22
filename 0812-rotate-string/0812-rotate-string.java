class Solution {
    public boolean rotateString(String s, String goal) {
        char arr[] = s.toCharArray();
        int n = arr.length;

        for(int i=0;i<n;i++){
            String temp = helper(arr);
            if(temp.equals(goal)) return true;
            arr = temp.toCharArray();
        }

        return false;
    }
    public String helper(char[] arr){
        int n = arr.length;
        char t = arr[0];
        for(int j=0;j<n-1;j++){
            arr[j] = arr[j+1];
        }
        arr[n-1] = t;
        return new String(arr);
    }
}