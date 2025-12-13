class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        int n = word.length();
        String temp = "";
        for(int i=0;i<n;i++){
            if(Character.isDigit(word.charAt(i))){
                temp += word.charAt(i);
            }
            else{
                if(!temp.isEmpty()){
                    temp = helper(temp);
                    set.add(temp);
                    temp = "";
                }
            }
        }
        if(!temp.isEmpty()){
            temp = helper(temp);
            set.add(temp);
        }
        return set.size();
    }
    public String helper(String str){
        int i = 0;
        while(i < str.length() - 1 && str.charAt(i) == '0'){
            i++;
        }
        return str.substring(i);
    }
}