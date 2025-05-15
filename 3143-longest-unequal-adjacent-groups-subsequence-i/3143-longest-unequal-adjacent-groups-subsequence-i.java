class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        if(words.length==1) return new ArrayList<String>(Arrays.asList(words[0]));
        int n = groups.length;
        List<String> ans = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(groups[i+1]!=groups[i]){
                if(ans.isEmpty()) {ans.add(words[i]); ans.add(words[i+1]);}
                else ans.add(words[i+1]);
            }
        }
        if(ans.size()==0) return new ArrayList<String>(Arrays.asList(words[0]));
    return ans;
    }
}