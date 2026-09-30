class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0], nums[1]);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==0){
                list1.add(nums[i]);
                continue;
            }
            if(i==nums.length-1){
                list2.add(nums[i]);
                continue;
            }
            else{
                list1.add(nums[i]);
                list2.add(nums[i]);
            }
        }
        int ans1 = findMax(list1);
        int ans2 = findMax(list2);
    return Math.max(ans1,ans2);
    }
    public int findMax(List<Integer> list){
        int prev2 = list.get(0);
        int prev1 = Math.max(list.get(1), prev2);
        for(int i=2;i<list.size();i++){
            int curr = Math.max(list.get(i) + prev2, prev1);
            prev2 = prev1;
            prev1 = curr;
        }
    return prev1;
    }
}