class Solution {
    public int countOperations(int num1, int num2) {
        boolean flag = true;
        int count = 0;
        if (num1 == 0 || num2 == 0) return 0;
        while(flag){
            if(num1 >= num2) num1 = num1 - num2;
            else num2 = num2 - num1;
            count++;
            if(num1 == 0 || num2 == 0) flag = false;
        }
        return count;
    }
}