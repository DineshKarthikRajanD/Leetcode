class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }

        String ch2 = str.toString();
        String ch1 = str.reverse().toString();

        System.out.println(ch1);
        System.out.println(ch2);

        if(ch1.equals(ch2)) return true;
        else return false;
    }
}