class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq = 0, changes = 0,maxlen=0,l=0;
        int arr[] = new int[26];
        for(int r=0;r<s.length();r++){
            arr[s.charAt(r) - 'A']++;
            maxfreq = Math.max(maxfreq,arr[s.charAt(r) - 'A']);
            changes = (r - l + 1) - maxfreq;
            if(changes > k){
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}