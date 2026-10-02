class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int[] d : dp) Arrays.fill(d, -1);
    return recursion(text1, text2, text1.length()-1, text2.length()-1, dp);
    }
    public int recursion(String str1, String str2, int l1, int l2, int[][] dp){
        if(l1<0 || l2<0) return 0;
        if(dp[l1][l2] != -1) return dp[l1][l2];
        if(str1.charAt(l1) == str2.charAt(l2)){
            return dp[l1][l2] = 1 + recursion(str1, str2, l1-1, l2-1, dp);
        }
        return dp[l1][l2] = Math.max(recursion(str1,str2, l1-1,l2, dp), recursion(str1,str2, l1,l2-1,dp));
    }
}