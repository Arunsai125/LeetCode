class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sen : sentences) {
            int spaceCnt = 0;
            for (char ch : sen.toCharArray()) {
                if (ch == ' ') spaceCnt++;
            }
            maxWords = Math.max(maxWords, spaceCnt + 1);
        }
        return maxWords;

    }
}