class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> ans = new ArrayList<>();
        int[] dmap = new int[10];
        for(int i : digits) dmap[i]++;
        for(int i=100;i<=998;i+=2){
            String num = String.valueOf(i);
            int temp[] = new int[10];
            temp[num.charAt(0)-'0']++;
            temp[num.charAt(1)-'0']++;
            temp[num.charAt(2) -'0']++;
            boolean flag=true;
            for(int j=0;j<10;j++){
                if(temp[j]>0 && temp[j]>dmap[j]) flag=false;
            }
        if(flag) ans.add(i);
        }
        int[] res = new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i] = ans.get(i);
        }
    return res;
    }
}