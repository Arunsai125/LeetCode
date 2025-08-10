class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] freq = new int[10];
        int num = n;
        while(num!=0){
            int d = num%10;
            freq[d]++;
            num/=10;
        }
        for(int i=0;i<31;i++){
            if(canFormPowerOf2((1<<i), freq)) return true;
        }
    return false;
    }
    public boolean canFormPowerOf2(int num, int[] freq){
        int[] freq1 = new int[10];
        while(num!=0){
            int d = num%10;
            freq1[d]++;
            num/=10;
        }
        for(int i=0;i<10;i++){
            if(freq1[i]!=freq[i]) return false;
        }
    return true;
    }
}