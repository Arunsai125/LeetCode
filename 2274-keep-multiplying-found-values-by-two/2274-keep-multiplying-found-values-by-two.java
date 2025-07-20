class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int target = original;
        while(doesExist(nums,target)){
            target*=2;
        }
    return target;
    }
    public boolean doesExist(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target) return true;
            else if(nums[mid] < target) start = mid+1;
            else end=mid-1;
        }
    return false;
    }
}