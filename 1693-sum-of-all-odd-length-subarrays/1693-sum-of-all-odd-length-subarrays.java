class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            List<Integer> list = new ArrayList<>();
            int sum=0;
            for(int j=i;j<arr.length;j++){
                list.add(arr[j]);
                sum += arr[j];
                if(list.size()%2==1){
                    ans += sum;
                }
            }
        }
    return ans;
    }
}