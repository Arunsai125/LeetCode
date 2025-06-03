class NumArray {
    List<Integer> prefixSum;
    public NumArray(int[] nums) {
        prefixSum = new ArrayList<>();
        int sum = 0;
        for(int i : nums){
            prefixSum.add(sum);
            sum += i;
        }
        prefixSum.add(sum);
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return prefixSum.get(right+1);
     return prefixSum.get(right+1) - prefixSum.get(left);
    }
}
