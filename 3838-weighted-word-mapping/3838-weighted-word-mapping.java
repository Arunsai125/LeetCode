class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            int weight=0;
            for(int i=0;i<word.length();i++){
                char ch = word.charAt(i);
                weight += weights[(ch-'a') + 0];
            }
            weight = weight%26;
            char temp = (char) ((26 - weight-1) + 'a');
        sb.append(temp);
        }
    return sb.toString();
    }
}