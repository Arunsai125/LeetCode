class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length()/k;
        if(s.length()%k != 0) n += 1;
        String[] ans = new String[n];
        int ptr=0;
        for(int i=0; i<s.length();i+=k){
            ans[ptr] = s.substring(i, Math.min(i+k, s.length()));
            ptr++;
        }
        if(ans[n-1].length()!=k){
            int val = k-ans[n-1].length();
            for(int i=0;i<val;i++) ans[n-1] = ans[n-1] + fill;
        }
    return ans;
    }
}