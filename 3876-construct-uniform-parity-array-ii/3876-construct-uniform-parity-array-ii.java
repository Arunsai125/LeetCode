class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        boolean areAllEven = true;
        for(int i : nums1) {
            min = Math.min(min, i);
            if(i%2==1){
                areAllEven = false;
            }
        }
    return areAllEven || min%2==1;
    }
}