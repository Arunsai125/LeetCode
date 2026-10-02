class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            String key = sortWord(word);
            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(word);
        }
        for(String key : map.keySet()){
            List<String> temp = map.get(key);
            ans.add(new ArrayList<>(temp));
        }
    return ans;
    }
    public String sortWord(String word){
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}