// class Pair{
//     private int startIndex;
//     private int endIndex;
//     public Pair(int startIndex, int endIndex){
//         this.startIndex = startIndex;
//         this.endIndex = endIndex;
//     }
//     public int getStartIndex(){
//         return this.startIndex;
//     }
//     public int getEndIndex(){
//         return this.endIndex;
//     }
// }

class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        Map<Character, int[]> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)) map.put(ch, i);
            else map2.put(ch, new int[]{map.get(ch), i});
        }
        for(char ch : map2.keySet()){
            int[] arr = map2.get(ch);
            Set<Character> set = new HashSet<>();
            for(int i=arr[0]+1;i<=arr[1]-1;i++) set.add(s.charAt(i));
            ans += set.size();
        }
    return ans;
    }
}