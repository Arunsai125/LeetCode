class Solution {
    public int binaryGap(int n) {
        String str = Integer.toBinaryString(n);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1') list.add(i);
        }
        if(list.size() <= 1) return 0;
        int ans = 0;
        for(int i=1;i<list.size();i++){
            ans = Math.max(ans, list.get(i) - list.get(i-1));
        }
    return ans;
    }
}