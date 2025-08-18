class Solution {
    public String largestGoodInteger(String num) {
        int ans=-1;
        for(int i=0;i<num.length()-2;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<i+3;j++){
                sb.append(num.charAt(j));
            }
            if(sb.charAt(0)==sb.charAt(1) && sb.charAt(1)==sb.charAt(2))
                ans = Math.max(ans, Integer.valueOf(sb.toString()));
        }
        if(ans==-1) return "";
        if(ans==0) return "000";
    return String.valueOf(ans);
    }
}