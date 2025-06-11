class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long start = 1;
        long end = 0;
        long ans=-1;
        for(int i : piles){
            end = (long) Math.max(i,end);
        }
        while(start<=end){
            long mid = start + (end-start)/2;
            if(isPossible(piles,h,mid)){
                ans = mid;
                end = mid-1; 
            }
            else start = mid+1;
        }
    return (int)ans;
    }
    public boolean isPossible(int[] nums, int target, long val){
        long ans=0;
        for(int i : nums){
            if(i%val==0) ans += (long)i/val;
            else ans += (long)i/val + 1;
        }
    return ans<=target;
    }
}