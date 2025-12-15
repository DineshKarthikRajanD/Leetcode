class Solution {
    public int numTilePossibilities(String tiles) {
        int freq[] = new int [26];
        for(char ch : tiles.toCharArray()){
            freq[ch - 'A']++;
        }
        return helper(freq);
    }
    public int helper(int[] arr){
        int count = 0;
        for(int i=0;i<26;i++){
            if(arr[i] > 0){
                count++;
                arr[i]--;
                count += helper(arr);
                arr[i]++;
            }
        }
        return count;
    }
}