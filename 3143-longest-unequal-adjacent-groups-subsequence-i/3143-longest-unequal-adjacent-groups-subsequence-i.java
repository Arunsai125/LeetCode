class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n = groups.length;
        List<String> ans = new ArrayList<>(Arrays.asList(words[0]));
        for(int i=0;i<n-1;i++){
            if(groups[i+1]!=groups[i]) ans.add(words[i+1]);
        }
    return ans;
    }
}