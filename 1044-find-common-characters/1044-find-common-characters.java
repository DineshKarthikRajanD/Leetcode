class Solution {
    public List<String> commonChars(String[] words) {
        int minArr[] = new int[26];
        Arrays.fill(minArr, Integer.MAX_VALUE);
        for(int i=0;i<words.length;i++){
            int arr[] = new int[26];
            String str = words[i];
            for(char ch : str.toCharArray()){
                arr[ch - 'a']++;
            }
            for(int j=0;j<26;j++){
                minArr[j] = Math.min(minArr[j], arr[j]);
            }
        }
        List<String> list = new ArrayList<>();
        for(int i=0;i<26;i++){
            while(minArr[i] > 0){
                list.add(String.valueOf((char) (i + 'a')));
                minArr[i]--;
            }
        }
        return list;
    }
}