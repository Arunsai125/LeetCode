class Solution {
    public String pushDominoes(String dominoes) {
        StringBuilder ans = new StringBuilder(dominoes);
        int last_l = -1;
        int last_r = -1;
        for(int i=0;i<dominoes.length();i++){
            char ch = ans.charAt(i);
            if(ch=='L'){
                if(last_r>last_l)
                    doubleDominoPush(last_r+1,i-1,ans);
                else
                    dominoLeftPush(last_l+1,i-1,ans);
            last_l = i;
            }
            else if(ch=='R'){
                if(last_l<last_r) 
                    dominoRightPush(last_r+1,i-1,ans);
            last_r = i;
            }
            else continue;
        }
        if(last_r > last_l) dominoRightPush(last_r+1,ans.length()-1,ans);
    return ans.toString();
    }
    public void doubleDominoPush(int s, int e, StringBuilder ans){
        while(s<e){
            ans.setCharAt(s,'R');
            ans.setCharAt(e,'L');
            s++;
            e--;
        }
    }
    public void dominoLeftPush(int s, int e, StringBuilder ans){
        for(int i=s;i<=e;i++){
            ans.setCharAt(i,'L');
        }
    }
    public void dominoRightPush(int s, int e, StringBuilder ans){
        for(int i=s;i<=e;i++){
            ans.setCharAt(i,'R');
        }
    }
}