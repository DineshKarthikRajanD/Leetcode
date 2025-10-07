class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int ch = arr[0] - arr[1];
        System.out.print(ch);
        int c = 1, sum = 0;

        for(int i=2;i<arr.length;i++){
            sum = arr[i-1] - arr[i];
            System.out.println(sum);
            if(ch == sum){
                c++;
            }
        }
        if(c == arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}