class Solution {
    private static final int modulo = 1_000_000_007;
    public int[] productQueries(int n, int[][] queries) {
        int len = queries.length;
        int[] ans = new int[len];
        List<Integer> powers = new ArrayList<>();
        String str = Integer.toBinaryString(n);
        int pow=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!= '0') powers.add(1<<pow);
            pow++;
        }
        for(int i=0;i<len;i++){
            long product=1;
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j=start;j<=end;j++) product = (product*powers.get(j))%modulo;
            ans[i] = (int) product;
        }
    return ans;
    }
}