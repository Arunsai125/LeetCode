class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] array = new int[26];
        for(char ch : tasks) array[ch-'A']++;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i : array){
            if(i>0) pq.add(i);
        }
        int ans=0;
        while(!pq.isEmpty()){
            int temp=0;
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n+1;i++){
                if(!pq.isEmpty()){
                    int top = pq.poll();
                    top--;
                    temp++;
                    if(top>0) list.add(top);
                }
            }
            for(Integer ele : list) {
                pq.add(ele);
            }
            if(pq.isEmpty()){
                ans += temp;
                break;
            }
            else{
                ans += (n+1);
            }
        }
    return ans;
    }
}