class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftSumArray = new int[n];
        int[] rightSumArray = new int[n];
        int left=0,leftSum=0;
        int right=n-1,rightSum=0;
        while(left<n){
            leftSumArray[left] = leftSum;
            leftSum += nums[left];
            left++;
        }
        while(right>=0){
            rightSumArray[right] = rightSum;
            rightSum += nums[right];
            right--;
        }
            for(int i=0;i<n;i++){
                if(leftSumArray[i] == rightSumArray[i]) return i;
            }
    return -1;
    }
}