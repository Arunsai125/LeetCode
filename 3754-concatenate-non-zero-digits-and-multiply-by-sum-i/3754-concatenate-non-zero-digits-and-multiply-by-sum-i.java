class Solution {
    public long sumAndMultiply(int n) {
        long array[] = removeZeroesAndCalculateDigitSum(n);
    return array[0] * array[1];
    }
    public long[] removeZeroesAndCalculateDigitSum(int num){
        long ans = 0l;
        while(num>0){
            while(num%10==0){
                num=num/10;
            }
            int d = num%10;
            ans = ans*10 + d;
            num=num/10;
        }
        long res[] = new long[2];
        while(ans>0){
            long d = ans%10;
            res[1] += d;
            res[0] = res[0]*10 + d;
            ans=ans/10;
        }
    return res;
    }
}