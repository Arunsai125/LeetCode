class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        Arrays.fill(dp, -1);
    return solve(0, days, costs, days.length, dp);
    }
    public int solve(int i, int[] days, int[] costs, int n, int[] dp){
        if(i >= n) return 0;
        if(dp[i]!=-1) return dp[i];
        int cost_1 = costs[0] + solve(i+1,days,costs,n,dp);
        int j = i;
        int maxCost = days[j] + 7;
        while(j<n && days[j] < maxCost){
            j++;
        }
        int cost_7 = costs[1] + solve(j,days,costs, n, dp);
        j=i;
        maxCost = days[j] + 30;
        while(j<n && days[j] < maxCost){
            j++;
        }
        int cost_30 = costs[2] + solve(j, days, costs, n, dp);
    return dp[i] = Math.min(Math.min(cost_1, cost_7),cost_30);
    }
}