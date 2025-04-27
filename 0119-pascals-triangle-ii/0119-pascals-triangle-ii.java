class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=0;i<rowIndex;i++){
            long lastElement = (long)list.get(list.size()-1);
            long newElement = (long)( lastElement * (rowIndex-i) / (i+1));
            list.add((int)newElement);
        }
    return list;
    }
}