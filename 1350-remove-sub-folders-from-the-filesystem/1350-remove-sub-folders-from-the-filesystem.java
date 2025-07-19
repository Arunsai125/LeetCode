class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        for(String s : folder){
            if(ans.isEmpty()) ans.add(s);
            else{
                    StringBuilder sb = new StringBuilder(ans.get(ans.size()-1));
                    sb.append('/');
                    if(s.indexOf(sb.toString())==0)  continue;
                    else ans.add(s);
            }
        }
    return ans;
    }
}