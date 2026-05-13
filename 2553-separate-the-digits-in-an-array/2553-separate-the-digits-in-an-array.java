class Solution {
    public int[] separateDigits(int[] nums) {
        int n = 0;
        for(int i : nums){
            n += String.valueOf(i).length();
        }
        int[] ans = new int[n];
        int ptr=0;
        for(int i : nums){
            String str = String.valueOf(i);
            if(str.length()==1) ans[ptr++] = i;
            else{
                for(int j=0;j<str.length();j++){
                    ans[ptr++] = str.charAt(j) - '0';
                }
            }
        }
    return ans;
    }
}