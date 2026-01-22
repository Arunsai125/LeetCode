class Solution {
    public int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i : nums) list.add(i);
        int ans = 0;
        while(!isSorted(list)){
            ans++;
            int minSum = Integer.MAX_VALUE;
            int index = -1;
            for(int i=0;i<list.size()-1;i++){
                int sum = list.get(i) + list.get(i+1);
                if(sum < minSum){
                    minSum = sum;
                    index = i;
                }
            }
            list.set(index, minSum);
            list.remove(index+1);
        }
    return ans;
    }
    public boolean isSorted(List<Integer> nums){
        for(int i=1;i<nums.size();i++){
            if(nums.get(i) < nums.get(i-1)) return false;
        }
    return true;
    }
}