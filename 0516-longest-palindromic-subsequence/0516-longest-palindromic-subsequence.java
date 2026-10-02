class Solution {
    public int longestPalindromeSubseq(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int[][] dp = new int[s.length()+1][s.length()+1];
        for(int[] arr : dp) Arrays.fill(arr, -1);
    return recursion(s,s2,s.length()-1, s.length()-1, dp);
    }
    public int recursion(String s1, String s2, int l1, int l2, int[][] dp){
        if(l1<0 || l2<0) return 0;
        if(dp[l1][l2] != -1) return dp[l1][l2];
        if(s1.charAt(l1) == s2.charAt(l2)){
            return dp[l1][l2] = 1 + recursion(s1,s2,l1-1,l2-1,dp);
        }
        return dp[l1][l2] = Math.max(recursion(s1,s2,l1-1,l2,dp), recursion(s1,s2,l1,l2-1,dp));
    }
}