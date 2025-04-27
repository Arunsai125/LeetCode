class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=1;i<ans.length;i++){
            ans[i] = findNumberOfOnes(i);
        }
    return ans;
    }
    public int findNumberOfOnes(int n){
        int ans=0;
        while(n!=0){
            ans += n&1;
            n >>= 1;
        }
    return ans;
    }
}