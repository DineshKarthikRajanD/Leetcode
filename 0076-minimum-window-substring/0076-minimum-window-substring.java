class Solution {
    public String minWindow(String s, String t) {
        int l=0,r=0,n=t.length(),m=s.length(),stin=-1,minlen=Integer.MAX_VALUE,count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        while(r < m){
            if(map.getOrDefault(s.charAt(r),0) > 0){
                count++;
            }
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)-1);
            while(count == n){
                if((r-l+1) < minlen){
                    minlen = r-l+1;
                    stin = l;
                }
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)+1);
                if(map.getOrDefault(s.charAt(l),0) > 0){
                    count--;
                }
                l++;
            }
            r++;
        }
        return stin == -1 ? "" : s.substring(stin,stin+minlen);
    }
}