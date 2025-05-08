class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int ans = 0;
        int c = 0;
        for(int i=0;i<mat.length;i++){
            int count = findCount(mat[i]);
            if(count > c){
                c=count;
                ans = i;
            }
        }
    return new int[]{ans,c};
    }
    public int findCount(int[] nums){
        int ans=0;
        for(int i : nums) ans+=i;
    return ans;
    }
}