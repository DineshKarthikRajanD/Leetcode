class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder res = new StringBuilder();
        int n = word.length(), i = 0;
        Boolean flag = false;

        for(i=0;i<n;i++){
            if(word.charAt(i) != ch){
                res.append(word.charAt(i));
            }
            else{
                flag = true;
                res.append(word.charAt(i));
                break;
            }
        }

        if(flag){
            String ans =  res.reverse().toString();
            for(int j=i+1;j<n;j++){
                ans += word.charAt(j);
            }
            return ans;
        }
        else{
            return res.toString();
        }
    }
}