class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int slots1=0;
        int slots2=0;
        long sum1=0;
        long sum2=0;
        for(int i : nums1){
            if(i==0) { slots1++; sum1+=1;}
            else sum1 += i;
        }
        for(int i : nums2){
            if(i==0){ slots2++; sum2+=1;}
            else sum2 += i;
        }
        if(sum1<sum2 && slots1==0 || sum2<sum1 && slots2==0) return -1;
    return Math.max(sum1,sum2);
    }
}