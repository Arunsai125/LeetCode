class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1) return nums[0];
        List<Integer> li = new ArrayList<>();
        for(int i : nums) li.add(i);
        while(li.size()!=1){
            List<Integer> newList = new ArrayList<>();
            for(int i=0;i<li.size()-1;i++){
                int val = (li.get(i) + li.get(i+1)) % 10;
                newList.add(val);
            }
            li = newList;
        }
    return li.get(0);
    }
}