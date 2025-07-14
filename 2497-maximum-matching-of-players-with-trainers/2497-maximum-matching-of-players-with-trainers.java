class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int p2=0;
        int ans=0;
        for(int p1=0;p1<players.length;p1++){
            if(p2>trainers.length) break;
            while(p1<players.length && p2<trainers.length && players[p1] > trainers[p2]) p2++;
            if(p1<players.length && p2<trainers.length && players[p1] <= trainers[p2]) { p2++; ans++;}
        }
    return ans;
    }
}