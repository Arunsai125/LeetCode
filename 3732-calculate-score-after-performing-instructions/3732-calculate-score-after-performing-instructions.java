class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        boolean[] visited = new boolean[values.length];
        long score=0;
        int start=0;
        while(true){
            if(visited[start]) break;
            String val = instructions[start];
            if(val.equals("jump")){
                visited[start] = true;
                start += values[start];
                if(start<0 || start>=values.length) break;
            }
            else{
                score += values[start];
                visited[start] = true;
                start++;
                if(start>=values.length) break;
            }
        }
    return score;
    }
}