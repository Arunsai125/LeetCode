class Solution {
    public int minChanges(String s) {
        int  c0=0;
        int c1=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') c0++;
            if(s.charAt(i)=='1') c1++;
            if(i%2==1){
                if(c1==0 || c0==0 | (c1==c0 && c0 % 2==0) ){
                    c1=0;c0=0;
                }
                else{
                    ans+=1;
                    c1=0;
                    c0=0;
                }
            }
        }
    return ans;
    }
}