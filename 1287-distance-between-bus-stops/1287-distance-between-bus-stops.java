class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum=0;
        for(int i : distance) sum += i;
        int sum1=0;
        if(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        for(int i=start;i<destination;i++){
            sum1 += distance[i%distance.length];
        }
    return Math.min(sum1, sum-sum1);
    }
}