class Solution {
    public int mirrorFrequency(String s) {
        int ans=0;
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
        Set<Character> seen = new HashSet<>();
        for(char ch : s.toCharArray()){
            char m = findMirrorCharacter(ch);
            if(seen.contains(ch) || seen.contains(m)) continue;
            seen.add(ch);
            ans += Math.abs(map.get(ch) - (map.containsKey(m) ? map.get(m) : 0));
        }
    return ans;
    }
    public char findMirrorCharacter(char ch){
        if(Character.isDigit(ch)){
            int value =  '9' - ch ;
            return (char) (value + '0');
        }
        int value = 'z' - ch;
        return (char) (value + 'a');
    }
}