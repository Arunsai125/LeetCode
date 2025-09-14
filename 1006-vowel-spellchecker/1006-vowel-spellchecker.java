class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Map<String, List<String>> anagrams = new HashMap<>();
        Map<String, String> patternMap = new HashMap<>();
        for(String str : wordlist){
            String key = str.toLowerCase();
            if(!anagrams.containsKey(key)) anagrams.put(key, new ArrayList<>());
            anagrams.get(key).add(str);
            String pattern = generatePattern(key);
            if(!patternMap.containsKey(pattern)) patternMap.put(pattern, key);
        }
        String[] ans = new String[queries.length];
        int ptr=0;
        for(String str : queries){
            String str2 = str.toLowerCase();
            String pattern = generatePattern(str2);
            if(anagrams.containsKey(str2)){
                List<String> list = anagrams.get(str2);
                if(list.contains(str)) ans[ptr++] = str;
                else ans[ptr++] = list.get(0);
            }
            else if(patternMap.containsKey(pattern)){
                String key = patternMap.get(pattern);
                List<String> list = anagrams.get(key);
                ans[ptr++] = list.get(0);
            }
            else ans[ptr++] = "";
        }
    return ans;
    }
    public String generatePattern(String key){
        StringBuilder pattern = new StringBuilder();
            for(int i=0;i<key.length();i++){
                char ch = key.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    pattern.append('*');
                }
                else pattern.append(ch);
            }
        return pattern.toString();
    }
}