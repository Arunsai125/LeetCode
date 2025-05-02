class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i=0;i<sentences.length;i++){
            int len = sentences[i].split(" ").length;
            ans = Math.max(ans,len);
        }
    return ans;
    }
}