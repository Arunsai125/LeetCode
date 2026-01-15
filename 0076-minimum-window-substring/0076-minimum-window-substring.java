class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[] hash = new int[256];
        for(int i=0;i<m;i++){
            hash[t.charAt(i)]++;
        }
        int right=0;
        int count=0;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        int left=0;
        while(right<s.length()){
            if(hash[s.charAt(right)] > 0) count++;
            hash[s.charAt(right)]--;
            while(count==m){
                if(ans > right-left+1){
                    ans = right-left+1;
                    index = left;
                }
                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)] > 0) count--;
                left++;
            }
            right++;
        }
    return index == -1 ? "" : s.substring(index, index + ans);
    }
}