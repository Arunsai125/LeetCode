class Solution 
{
    static final int MOD = 1_000_000_007;
    public int lengthAfterTransformations(String s, int t, List<Integer> nums) 
    {
        int n = 26;
        long[][] T = new long[n][n];
        for (int i = 0; i < n; i++) 
        {
            int spread = nums.get(i);
            for (int j = 1; j <= spread; j++) 
            {
                int next = (i + j) % 26;
                T[i][next] = (T[i][next] + 1) % MOD;
            }
        }
        long[] freq = new long[n];
        for (char c : s.toCharArray()) 
        {
            freq[c - 'a']++;
        }
        long[][] T_pow = matrixPower(T, t);
        long[] result = new long[n];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                result[j] = (result[j] + freq[i] * T_pow[i][j]) % MOD;
            }
        }
        long total = 0;
        for (long val : result)
        {
            total = (total + val) % MOD;
        } 
        
        return (int) total;
    }

    // Matrix exponentiation
    private long[][] matrixPower(long[][] base, int exp) 
    {
        int n = base.length;
        long[][] result = new long[n][n];
        for (int i = 0; i < n; i++)
        {
            result[i][i] = 1;
        } 

        while (exp > 0) 
        {
            if ((exp & 1) == 1)
            {
                result = multiply(result, base);
            } 
            
            base = multiply(base, base);
            exp >>= 1;
        }

        return result;
    }
    private long[][] multiply(long[][] A, long[][] B) 
    {
        int n = A.length;
        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) 
        {
            for (int k = 0; k < n; k++) 
            {
                if (A[i][k] == 0)
                {
                    continue;
                } 
                
                for (int j = 0; j < n; j++) 
                {
                    res[i][j] = (res[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }

        return res;
    }
}