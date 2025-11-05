class Solution {
    public String firstPalindrome(String[] words) {
        int n = words.length;

        for(int i=0;i<n;i++){
            if(helper(words[i])){
                return words[i];
            }
        }

        return "";
    }

    public boolean helper(String str){
        int l = 0, r = str.length()-1;

        while(l <= r){
            if(str.charAt(l) == str.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}