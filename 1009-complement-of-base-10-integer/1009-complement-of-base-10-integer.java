class Solution {
    public int bitwiseComplement(int n) {
        int length = Integer.toBinaryString(n).length();
        int mask = (1<<length) - 1;
        return n ^ mask;
    }
}