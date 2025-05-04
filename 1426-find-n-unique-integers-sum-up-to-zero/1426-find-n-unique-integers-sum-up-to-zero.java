class Solution {
    public int[] sumZero(int n) {
        if(n==1) return new int[]{0};
        int[] ans = new int[n];
        int[] num = new int[n/2];
        for(int i=0;i<num.length;i++){
            num[i] = num.length-i;
        }
        if(n%2==0){
                for(int i=0;i<ans.length;i++){
                    if(i<ans.length/2) ans[i] = -1*(num[i]);
                    else ans[i] = -1*ans[i- ans.length/2];
                }
        }
        else{
            for(int i=0;i<ans.length;i++){
                if(i<ans.length/2){
                    ans[i] = -1 * (num[i]);
                }
                else if(i==ans.length/2) ans[i] = 0;
                else ans[i] = num[i%num.length];
            }
        }
    return ans;
    }
}