class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length;
        int l = 0, r = n - 1;

        while(l < r){
            while(l < r && !helper(arr[l])){
                l++;
            }
            while(l < r && !helper(arr[r])){
                r--;
            }
            if(helper(arr[l]) && helper(arr[r])){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        return new String(arr);
    }

    public boolean helper(char ch){
        ch = Character.toLowerCase(ch);
        String str = "aeiou";
        if(str.contains(ch+"")) return true;
        else return false;
    }
}