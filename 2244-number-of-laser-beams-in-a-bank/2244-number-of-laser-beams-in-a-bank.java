class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int prev = 0;
        for(String str : bank){
            int count = countOnes(str);
            if(count != 0){
                ans += (count*prev);
                prev = count;
            }
        }
    return ans;
    }
    public int countOnes(String str){
        int res=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1') res++;
        }
    return res;
    }
}