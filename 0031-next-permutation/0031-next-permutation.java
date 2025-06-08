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
        if(bp==-1) reverse(nums,0,n-1);
        else{
            for(int i=n-1;i>bp;i--){
                if(nums[i]>nums[bp]){
                    int temp = nums[bp];
                    nums[bp]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            reverse(nums, bp+1, n-1);
        }
    }
    public void reverse(int[] nums, int l, int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}