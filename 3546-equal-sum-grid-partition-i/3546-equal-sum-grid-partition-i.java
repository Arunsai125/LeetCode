class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int sum=0;
        for(int[] i : grid){
            for(int j : i) sum+=j;
        }
        //Horizontal Check
        int hsum=0;
        for(int i=0;i<grid.length;i++){
            hsum += calculateSum(grid[i]);
            if(hsum==sum-hsum) return true;
        }
        //Vertical Check
        int vsum=0;
        for(int i=0;i<grid[0].length;i++){
            vsum += findSum(grid, i);
            if(vsum==sum-vsum) return true;
        }
    return false;
    }
    public int calculateSum(int[] nums){
        int ans=0;
        for(int i : nums) ans+=i;
    return ans;
    }
    public int findSum(int[][] nums, int k){
        int ans=0;
        for(int i=0; i<nums.length;i++) ans += nums[i][k];
    return ans;
    }
}