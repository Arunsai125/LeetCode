class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            int num1 = i;
            int num2 = n-i;
            if(doesntContainsZeroes(num1) && doesntContainsZeroes(num2)){
                return new int[]{num1,num2};
            }
        }
        return new int[]{-1,-1};
    }
    public boolean doesntContainsZeroes(int num){
        while(num!=0){
            int d = num%10;
            if(d==0) return false;
            num/=10;
        }
    return true;
    }
}