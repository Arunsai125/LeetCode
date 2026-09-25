class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<numCourses;i++) adjList.add(new ArrayList<>());
        int[] indegree = new int[numCourses];
        for(int[] pq : prerequisites){
            adjList.get(pq[1]).add(pq[0]);
            indegree[pq[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) q.add(i);
        }
        int[] ans = new int[numCourses];
        int ptr=0;
        while(!q.isEmpty()){
            Integer top = q.poll();
            ans[ptr++] = top;
            for(Integer nbr : adjList.get(top)){
                indegree[nbr]--;
                if(indegree[nbr]==0) q.add(nbr);
            }
        }
        return ptr==numCourses ? ans : new int[]{};
    }
}