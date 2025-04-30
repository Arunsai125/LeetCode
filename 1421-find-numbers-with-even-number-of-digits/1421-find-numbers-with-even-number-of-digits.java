class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i:nums){
            if(isEven(i)) ans++;
        }
    return ans;
    }
    public boolean isEven(int num){
        int c=0;
        while(num!=0){
            num/=10;
            c++;
        }
    return c%2==0;
    }
}