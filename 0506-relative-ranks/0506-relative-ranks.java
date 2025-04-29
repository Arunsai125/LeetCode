class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer> map = new HashMap<>();
        String[] ans = new String[score.length];
        List<Integer> list = new ArrayList<>();
        for(int i : score) list.add(i);
        Collections.sort(list, (a,b) -> b-a);
        for(int i=0;i<score.length;i++){
            int ind = list.indexOf(score[i]);
            map.put(score[i], ind);
            if(ind==0) ans[i] = "Gold Medal";
            else if(ind==1) ans[i] = "Silver Medal";
            else if(ind==2) ans[i] = "Bronze Medal";
            else ans[i] = String.valueOf(ind+1);
        }
    return ans;
    }
}