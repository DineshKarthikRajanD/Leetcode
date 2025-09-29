class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;

        Stack<Character> st = new Stack<>();
        boolean flag = false;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                flag = true;
                st.push(')');
            }
            else if(s.charAt(i) == '{'){
                flag = true;
                st.push('}');
            }
            else if(s.charAt(i) == '['){
                flag = true;
                st.push(']');
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                if(st.size() > 0){
                    if(st.peek() == s.charAt(i)){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        if(st.size() > 0) return false;
        if(flag) return true;
        return false;
    }
}