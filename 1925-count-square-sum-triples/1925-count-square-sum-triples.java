class Solution {
    public int countTriples(int n) {
        int ans = 0;
        Set<Integer> squares = new HashSet<>();
        for(int i=1;i<=n;i++) squares.add(i*i);
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(squares.contains((i*i) + (j*j))) ans+=2;
            }
        }
    return ans;
    }
}