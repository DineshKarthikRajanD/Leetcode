class Solution {
    public int countSegments(String s) {
        if(s.isEmpty()){
            return 0;
        }
        String arr[] = s.split(" ");
        int count = 0;
        
        for(int i=0;i<arr.length;i++){
            String temp = arr[i];
            if(!temp.isEmpty()){
                count++;
            }
        }

        return count;
    }
}