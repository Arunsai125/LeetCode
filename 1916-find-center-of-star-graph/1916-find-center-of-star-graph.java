class Solution {
    public int findCenter(int[][] edges) {
        int[] incoming = new int[edges.length+2];
        int[] outgoing = new int[edges.length+2];
        for(int i=0;i<edges.length;i++){
            int inValue = edges[i][1];
            int outValue = edges[i][0];
            incoming[inValue]++;
            outgoing[outValue]++;
        }
        int nodesInAndOut=0;
        int ans=0;
        for(int i=1;i<incoming.length;i++){
            int temp = incoming[i] + outgoing[i];
            if(temp > nodesInAndOut){
                ans=i;
                nodesInAndOut = temp;
            }
        }
    return ans;
    }
}