class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ptr1=0;
        int ptr2=n;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i+=2){
            ans[i] = nums[ptr1++];
            ans[i+1] = nums[ptr2++];
        }
    return ans;
    }
}