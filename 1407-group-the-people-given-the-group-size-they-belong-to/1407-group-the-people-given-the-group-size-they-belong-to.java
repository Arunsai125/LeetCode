class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            if(!map.containsKey(groupSizes[i])) map.put(groupSizes[i], new ArrayList<>());
        map.get(groupSizes[i]).add(i);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int key : map.keySet()){
            int n = key;
            List<Integer> indices = map.get(key);
            int count = indices.size() / key;
            while(count!=0){
                count--;
                List<Integer> temp = new ArrayList<>();
                while(n!=0){
                    n--;
                    int element = indices.get(indices.size()-1);
                    temp.add(element);
                    indices.remove((Integer)element);
                }
            n=key;
            ans.add(temp);
            }
        }
    return ans;
    }
}