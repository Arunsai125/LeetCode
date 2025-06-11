class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int ans=-1;
        int start=1;
        int end = Integer.MIN_VALUE;
        for(int i : nums) end = Math.max(end, i);
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isPossible(nums, threshold, mid)){
                ans = mid;
                end= mid-1;
            }
            else start = mid+1;
        }
    return ans;
    }
    public boolean isPossible(int[] nums, int target, int curr){
        int temp=0;
        for(int i : nums){
            int val = i/curr;
            if(i%curr == 0){
                temp += val;
            }
            else temp += (val + 1);
        }
    return temp <= target;
    }
}