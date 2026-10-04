class Solution {
    public boolean checkValidString(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return isPossible(s, 0, 0, dp);
    }
    public boolean isPossible(String str, int start, int sum, int[][] dp){
        if(sum<0) return false;
        if(start==str.length()){
            return sum==0;
        }
        if(dp[start][sum] != -1) return dp[start][sum] == 1;
        boolean ans;
        if(str.charAt(start)=='('){
            ans = isPossible(str, start+1, sum+1, dp);
        }
        else if(str.charAt(start)==')'){
            ans =  isPossible(str, start+1, sum-1, dp);
        }
        else{
            ans = isPossible(str, start+1, sum+1, dp) || isPossible(str, start+1, sum-1, dp) || isPossible(str, start+1, sum, dp);
        }
    dp[start][sum] = ans ? 1 : 0;
    return ans;
    }
}