class Solution {
    public int pivotInteger(int n) {
        int totalSum = (n*(n+1))/2;
        int start=1;
        int end=n;
        while(start<=end){
            int mid = ( start + end ) /2;
            int midSum = (mid*(mid+1))/2;
            if(midSum == totalSum - ((mid - 1) * mid) / 2) return mid;
            else if(midSum < totalSum-midSum) start = mid+1;
            else end=mid-1;
        }
    return -1;
    }
}