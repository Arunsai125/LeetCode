class Solution {
    public String largestGoodInteger(String num) {
        int ans=-1;
        for(int i=0;i<num.length()-2;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<i+3;j++){
                if(sb.length()==0) sb.append(num.charAt(j));
                else if(sb.charAt(sb.length()-1) != num.charAt(j)) break;
                else sb.append(num.charAt(j));
            }
            if(sb.length()==3) ans = Math.max(ans, Integer.valueOf(sb.toString()));
        }
        if(ans==0) return "000";
        if(ans==-1) return "";
    return String.valueOf(ans);
    }
}