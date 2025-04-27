class Solution {
    public int hammingDistance(int x, int y) {
        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);
        while (a.length() < b.length()) a = "0" + a;
        while (b.length() < a.length()) b = "0" + b;
        int ans = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)) ans++;
        }
    return ans;
    }
}