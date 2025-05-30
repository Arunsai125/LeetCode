class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int dist1[] = new int[n];
        int dist2[] = new int[n];
        Arrays.fill(dist1, -1);
        Arrays.fill(dist2, -1);
        traverseNode(edges, dist1, node1);
        traverseNode(edges, dist2, node2);
        int maxDis = Integer.MAX_VALUE;
        int ans = -1;
        for(int i=0;i<n;i++){
            if(dist1[i]!=-1 && dist2[i]!=-1){
                int tempDis = Math.max(dist1[i],dist2[i]);
                if(tempDis < maxDis){
                    ans = i;
                    maxDis = tempDis;
                }
            }
        }
    return ans;
    }
    public void traverseNode(int[] edge, int[] dist, int start){
        int d = 0;
        while(start!=-1 && dist[start]==-1){
            dist[start] = d++;
            start = edge[start];
        }
    }
}