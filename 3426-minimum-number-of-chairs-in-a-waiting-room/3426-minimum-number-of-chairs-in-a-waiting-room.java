class Solution {
    public int minimumChairs(String s) {
        int start = 0;
        int end = s.length();
        int ans = s.length();
        while(start <= end){
            int mid = (start + end) / 2;
            if(isPossible(s, mid)){
                ans = mid;
                end = mid-1;
            }
            else start = mid + 1;
        }
    return ans;
    }
    public boolean isPossible(String str, int target){
        for(int i=0;i<str.length();i++){
            if(target<0) return false;
            if(str.charAt(i) == 'E') target--;
            else target++;
        }
    return target >= 0;
    }
}