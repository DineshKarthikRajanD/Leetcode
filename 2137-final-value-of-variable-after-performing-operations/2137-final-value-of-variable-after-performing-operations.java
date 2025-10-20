class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0, n = operations.length;

        for(int i=0;i<n;i++){
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                x += 1;
            }
            // else if(operations[i] == "++X"){
            //     ++x;
            // }
            else if(operations[i].equals("--X") || operations[i].equals("X--")){
                x -= 1;
            }
            // else if(operations[i] == "X--"){
            //     x--;
            // }
        }
        return x;
    }
}