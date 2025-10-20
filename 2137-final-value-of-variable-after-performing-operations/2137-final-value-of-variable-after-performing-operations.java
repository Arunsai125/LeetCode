class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(String str : operations){
            if(str.indexOf('+') != -1) ans++;
            else ans--;
        }
    return ans;
    }
}