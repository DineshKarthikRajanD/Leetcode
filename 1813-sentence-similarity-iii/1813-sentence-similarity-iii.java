class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String arr1[], arr2[];
        if(sentence1.length() > sentence2.length()){
            arr1 = sentence1.split(" ");
            arr2 = sentence2.split(" ");
        }
        else{
            arr1 = sentence2.split(" ");
            arr2 = sentence1.split(" ");
        }
        int l1 = 0, l2 = 0, r1 = arr1.length-1, r2 = arr2.length-1;
        while(l2 <= r2 && arr1[l1].equals(arr2[l2])){
            l1++;
            l2++;
        }
        while(l2 <= r2 && arr1[r1].equals(arr2[r2])){
            r1--;
            r2--;
        }
        return l2 > r2;
    }
}