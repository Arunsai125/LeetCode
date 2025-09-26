class Solution {
    public int triangleNumber(int[] nums) {
        int ans = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int start = j+1;
                int end = n-1;
                int temp=-1;
                while(start<=end){
                    int mid = (start+end) / 2;
                    if(isValidTriangle( nums[mid], nums[i], nums[j])){
                        temp = mid;
                        start = mid + 1;
                    }
                    else end = mid-1;
                }
                if(temp != -1) ans += (temp-j);
            }
        }
    return ans;
    }
    public boolean isValidTriangle(int a, int b, int c){
        return (a+b > c) && (a+c > b) && (b+c > a) ;
    }
}