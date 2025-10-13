class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for(int i=1;i<words.length;i++){
            String lastWord = ans.get(ans.size()-1);
            if(areAnagrams(lastWord, words[i])) continue;
            else ans.add(words[i]);
        }
    return ans;
    }
    public boolean areAnagrams(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!= arr2[i]) return false;
        }
    return true;
    }
}