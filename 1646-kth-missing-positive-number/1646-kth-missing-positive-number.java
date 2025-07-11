class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = (start + end) / 2;
            int val = arr[mid] - (mid+1);
            if(val < k) start = mid+1;
            else end = mid-1;
        }
    return start + k;
    }
}