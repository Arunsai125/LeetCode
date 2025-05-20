class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] diffArray = new int[nums.length+1];
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            diffArray[start]+=1;
            diffArray[end+1]-=1;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=diffArray[i];
            if(sum<nums[i]) return false;
        }
    return true;
    }
}