class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int e1=-107;
        int e2=-107;
        int c1=0,c2=0;
        for(int i : nums){
            if(c1==0 && i!=e2){
                c1++;
                e1=i;
            }
            else if(c2==0 && i!=e1){
                c2++;
                e2=i;
            }
            else if(i==e1) c1++;
            else if(i==e2) c2++;
            else {c1--;c2--;}
        }
        c1=0;c2=0;
        for(int i : nums){
            if(i==e1) c1++;
            if(i==e2) c2++;
        }
        if(c1 > nums.length/3) ans.add(e1);
        if(c2 > nums.length/3) ans.add(e2);
    return ans;
    }
}