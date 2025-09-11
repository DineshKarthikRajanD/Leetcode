import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String str = "";
        int i = 0; 
        for(int n : num){
            str += n;
        }
        BigInteger bigNum = new BigInteger(str);
        BigInteger sum = bigNum.add(BigInteger.valueOf(k));
        ArrayList <Integer> list = new ArrayList<>();
        for(char c : sum.toString().toCharArray()){
            list.add(c - '0');
        }
        return list;
    }
}