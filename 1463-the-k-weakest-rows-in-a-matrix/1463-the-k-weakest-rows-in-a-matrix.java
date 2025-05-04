class Pair{
    int a;
    int b;
    public Pair(int a, int b){
        this.a=a;
        this.b=b;
    }
}
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>((n1,n2) -> {
            if(n1.a==n2.a) return n1.b-n2.b;
        return n1.a-n2.a;
        });
        int[] power = new int[mat.length];
        for(int i=0;i<mat.length;i++){
            power[i] = calculatePower(mat[i]);
            pq.add(new Pair(power[i],i));
        }
        int ptr=0;
        while(k!=0){
            k--;
            ans[ptr++] = pq.poll().b;
        }
    return ans;
    }
    public int calculatePower(int[] nums){
        int ans=0;
        for(int i : nums){
            if(i==1) ans++;
            else break;
        }
    return ans;
    }
}