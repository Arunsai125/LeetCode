class Solution {
    public int largestPrime(int n) {
        int[] primes = new int[n+1];
        sieve(primes);
        if(n==1) return 0;
        int ans = 0;
        int sum = 0;
        for(int i=2;i<=n;i++){
            if(primes[i]==1){
                sum += i;
                if(sum > n) break;
                if(primes[sum]==1){
                    ans = sum;
                }
            }
        }
    return ans;
    }
    public void sieve(int[] nums){
        Arrays.fill(nums, 1);
        nums[0] = nums[1] = 0;
        int n = nums.length-1;
        for(int i=2;i*i<=n;i++){
            if(nums[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    nums[j] = 0;
                }
            }
        }
    }
}