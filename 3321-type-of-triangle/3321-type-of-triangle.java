class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]+nums[1]<=nums[2]) return "none";
        int[] arr = new int[101];
        for(int i:nums) arr[i]++;
        for(int i=1;i<=100;i++){
            if(arr[i]==3) return "equilateral";
            if(arr[i]==2) return "isosceles";
        }
    return "scalene";
    }
}