class Solution {
    public int nextBeautifulNumber(int n) {
        int ans = n+1;
        while(!isBeautifulNumber(ans)){
            ans++;
        }
    return ans;
    }
    public boolean isBeautifulNumber(int num){
        int freq[] = new int[10];
        int temp = num;
        while(temp!=0){
            int d = temp%10;
            freq[d]++;
            temp/=10;
        }
        for(int i=0;i<10;i++){
            if(freq[i]!=0){
                if(freq[i]!=i) return false;
            }
            else continue;
        }
    return true;
    }
}