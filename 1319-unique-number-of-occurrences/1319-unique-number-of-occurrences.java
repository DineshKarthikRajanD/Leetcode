class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        ArrayList<Integer> res = new ArrayList<>();

        for(int num : map.values()){
            res.add(num);
        }

        Collections.sort(res);

        for(int i=1;i<res.size();i++){
            if(res.get(i).equals(res.get(i-1))){
                return false;
            }
        }

        return true;
    }
}