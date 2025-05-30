class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        long start = 2;
        long end = num/2;
        while(start<=end){
            long mid = start + (end-start)/2;
            if((int)mid*mid==num) return true;
            else if(mid*mid<num) start = mid+1;
            else end=mid-1;
        }
    return false;
    }
}