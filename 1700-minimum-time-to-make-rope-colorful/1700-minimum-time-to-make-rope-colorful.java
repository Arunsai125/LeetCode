class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        int time = neededTime[0];
        int max = time;
        int i = 1;
        while(i<colors.length()){
            if(colors.charAt(i)==colors.charAt(i-1)){
                while(i<colors.length() && colors.charAt(i)==colors.charAt(i-1)){
                    time += neededTime[i];
                    max = Math.max(max, neededTime[i]);
                    i++;
                }
                ans += time - max;
                if(i<colors.length()) time = neededTime[i];
                max = time;
                i++;
            }
            else{
                time = neededTime[i];
                max = time;
                i++;
            }
        }
    return ans;
    }
}