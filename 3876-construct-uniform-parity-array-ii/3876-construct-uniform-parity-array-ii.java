class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        boolean isFirstElementOdd = nums1[0]%2==1;
        if(isFirstElementOdd==true) return true;
        boolean areAllEven = true;
        for(int i : nums1) {
            if(i%2==1){
                areAllEven = false;
                break;
            }
        }
    return areAllEven;
    }
}