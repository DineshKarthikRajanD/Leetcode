class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        String res = "";
        boolean flag = true;
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '6' && flag){
                res += '9';
                flag = false;
            }
            else{
                res += str.charAt(i);
            }
        }

        return Integer.parseInt(res);
    }
}