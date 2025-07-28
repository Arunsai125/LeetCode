class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1] < nums2[p2]){
                list.add(nums1[p1]);
                p1++;
            }
            else{
                list.add(nums2[p2]);
                p2++;
            }
        }
        while(p1<nums1.length){
            list.add(nums1[p1]);
                p1++;
        }
        while(p2<nums2.length){
            list.add(nums2[p2]);
                p2++;
        }
        if(list.size()%2==0){
            double e1 = (double) list.get(list.size()/2);
            double e2 = (double) list.get(list.size()/2 - 1);
            return (e1 + e2) / 2.0;
        }
    return (double) list.get(list.size()/2);
    }
}