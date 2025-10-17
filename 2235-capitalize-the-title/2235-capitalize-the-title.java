class Solution {
    public String capitalizeTitle(String title) {
        String arr[] = title.split(" ");
        int n = arr.length;
        String res = "";

        for(int i=0;i<n;i++){
            if(arr[i].length() > 2){
                arr[i] = helper(arr[i]);
            }
            else{
                arr[i] = arr[i].toLowerCase();
            }
        }

        for(int i=0;i<n;i++){
            if(i == n-1){
                res += arr[i]; 
            }
            else{
                res += arr[i] + " ";
            }
        }

        return res;
    }

    public String helper(String str){
        char f = str.charAt(0);
        f = Character.toUpperCase(f);
        String sub = str.substring(1);
        sub = sub.toLowerCase();
        return f + sub;
    }
}