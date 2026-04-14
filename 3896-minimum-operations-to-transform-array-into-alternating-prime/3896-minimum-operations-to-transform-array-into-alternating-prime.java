class Solution {
    public int minOperations(int[] nums) {
        int[] isPrime = new int[400_001];
        Arrays.fill(isPrime, 1);
        isPrime[0] = 0;
        isPrime[1] = 0;
        for(int i=2;i*i<=isPrime.length;i++){
            if(isPrime[i]==1){
                for(int j=i*i;j<isPrime.length;j+=i){
                    isPrime[j] = 0;
                }
            }
        }
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                if(isPrime[nums[i]]==1) continue;
                else{
                    int start = nums[i]+1;
                    while(start < 400001 && isPrime[start]!=1 ) start++;
                    if(start < 400001) ans += start-nums[i];
                }
            }
            else{
                if(isPrime[nums[i]] == 0) continue;
                else{
                    int start = nums[i]+1;
                    while(start < 400001 && isPrime[start]!=0) start++;
                    if(start < 400001) ans += start-nums[i];
                }
            }
        }
    return ans;
    }
}