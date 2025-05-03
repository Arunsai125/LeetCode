class Solution {
    public int countPoints(String rings) {
        int ans=0;
       Map<Integer,Set<Character>> map = new HashMap<>();
       for(int i=0;i<rings.length()-1;i+=2){
            int rodNumber = rings.charAt(i+1) -'0';
            char color = rings.charAt(i);
            if(!map.containsKey(rodNumber)){
                Set<Character> list = new HashSet<>();
                map.put(rodNumber,list);
            }
            map.get(rodNumber).add(color);
       }
       for(int key : map.keySet()){
            if(map.get(key).size()==3) ans++;
       }
    return ans;
    }
}