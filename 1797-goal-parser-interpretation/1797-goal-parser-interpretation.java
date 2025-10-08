class Solution {
    public String interpret(String command) {
        int j = 0;
        boolean flag = false;
        String res = "";

        for(int i=0;i<command.length();i++){
            char ch = command.charAt(i);
            if(Character.isLetter(ch)){
                res += ch;
            }
            else if(ch == '('){
                if(command.charAt(i+1) == ')'){
                    res += 'o';
                    i++;
                }
                else{
                    j = i + 1;
                    while(command.charAt(j) != ')'){
                        res += command.charAt(j);
                        j++;
                    }
                    i = j;
                }
            }
        }
        return res;
    }
}