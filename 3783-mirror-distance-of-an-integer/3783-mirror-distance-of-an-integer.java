class Solution {
    public int mirrorDistance(int n) {
        StringBuilder str = new StringBuilder(String.valueOf(n));
        int rev = Integer.parseInt(str.reverse().toString());
        return Math.abs(n-rev);
    }
}