class Solution {
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1 || nums.length==1) return;
        int k=j+1;
        while(k<nums.length){
            if(nums[k]!=0){
                int temp=nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                j++;
            }
            k++;
        }
    }
}