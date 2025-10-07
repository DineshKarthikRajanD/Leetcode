class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(find(arr[j]) > find(arr[j+1]) || (find(arr[j]) == find(arr[j + 1]) && arr[j] > arr[j + 1])){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public int find(int num){
        String str = Integer.toBinaryString(num);
        int c = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                c++;
            }
        }
        return c;
    }
}