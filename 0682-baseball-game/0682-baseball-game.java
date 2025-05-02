class Solution {
    public int calPoints(String[] operations) {
        int ans=0;
        List<Integer> list = new ArrayList<>();
        for(String op : operations){
            if(op.equals("+")){
                int last = list.get(list.size()-1);
                int secondLast = list.get(list.size()-2);
                list.add(last+secondLast);
                ans += last+secondLast;
            }
            else if(op.equals("C")){
                ans -= list.get(list.size()-1);
                list.remove(list.get(list.size()-1));
            }
            else if(op.equals("D")){
                ans += 2*list.get(list.size()-1);
                list.add(2*list.get(list.size()-1));
            }
            else {
                list.add(Integer.parseInt(op));
                ans += Integer.parseInt(op);
            }
        }
    return ans;
    }
}