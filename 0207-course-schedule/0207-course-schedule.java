class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<numCourses;i++) adjList.add(new ArrayList<>());
        for(int[] dep : prerequisites){
            adjList.get(dep[1]).add(dep[0]);
        }
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(Integer nbr : adjList.get(i)) indegree[nbr]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) q.add(i);
        }
        int count = 0;
        while(!q.isEmpty()){
            Integer top = q.poll();
            count++;
            for(Integer nbr : adjList.get(top)){
                indegree[nbr]--;
                if(indegree[nbr]==0) q.add(nbr);
            }
        }
    return count == numCourses;
    }
}