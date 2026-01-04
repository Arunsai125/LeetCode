class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int num : nums){
            ans += sumOfDivisors(num);
        }
    return ans;
    }
    public int sumOfDivisors(int num){
        int count = 1;
        int sum = 1;
        for(int i=2;i*i<=num;i++){
            if(num%i == 0){
                sum += i;
                count++;
                if(num/i != i){
                    sum += num/i;
                    count++;
                }
            }
        }
        if(num>1) { count++; sum += num; }
    return count==4 ? sum : 0;
    }
}