class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i=0;i<items.size();i++){
            List<String> newList = items.get(i);
            if(ruleKey.equals("type")){
                if(newList.get(0).equals(ruleValue)){
                    count++;
                }
            }
            else if(ruleKey.equals("color")){
                if(newList.get(1).equals(ruleValue)){
                    count++;
                }
            }
            else{
                if(newList.get(2).equals(ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }
}