class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int onesCount = 0;
        for(int i : nums) if(i==1) onesCount++;
        if(onesCount > 0) return n - onesCount;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int gcd = nums[i];
            for(int j=i+1;j<n;j++){
                gcd = gcd(gcd, nums[j]);
                if(gcd==1){
                    ans = Math.min(ans, j-i+1);
                }
            }
        }
        if(ans == Integer.MAX_VALUE) return -1;
        // (ans-1) + (n-1)
    return n+ans-2;
    }
    public int gcd(int a, int b){
        while(a!=0 && b!=0){
            if(a>b) a = a%b;
            else b = b%a;
        }
    return a==0 ? b : a;
    }
}