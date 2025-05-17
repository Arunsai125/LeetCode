class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int ptr=0;
        while(ptr<=end){
            if(nums[ptr]== 1) ptr++;
            else if(nums[ptr]==0){
                int temp = nums[ptr];
                nums[ptr]=nums[start];
                nums[start]=temp;
                start++;
                ptr++;
            }
            else{
                int temp = nums[end];
                nums[end] = nums[ptr];
                nums[ptr] = temp;
                end--;
            }
        }
    }
}