class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String,Integer> map = new HashMap<>();
        map.put("electronics",0);map.put("grocery",1);map.put("pharmacy",2);map.put("restaurant",3);
        List<String[]> ans = new ArrayList<>();
        for(int i=0;i<code.length;i++){
            if(isActive[i] && isValidCode(code[i]) && map.containsKey(businessLine[i])){
                ans.add(new String[]{code[i], businessLine[i]});
            }
            else continue;
        }
        Collections.sort(ans, (a,b) -> {
            int cmp = Integer.compare(
                    map.get(a[1]),
                    map.get(b[1])
            );
            if (cmp != 0) return cmp;
            return a[0].compareTo(b[0]);
        });
        List<String> res = new ArrayList<>();
        for (String[] v : ans) {
            res.add(v[0]);
        }
    return res;
    }
    public boolean isValidCode(String str){
        if(str.length() == 0) return false;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch) || ch == '_') continue;
            else return false;
        }
    return true;
    }
}