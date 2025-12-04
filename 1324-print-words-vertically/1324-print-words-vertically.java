class Solution {
    public List<String> printVertically(String s) {
        List<String> res = new ArrayList<>();
        String arr[] = s.split(" ");
        int max = arr[0].length();

        for(int i=0;i<arr.length;i++){
            if(arr[i].length() > max){
                max = arr[i].length();
            }
        }

        for(int i=0;i<max;i++){
            String temp = "";
            for(String str : arr){
                if(i < str.length()){
                    temp += str.charAt(i);
                }
                else{
                    temp += " ";
                }
            }
            temp = temp.replaceAll("\\s+$", "");
            res.add(temp);
        }
        return res;
    }
}