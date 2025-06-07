class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int i=0;
        while(i<=end){
            if(nums[i]==1) i++;
            else if(nums[i]==0){
                int temp=nums[start];
                nums[start]=nums[i];
                nums[i]=temp;
                start++;
                i++;
            }
            else{
                int temp = nums[end];
                nums[end] = nums[i];
                nums[i] = temp;
                end--;
            }
        }
    }
}