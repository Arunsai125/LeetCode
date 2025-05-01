class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        ans[index[0]] = nums[0];
        for(int i=1;i<nums.length;i++){
            int ind = index[i];
            int val = nums[i];
            if(ans[ind]==-1) ans[ind] = val;
            else{
                for(int j=ans.length-1;j>=ind+1;j--){
                    ans[j] = ans[j-1];
                }
            ans[ind] = val;
            } 
        }
    return ans;
    }
}