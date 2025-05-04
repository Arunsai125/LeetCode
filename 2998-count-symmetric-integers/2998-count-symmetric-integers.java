class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;
        for(int j=low;j<=high;j++){
            String temp = String.valueOf(j);
            if(temp.length()%2!=0) continue;
            else{
                int a1=0;
                int a2=0;
                for(int i=0;i<temp.length();i++){
                    if(i<temp.length()/2) a1 += temp.charAt(i) -'0';
                    else a2 += temp.charAt(i) -'0';
                }
            if(a1==a2) ans++;
            }
        }
    return ans;
    }
}