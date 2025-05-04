class Solution {
    public int minOperations(int[] nums, int k) {
        int[] arr = new int[101];
        for(int i : nums) {
            if(i<k) return -1;
            else arr[i]++;
        }
        int ans=0;
        for(int i=k+1;i<=100;i++){
            if(arr[i]>0) ans++;
        }
    return ans;
    }
}