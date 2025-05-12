class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> ans = new ArrayList<>();
        int[] map = new int[10];
        for(int i : digits) map[i]++;
        for(int i=1;i<=9;i++){
            if(map[i]==0) continue;
            map[i]--;
            for(int j=0;j<=9;j++){
                if(map[j]==0) continue;
                map[j]--;
                for(int k=0;k<=8;k+=2){
                    if(map[k]==0) continue;
                    map[k]--;
                    int num = 100*i + 10*j + k;
                    ans.add(num);
                    map[k]++;
                }
                map[j]++;
            }
            map[i]++;
        }
        int[] res = new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i] = ans.get(i);
        }
    return res;
    }
}