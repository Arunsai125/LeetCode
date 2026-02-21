class Solution {
    public int countPrimeSetBits(int left, int right) {
        int n = Math.min(right, 10_00_001);
        int[] array = new int[n+1];
        sieveOfEratosthenes(array);
        int ans = 0;
        for(int i=left;i<=right;i++){
            String str = Integer.toBinaryString(i);
            int setBits = noOfSetBits(str);
            if(array[setBits] == 1) ans++;
        }
    return ans;
    }
    public void sieveOfEratosthenes(int[] array){
        Arrays.fill(array, 1);
        int n = array.length;
        array[0] = 0;
        array[1] = 0;
        for(int i=2; i*i <= n; i++){
            if(array[i] == 1){
                for(int j=i*i;j<=n;j+=i){
                    if(j<n) array[j] = 0;
                }
            }
        }
    }
    public int noOfSetBits(String str){
        int ans=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1') ans++;
        }
    return ans;
    }
}