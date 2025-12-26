class Solution {
    public int bestClosingTime(String customers) {
        int ans = 0;
        int n = customers.length();
        int[] prefix = new int[n+1];
        int[] suffix = new int[n+1];
        int c=0;
        for(int i=1;i<=n;i++){
            if(customers.charAt(i-1) == 'N') c++;
            prefix[i] = c;
        }
        c=0;
        for(int i=n-1;i>=0;i--){
            if(customers.charAt(i) == 'Y') c++;
            suffix[i] = c;
        }
        int minPenalty = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            int penalty = prefix[i] + suffix[i];
            if (penalty < minPenalty) {
                minPenalty = penalty;
                ans = i;
            }
        }
        return ans;
    }
}