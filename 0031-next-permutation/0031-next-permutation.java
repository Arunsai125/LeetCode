class Solution {
    public void nextPermutation(int[] nums) {
        int bp=-1;
        int n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                bp=i;
                break;
            }
        }
        if(bp==-1) reverse(nums, 0, n-1);
        else{
            int nextSmall = -1;
            for(int i=n-1;i>bp;i--){
                if(nums[i]>nums[bp]){
                    nextSmall = i;
                    int temp = nums[bp];
                    nums[bp] = nums[nextSmall];
                    nums[nextSmall] = temp;
                    break;
                }
            }
            reverse(nums, bp+1, n-1);
        }
    }
    public void reverse(int[] nums, int l, int r){
        while(l<r){
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
    }
}