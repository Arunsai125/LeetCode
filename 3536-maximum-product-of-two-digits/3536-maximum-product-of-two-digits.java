class Solution {
    public int maxProduct(int n) {
        int[] arr = new int[10];
        int num = n;
        while(num!=0){
            int d = num%10;
            arr[d]++;
            num = num/10;
        }
        int num1=-1;
        int num2=-1;
        for(int i=9;i>=0;i--){
            if(arr[i]>0){
                if(arr[i]>1 && num2==-1) return i*i;
                if(num2!=-1) return i*num2;
                if(num2==-1) num2=i;
            }
        }
    return num1*num2;
    }
}