class Solution {
    public int repeatedNTimes(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && A[i] == A[i + 1]) return A[i];
            if (i + 2 < n && A[i] == A[i + 2]) return A[i];
            if (i + 3 < n && A[i] == A[i + 3]) return A[i];
        }
        return -1; 
    }
}