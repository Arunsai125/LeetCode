class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int start=0;
        int end=nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                ans = mid;
                end=mid-1;
            }
            else if(nums[mid]<target) start = mid+1;
            else end = mid-1;
        }
        if(ans==-1) return new int[]{-1,-1};
        else{
            res[0] = ans;
            start=0;end=nums.length-1;ans=-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(nums[mid]==target){
                    ans = mid;
                    start=mid+1;
                }
                else if(nums[mid]<target) start = mid+1;
                else end = mid-1;
            }
        res[1] = ans;
        }
    return res;
    }
}