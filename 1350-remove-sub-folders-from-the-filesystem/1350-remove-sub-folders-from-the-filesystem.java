class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder, (a,b) -> a.length() - b.length());
        List<String> ans = new ArrayList<>();
        for(String s : folder){
            if(ans.isEmpty()) ans.add(s);
            else{
                int flag=0;
                for(String s1 : ans){
                    StringBuilder sb = new StringBuilder(s1);
                    sb.append('/');
                    if(s.indexOf(sb.toString())==0){
                        flag=1;
                        break;
                    }
                }
                if(flag==0) ans.add(s);
            }
        }
    return ans;
    }
}