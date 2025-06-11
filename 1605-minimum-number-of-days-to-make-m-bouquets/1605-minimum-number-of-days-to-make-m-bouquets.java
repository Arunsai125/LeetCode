class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int ans=-1;
        if(bloomDay.length < m*k) return -1;
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for(int i : bloomDay){
            start = Math.min(start,i);
            end = Math.max(end,i);
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isPossible(bloomDay,m,k,mid)){
                ans = mid;
                end=mid-1;
            }
            else start = mid+1;
        }
    return ans;
    }
    public boolean isPossible(int[] nums, int m, int k, int curr){
        int ans=0;
        int c=0;
        for(int i : nums){
            if(i<=curr){
                c++;
                if(c==k){
                    ans++;
                    c=0;
                }
            }
            else c=0;
        }
        if(c==k) ans++;
    return ans >= m;
    }
}