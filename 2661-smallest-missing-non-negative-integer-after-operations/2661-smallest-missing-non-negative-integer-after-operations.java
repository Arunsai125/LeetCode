class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] arr = new int[value];
        for(int i=0;i<nums.length;i++){
            arr[((nums[i] % value) + value) % value]++;
        }
        int ans=0;
        while(arr[ans%value] > 0){
            arr[ans%value]--;
            ans++;
        }
    return ans;
    }
}