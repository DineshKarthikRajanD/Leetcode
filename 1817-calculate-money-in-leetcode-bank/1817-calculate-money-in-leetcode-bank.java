class Solution {
    public int totalMoney(int n) {
        int k = 1, j = 1, sum = 0;

        for(int i=1;i<=n;i++){
            sum += j;
            if(i % 7 == 0){
                k++;
                j = k; 
            }
            else{
                System.out.println(j);
                j++;
            }
        }
        
        return sum;
    }
}