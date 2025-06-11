class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int ans=-1;
        int start=1;
        int end=0;
        for(int i : weights) { end += i; start = Math.max(start, i); }
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(isPossible(weights, days, mid)){
                ans = mid;
                end = mid-1;
            }
            else start = mid + 1;
        }
    return ans;
    }
    public boolean isPossible(int[] nums, int target, int curr){
        int temp = 1;
        int sum=0;
        for(int i : nums){
            if(sum + i <= curr){
                sum+=i;
            }
            else{
                temp++;
                sum = i;
                if(sum>curr){
                    temp += (sum%curr);
                    sum=sum%curr;
                }
            }
        }
    return temp<=target;
    }
}