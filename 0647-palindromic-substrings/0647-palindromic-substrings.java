class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int oddCount = findCount(s,i,i);
            int evenCount = findCount(s,i,i+1);
            ans += oddCount;
            ans += evenCount;
        }
    return ans;
    }
    public int findCount(String str, int left, int right){
        int count=0;
        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            count++;
            left--;
            right++;
        }
    return count;
    }
}