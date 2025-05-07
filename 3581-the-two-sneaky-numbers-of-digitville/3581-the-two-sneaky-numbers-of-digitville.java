class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int ans[] = new int[2];
        int ptr=0;
        int[] arr = new int[nums.length-2];
        for(int i : nums){
            arr[i]++;
            if(arr[i]==2) ans[ptr++] = i;
        }
    return ans;
    }
}