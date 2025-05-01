class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            map1.put(ch1,i);
            map2.put(ch2,i);
        }
        int ans=0;
        for(char ch : map1.keySet()){
            ans += Math.abs(map1.get(ch)-map2.get(ch));
        }
    return ans;
    }
}