class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[10001];
        for(int i : nums) arr[i]++;
        int[] ans = new int[2];
        for(int i=1;i<=nums.length;i++){
            if(arr[i]==0) ans[1] = i;
            if(arr[i]==2) ans[0] = i;
        }
    return ans;
    }
}