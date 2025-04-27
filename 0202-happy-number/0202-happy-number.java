class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen=new HashSet<>();

        while(true){
            int res=0;

            while(n>0){
                int rem=n%10;
                res+=rem*rem;
                n=n/10;
            }

            if(seen.contains(res)){
                return false;
            }
            else{
                seen.add(res);
            }

            n=res;

            if(n==1){
                return true;
            }
        }
    }
}