class Solution {
    public String longestSubsequenceRepeatedK(String s, int k) {
        Queue<String> queue = new LinkedList<>();
        String longest = "";
        queue.offer("");
        
        while (!queue.isEmpty()) {
            String current = queue.poll();
            for (char ch = 'a'; ch <= 'z'; ch++) {
                String next = current + ch;
                if (isSubsequenceK(next, s, k)) {
                    longest = next;
                    queue.offer(next);
                }
            }
        }
        
        return longest;
    }
    
    private boolean isSubsequenceK(String sub, String s, int k) {
        int count = 0, j = 0;
        for (char c : s.toCharArray()) {
            if (c == sub.charAt(j)) {
                j++;
                if (j == sub.length()) {
                    count++;
                    j = 0;
                    if (count == k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}