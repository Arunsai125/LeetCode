class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int leastCount=Integer.MAX_VALUE;
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                map2.put(list2[i],map.get(list2[i])+i);
                leastCount = Math.min(leastCount, map.get(list2[i])+i);
            }
        }
        List<String> ans = new ArrayList<>();
        for(String key : map2.keySet()){
            if(map2.get(key)==leastCount) ans.add(key);
        }
        String res[] = new String[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i] = ans.get(i);
        }
    return res;
    }
}