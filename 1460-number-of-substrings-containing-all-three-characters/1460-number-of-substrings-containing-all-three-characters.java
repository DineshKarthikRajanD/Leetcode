class Solution {
    public int numberOfSubstrings(String s) {
        HashMap <Character,Integer> map = new HashMap<>();
        int n = s.length(),count=0,l=0,r=0;
        while(r < n){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.getOrDefault('a',0) > 0 && map.getOrDefault('b',0) > 0 && map.getOrDefault('c',0) > 0){
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                count += n - r;
                l++;
            }
            r++;
        }
        return count;
    }
}