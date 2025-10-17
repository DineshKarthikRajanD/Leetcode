class Solution {
    public char findTheDifference(String s, String t) {
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        int i = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return arr2[i];
            }
        }

        return arr2[i];
    }
}