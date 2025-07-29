class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int leftHalf = (length+1) / 2;
        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2, nums1);
        int start=0;
        int end = nums1.length;
        while(start<=end){
            int mid1 = (start + end)/2;
            int mid2 = leftHalf - mid1;
            int l1 = (mid1-1>=0) ? nums1[mid1-1] : Integer.MIN_VALUE;
            int l2 = (mid2-1>=0) ? nums2[mid2-1] : Integer.MIN_VALUE;
            int r1 = (mid1<nums1.length) ? nums1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2<nums2.length) ? nums2[mid2] : Integer.MAX_VALUE;
            if(l1<=r2 && l2<=r1){
                if(length%2==0){
                    return ((double)(Math.max(l1,l2)) + (double) (Math.min(r1,r2)) ) /2.0;
                }
                else return (double) Math.max(l1,l2);
            }
            else if(l1>r2) end = mid1-1; 
            else start = mid1+1;
        }
    return 0.0;
    }
}