class Solution {
    private static final int modulo = 1_000_000_007;
    public int[] productQueries(int n1, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        List<Integer> powers = new ArrayList<>();
        int num=n1;
        int i1=0;
        while(num!=0){
            if((num&1) !=0 ) powers.add((int)Math.pow(2,i1));
            i1++;
            num = num>>1;
        }
        for(int i=0;i<n;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            long product=1;
            for(int j=start;j<=end;j++){
                product = (product * powers.get(j)) % modulo;
            }
        ans[i] = (int)product;
        }
    return ans;
    }
}